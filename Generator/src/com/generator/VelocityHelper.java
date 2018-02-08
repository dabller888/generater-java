package com.generator;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class VelocityHelper {
    private String _tplRoot = "";
    private VelocityContext _context = new VelocityContext();

    public VelocityContext getVelocityContext() {
        return _context;
    }

    public void clear() {
        _context = new VelocityContext();
    }

    public VelocityHelper(String tplRootPath) {
        _initialization("utf-8", "utf-8", tplRootPath);
    }

    public VelocityHelper(String input_encoding, String output_encoding, String tplRootPath) {
        _initialization(input_encoding, output_encoding, tplRootPath);
    }

    public boolean put(String key, Object value) {
        if (_context.containsKey(key) == true) {
            _context.remove(key);
            _context.put(key, value);
        } else {
            _context.put(key, value);
        }
        return true;
    }

    public boolean remove(String key) {
        if (_context.containsKey(key) == false) {
            return false;
        }
        _context.remove(key);
        return true;
    }

    private void _initialization(String input_encoding, String output_encoding, String tplRootPath) {
        /* first, we init the runtime engine.  Defaults are fine. */
        this._tplRoot = tplRootPath == null ? "" : tplRootPath;
        Properties p = new Properties();
        //设置输入输出编码类型。和这次说的解决的问题无关
        p.setProperty(Velocity.INPUT_ENCODING, input_encoding);
        p.setProperty(Velocity.OUTPUT_ENCODING, output_encoding);
        //这里加载类路径里的模板而不是文件系统路径里的模板
        p.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        //也可以用下面方法指定一个绝对路径，不过这样要求你所有的模板都放在该路径下，是有局限的
        //p.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, "模板路径");
        try {
            Velocity.init(p);
        } catch (Exception e) {
            System.out.println("Problem initializing Velocity : " + e);
            e.printStackTrace();
            return;
        }
    }

    public String parseTempalte(String tplName, String encoding) {
        try {
            String tplroot_and_tplName = "";
            if (_tplRoot.trim().length() > 0) {
                tplroot_and_tplName = _tplRoot.trim() + "/" + tplName.trim();
            } else {
                tplroot_and_tplName = tplName.trim();
            }
            tplroot_and_tplName = tplroot_and_tplName.replaceAll("/+", "/");
            StringWriter sw = new StringWriter();
            Velocity.mergeTemplate(tplroot_and_tplName, encoding, _context, sw);
            String res = sw.toString();
            sw.close();
            return res;
        } catch (Exception e) {

            return e.toString();
        }
    }

    public String evaluate(String velocityTplStrContent) {
        try {
            StringWriter sw = new StringWriter();

            Velocity.evaluate(_context, sw, "Use the velocity as str replacer.", velocityTplStrContent);

            String res = sw.toString();
            sw.close();
            return res;
        } catch (Exception e) {
            return e.toString();
        }
    }

    /**
     * 测试VelocityHelper类
     */
    public class testVelocityHelper {
        public void main(String[] args) {
            VelocityHelper _ve = new VelocityHelper("/tpl");
            String str1 = _ve.parseTempalte("test.vm", "utf-8");
            System.out.println(str1);

        }
    }
}
