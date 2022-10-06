package com.chenxing.demo04;

import java.sql.*;

/**
 * @ClassName JdbcutilsSing
 * @Description: TODO 通过单例模式封装
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 06/10/2022 10:54
 */
public class JdbcUtilsSing {
    private String URL = "jdbc:mysql://localhost:3306/oakley_data";
    private String USER = "root";
    private String PSWD = "toortoor";

    // 定义一个用于返回的当前类对象成员 -- 默认初始化为null
    private static JdbcUtilsSing instance = null;

    // 构造方法私有化 目的是禁止在类外对其进行实例化
    private JdbcUtilsSing (){}

    //注册驱动
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    // 获取当前类的对象
    public static synchronized JdbcUtilsSing getInstance(){
        if (null == instance){
            instance = new JdbcUtilsSing();
        }
        return instance;
    }

    // 获取连接
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PSWD);
    }

    // 释放资源

    /**
     *
     * @param rs 结果集
     * @param st 执行sql命令的对象
     * @param conn 数据库链接
     */
    public  void free(ResultSet rs, Statement st, Connection conn)  {
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

