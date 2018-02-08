package com.generator.db;

import java.sql.*;

/**
 * Created by Administrator on 2017/12/20.
 */
public class MysqlHelper {
    //private static final String Url = "jdbc:mysql://localhost:3306/huanqiu";
    private static final String Url = "jdbc:mysql://localhost:3306/"+ConfigInfo.SCHEMA_NAME;
    private static final String UserName = "root";
    private static final String Passwd = "root";
    private static final String Driver = "com.mysql.jdbc.Driver";

    public MysqlHelper() { }

    //获取mysql链接
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(Driver);//加载mysql驱动
            try {
                con = DriverManager.getConnection(Url, UserName, Passwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    //释放连接资源
    public static void Release(ResultSet rs, PreparedStatement pmt, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (pmt != null) {
            try {
                pmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
