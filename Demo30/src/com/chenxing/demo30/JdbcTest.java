package com.chenxing.demo30;

import java.sql.*;

/**
 * @ClassName JdbcTest
 * @Description: TODO JDBC 六脉神剑
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 05/10/2022 14:14
 */
public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.注册驱动
        // 1)将 MySQL 的驱动包 copy 到当前工作目录的根目录下
        // 2)在IDEA中设置导入驱动包（.jar）
        // 3)通过代码注册驱动
//        try {
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Hello");
        Class.forName("com.mysql.jdbc.Driver");//
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
                    rs.getObject(1) + "\t" +
                            rs.getObject(2) + "\t" +
                            rs.getObject(3) + "\t" +
                            rs.getObject(4) + "\t" +
                            rs.getObject(5) + "\t" +
                            rs.getObject(6) + "\t" +
                            rs.getObject(7)
            );
        }

        // 6.释放资源
        rs.close();
        st.close();
        conn.close();
    }
}
