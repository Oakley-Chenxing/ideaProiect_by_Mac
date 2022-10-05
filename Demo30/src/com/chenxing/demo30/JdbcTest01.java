package com.chenxing.demo30;

import java.sql.*;

/**
 * @ClassName JdbcTest01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 05/10/2022 15:34
 */
public class JdbcTest01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 注册驱动
        // Class.forName("com.mysql.jdbc.Driver");//
        // 2.建立连接
        final String URL = "jdbc:mysql://localhost:3306/oakley_data";
        final String USER = "root";
        final String PSW = "toortoor";
        Connection conn = DriverManager.getConnection(URL,USER,PSW);
        // 3.创建执行SQL语句对象
        Statement st = conn.createStatement();

        // 4.组织并执行
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student`";
        ResultSet rs = st.executeQuery(sql);

        // 5.处理结果
        while(rs.next()){
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

        // 6.释放资源
        rs.close();
        st.close();
        conn.close();
    }


}
