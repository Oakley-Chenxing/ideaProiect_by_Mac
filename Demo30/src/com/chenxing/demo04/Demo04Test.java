package com.chenxing.demo04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName Demo04Test
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 06/10/2022 15:38
 */
public class Demo04Test {
    public static void main(String[] args) throws SQLException {
        //通过工具类的静态方法获取单例对象
        JdbcUtilsSing jdbc = JdbcUtilsSing.getInstance();
        // 通过工具类对象 获取连接
        Connection conn = jdbc.getConnection();
        //通过连接对象获取执行 sql 命令的对象
        Statement st = conn.createStatement();
        // 组织sql语句并执行
        String sql = "select `id`, `name`,`sex`,`age`,`score`,`tel`,`classid` from `student`";
        ResultSet rs = st.executeQuery(sql);
        // 处理结果集
        showRes(rs);
        // 释放资源
        jdbc.free(rs,st,conn);

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
