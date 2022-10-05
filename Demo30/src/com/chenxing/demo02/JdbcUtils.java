package com.chenxing.demo02;

import java.sql.*;

/**
 * @ClassName JdbcUtils
 * @Description: TODO 静态方式封装JDBC工具类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 05/10/2022 16:02
 */
public class JdbcUtils {
    private static String URL = "jdbc:mysql://localhost:3306/oakley_data";
    private static String USER = "root";
    private static String PSW = "toortoor";

    //构造方法私有化 - 禁止在类外 进行实例化操作

    private JdbcUtils() {

    }

    // 注册驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");//
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    // 获取链接
    public static Connection getconnection() throws SQLException {
            return DriverManager.getConnection(URL,USER,PSW);
    }
    // 释放资源

    /**
     *
     * @param rs 结果集
     * @param st 执行sql命令的对象
     * @param conn 数据库链接
     */
    public static void free(ResultSet rs, Statement st, Connection conn)  {
        try {
            if (rs != null)
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (conn != null)
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
