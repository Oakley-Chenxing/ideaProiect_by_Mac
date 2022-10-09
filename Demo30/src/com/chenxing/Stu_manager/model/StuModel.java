package com.chenxing.Stu_manager.model;

import com.chenxing.Stu_manager.global.Student;
import com.chenxing.demo03.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @ClassName StuModel
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:26
 */
public class StuModel {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    /**
     * 获取全部的学员信息
     * @return 全部的学员信息集合
     */
    public ArrayList<Student> getAllStu() throws SQLException {
        ArrayList<Student> stuList = new ArrayList<>();

        // 通过 JDBC 从数据库里面查询数据
//        Connection conn = JdbcUtils.getconnection();
//        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student`";
//        PreparedStatement pst = conn.prepareStatement(sql);
//        ResultSet rs = pst.executeQuery();
          conn = JdbcUtils.getconnection();
          String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student`";
          pst = conn.prepareStatement(sql);
          rs = pst.executeQuery();

        // 处理结果集
        while (rs.next()){
            stuList.add(
                    new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("sex"),
                            rs.getInt("age"),
                            rs.getFloat("score"),
                            rs.getString("tel"),
                            rs.getString("classid")
                    )
            );
        }

        JdbcUtils.free(rs,pst,conn);

        return stuList;
    }

    /**
     * 根据 id 进行查询
     * @return 查询结果
     * @param stuID 要查询的学员 ID
     */

    public ArrayList<Student> getStuByID(int stuID) throws SQLException {
        ArrayList<Student> stuList = new ArrayList<>();
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `id`=?";
        pst = conn.prepareStatement(sql);
        pst.setInt(1,stuID); // 占位符绑定
        rs = pst.executeQuery();

        // 处理结果集
        if (rs.next()){
            stuList.add(
                    new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("sex"),
                            rs.getInt("age"),
                            rs.getFloat("score"),
                            rs.getString("tel"),
                            rs.getString("classid")
                    )
            );
        }
        JdbcUtils.free(rs,pst,conn);
        return stuList;
    }
}
