package com.chenxing.demo02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName Demo02Test
 * @Description: TODO 测试静态封装的 JDBC 工具类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 05/10/2022 16:36
 */
public class Demo02Test {
    public static void main(String[] args) throws SQLException {
        // 获取连接
        Connection conn = JdbcUtils.getconnection();
        // 获取执行 sql 语句的对象
        Statement st = conn.createStatement();
        // 组织sql 语句
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student`";
        //执行 sql语句
        ResultSet rs = st.executeQuery(sql);
        // 处理结果集
        showRes(rs);
        // 释放资源
        JdbcUtils.free(rs,st,conn);
    }

    /**
     * 输出结果集
     * @param rs
     */
    private static void showRes(ResultSet rs) throws SQLException {
        while (rs.next()){
            System.out.println(
                    rs.getInt("id") + "\t" +
                            rs.getString("name") + "\t" +
                            rs.getString("sex") + "\t" +
                            rs.getInt("age") + "\t" +
                            rs.getFloat("score") + "\t" +
                            rs.getString("tel") + "\t" +
                            rs.getString("classid")
            );
        }
    }
}
