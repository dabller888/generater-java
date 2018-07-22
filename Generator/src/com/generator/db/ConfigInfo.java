package com.generator.db;

/**
 * Created by Administrator on 2018/1/9.
 */
public class ConfigInfo {
    //db
    public final static String SCHEMA_NAME = "wordpress";
    public final static Boolean PREFIX_TABLE_ENABLE = true;
    public final static String PREFIX_TABLE = "wp_";
    public final static String SEPARATOR_CHAR = "_";

    //生成附加信息
    public final static String PACKAGE_OUT_PATH = "qy.stage";

    //版权信息
    public final static String COPYRIGHT_REMARK = "版权归作者本人所有";
    public final static String COPYRIGHT_AUTHOR = "iceld";
    public final static String COPYRIGHT_VERSION = "v1.0";

    /**
     * 类文件命名（大写开头）
     *
     * @param src
     * @return
     */
    public static String toUpperTitleByClass(String src) {
        String out = "";
        if (src != "" && src != null) {
            if (PREFIX_TABLE_ENABLE) {
                out = toUpperTitle(src.substring(PREFIX_TABLE.length(), src.length()));
            } else {
                out = toUpperTitle(src);
            }
        }

        return out;
    }

    /**
     * 类文件命名(小写开头)
     *
     * @param src
     * @return
     */
    public static String toLowerTitleByClass(String src) {
        String out = "";
        if (src != "" && src != null) {
            if (PREFIX_TABLE_ENABLE) {
                out = toLowerTitle(src.substring(PREFIX_TABLE.length(), src.length()));
            } else {
                out = toLowerTitle(src);
            }
        }

        return out;
    }

    /**
     * 类属性命名
     *
     * @param src
     * @return
     */
    public static String toUpperTitle(String src) {
        String out = "";
        if (src != "" && src != null) {
            if (src.indexOf("_") > 0) {
                String[] arr = src.split(SEPARATOR_CHAR);
                for (String s : arr) {
                    if (s != "" && s != null) {
                        out += s.substring(0, 1).toUpperCase() + s.substring(1, s.length()).toLowerCase();
                    }
                }
            } else {
                out = src.substring(0, 1).toUpperCase() + src.substring(1, src.length()).toLowerCase();
            }
        }
        return out;
    }

    /**
     * 类字段命名
     *
     * @param src
     * @return
     */
    public static String toLowerTitle(String src) {
        String out = "";
        if (src != "" && src != null) {
            if (src.indexOf("_") > 0) {
                String[] arr = src.split(SEPARATOR_CHAR);
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != "" && arr[i] != null) {
                        out += (i == 0 ? arr[i].substring(0, 1).toLowerCase() : arr[i].substring(0, 1).toUpperCase()) + arr[i].substring(1, arr[i].length()).toLowerCase();
                    }
                }
            } else {
                out = src.toLowerCase();
            }
        }
        return out;
    }

}
