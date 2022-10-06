package com.chenxing.demo03;

import com.chenxing.demo02.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName CRUD
 * @Description: TODO 增删改查
 * C create
 * R read
 * U Update
 * D Delete
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 06/10/2022 09:12
 */
public class CRUD {
    public static void main(String[] args) throws SQLException {
        //read("select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student`");
        //cud("insert into `student`(`name`,`tel`) value('Daolao','888888')");
        //cud("update `student` set `sex`='1' where `name`='Daolao'");
        cud("delete from `student` where `name`='Daolao'");
    }


    /**
     * 根据传进来的 sql 命令 进行增删改
     * @param
     */
    private static void cud(String sql) throws SQLException {

        Connection conn = JdbcUtils.getconnection();

        Statement st = conn.createStatement();

        int rows = st.executeUpdate(sql);

        System.out.println(rows + "行 受相应~");

        JdbcUtils.free(null,st,conn);

    }

    /**
     * 根据 传进来的 sql 语句进行查询
     * @param
     */
    private static void read(String sql) throws SQLException {
        // 1.连接
        Connection conn = JdbcUtils.getconnection();
        // 2.
        Statement st = conn.createStatement();
        //3.
        ResultSet rs = st.executeQuery(sql);
        //4.
        showRes(rs);
        //5.释放资源
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
