package com.chenxing.demo05;

import com.chenxing.demo02.JdbcUtils;

import java.sql.*;

/**
 * @ClassName PstTest
 * @Description: TODO 防止 sql 注入问题
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 06/10/2022 16:48
 */
public class PstTest {
    public static void main(String[] args) throws SQLException {
       // readByID("5");
       readByID("' or true or '"); //可以查询到所有的数据 在注册时如果实现 会造成数据库泄露


    }
    /**
     * 根据传进来的 sql 命令 进行增删改
     * @param
     */
    private static void cud(String sql) throws SQLException {

        Connection conn = com.chenxing.demo02.JdbcUtils.getconnection();

        Statement st = conn.createStatement();

        int rows = st.executeUpdate(sql);

        System.out.println(rows + "行 受相应~");

        com.chenxing.demo02.JdbcUtils.free(null,st,conn);

    }

    /**
     * 根据 传进来的 sql 语句进行查询
     * @param
     */
    private static void readByID(String id) throws SQLException {
        // 1.连接
        Connection conn = com.chenxing.demo02.JdbcUtils.getconnection();
        // 先定义要执行的sql语句 其中可以使用 ？- 占位符
        String sql =
                "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `id` = ?";

        // 2.
        //Statement st = conn.createStatement();
        // 使用定义好的 sql语句实例化对象 并字符串化预处理
        PreparedStatement pst = conn.prepareStatement(sql);
        // 占位符绑定 表示给sql语句中的第一个占位符绑定一个值
        pst.setInt(1,Integer.parseInt(id));
        //3.
        // 通过pst对象去执行命令，此时 executeQuery 方法不需要参数，因为在预处理的时候已经指定了要执行的命令
        ResultSet rs = pst.executeQuery();
        //4.
        showRes(rs);
        //5.释放资源
        JdbcUtils.free(rs,pst,conn);

        System.out.println(sql);


    }
//    private static void readByID(String id) throws SQLException {
//        // 1.连接
//        Connection conn = com.chenxing.demo02.JdbcUtils.getconnection();
//        // 2.
//        Statement st = conn.createStatement();
//
//        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` " +
//                "where `id` = '"+ id +"'";
//
//
//        //3.
//        ResultSet rs = st.executeQuery(sql);
//        //4.
//        showRes(rs);
//        //5.释放资源
//        JdbcUtils.free(rs,st,conn);
//
//        System.out.println(sql);
//
//
//    }

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
