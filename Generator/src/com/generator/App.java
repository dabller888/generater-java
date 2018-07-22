package com.generator;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.JUtils.beanConvert.BeanMapConvert;
import com.JUtils.date.TimestampUtils;
import com.generator.db.ConfigInfo;
import com.generator.db.CopyRight;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.generator.db.DbColumn;
import com.generator.db.DbTable;
import com.generator.db.helper.MysqlDbHelper;

public class App {
    private static List<File> filelist = new ArrayList<File>();

    /**
     * 根据vm目标生成字符串
     *
     * @param fileVMPath
     * @param table
     * @param columns
     * @param copyright
     * @return
     * @throws Exception
     */
    private static String createFile(String fileVMPath, String fileName, DbTable table, List<DbColumn> columns, CopyRight copyright) throws Exception {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty("input.encoding", "UTF-8");
        velocityEngine.setProperty("output.encoding", "UTF-8");
        velocityEngine.setProperty(velocityEngine.FILE_RESOURCE_LOADER_PATH, fileVMPath);
        velocityEngine.init();
        Template template = velocityEngine.getTemplate(fileName);
        VelocityContext velocityContext = new VelocityContext();
        System.out.println(table.getTableName()+"->Data:"+BeanMapConvert.bean2MapObject(table).toString());
        velocityContext.put("table", table);
        velocityContext.put("columns", columns);
        velocityContext.put("copyright", copyright);
        StringWriter stringWriter = new StringWriter();
        template.merge(velocityContext, stringWriter);
        return stringWriter.toString();
    }

    private static void createDir(String destDirName) {
        File dir = new File(destDirName);
        if (!dir.exists()) {// 判断目录是否存在
            //dir.mkdir();
            dir.mkdirs();  //多层目录需要调用mkdirs
        }
    }

    /**
     * 遍历文件
     *
     * @param strPath
     * @return
     */
    private static List<File> getFileList(String strPath) {
        File dir = new File(strPath);
        File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) { // 判断是文件还是文件夹
                    getFileList(files[i].getAbsolutePath()); // 获取文件绝对路径
                } else if (fileName.endsWith("vm")) { // 判断文件名是否以.avi结尾
                    String strFileName = files[i].getAbsolutePath();
                    System.out.println("---" + strFileName);
                    filelist.add(files[i]);
                } else {
                    continue;
                }
            }

        }
        return filelist;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        App app = new App();
        Date startDate = new Date();
        System.out.println("java web代码生成器...");
        //初始化
        File directory = new File("");
        String rootPath = directory.getAbsolutePath();
        String templateDir = rootPath + "/templates";
        String outputDir = rootPath + "/output/" + ConfigInfo.PACKAGE_OUT_PATH.replace('.', '/') + "/";
        createDir(outputDir);

        MysqlDbHelper mysql = new MysqlDbHelper();
        CopyRight copyRight = null;

        //遍历vm文件
        getFileList(templateDir);
        for (File file : filelist) {
            //创建输出目录
            String currentDir = file.getName().substring(0, file.getName().lastIndexOf("."));
            String tmpDir = outputDir + currentDir + "/";
            System.out.println(currentDir + ">>>" + tmpDir);
            File dir = new File(tmpDir);
            if (!dir.exists()) {
                dir.mkdir();
            }

            //读取库中表
            List<DbTable> tables = mysql.getDbTables(ConfigInfo.SCHEMA_NAME);

            for (DbTable t : tables) {
                copyRight = new CopyRight();
                String clsFileName = ConfigInfo.toUpperTitleByClass(t.getTableName());
                copyRight.setFileName(clsFileName + ".java");
                copyRight.setRemark(clsFileName + "类描述");
                copyRight.setCpRemark(ConfigInfo.COPYRIGHT_REMARK);
                copyRight.setAuthor(ConfigInfo.COPYRIGHT_AUTHOR);
                //设置创建时间
                Date now = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                copyRight.setCreateTime(sdf.format(now));
                copyRight.setVersion(ConfigInfo.COPYRIGHT_VERSION);

                String tmpFile = tmpDir + clsFileName + ".java";

                //读取表字段(表结构中加入列集合)
                List<DbColumn> columns = mysql.getTableColumns(t.getTableName(), ConfigInfo.SCHEMA_NAME);

                //生成java文件
                String content = "";
                try {
                    //velocity模板引擎渲染
                    content = createFile(templateDir, file.getName(), t, columns, copyRight);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                FileWriter fw = null;
                try {
                    fw = new FileWriter(tmpFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                PrintWriter pw = new PrintWriter(fw);
                pw.println(content);
                pw.flush();
                pw.close();
            }
        }
        Date endDate = new Date();
        printExcuteTime(startDate, endDate);
    }

    private static void printExcuteTime(Date t1, Date t2) {
        long between = (t2.getTime() - t1.getTime()) / 1000;

        long day1 = between / (24 * 3600);
        long hour1 = between % (24 * 3600) / 3600;
        long minute1 = between % 3600 / 60;
        long second1 = between % 60 / 60;
        //System.out.println(""+day1+"天"+hour1+"小时"+minute1+"分"+second1+"秒");
        System.out.println("java web代码生成器完成,耗时：" + minute1 + "分" + second1 + "秒");
    }

    /**
     * 测试表和表属性信息
     */
    private static void getDbInfo() {
        MysqlDbHelper mysql = new MysqlDbHelper();
        //读取库中表
        List<DbTable> tables = mysql.getDbTables("huanqiu");
        for (DbTable t : tables) {
            System.out.println(t.getTableName());
        }

        //读取表字段
        List<DbColumn> columns = mysql.getTableColumns("huanqiu_users", "huanqiu");
        for (DbColumn c : columns) {
            System.out.println(c.getColumnName());
        }
    }
}
