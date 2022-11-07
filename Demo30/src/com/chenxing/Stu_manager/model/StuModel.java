package com.chenxing.Stu_manager.model;

import com.chenxing.Stu_manager.global.Student;
import com.chenxing.Stu_manager.views.StuPage;
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

    /**
     * 根据学生姓名进行查询
     * @param stuName 要查询的学生姓名
     * @return 学生信息集合
     */

    public ArrayList<Student> getStuByName(String stuName) throws SQLException {
        ArrayList<Student> stuList = new ArrayList<>();
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `name`=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,stuName);
        rs = pst.executeQuery();

        // 处理结果集 不是用 if 因为 name 存在 不唯一性
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
     * 根据学生成绩进行查询
     * @param stuScore 要查询的学生成绩
     * @return 对应的学生 信息集合
     */

    public ArrayList<Student> getStuByScore(Float stuScore) throws SQLException {
        ArrayList<Student> stuList = new ArrayList<>();
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `score`=?";
        pst = conn.prepareStatement(sql);
        pst.setFloat(1,stuScore);
        rs = pst.executeQuery();

        // 处理结果集 不是用 if 因为 score 存在 不唯一性
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
     * 根据学生电话号码进行查询
     * @param stuTel 要查询的学生 电话号码
     * @return 对应学生 信息集合
     */
    public ArrayList<Student> getStuByTel(String stuTel) throws SQLException {
        ArrayList<Student> stuList = new ArrayList<>();
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `tel`=? ";
        pst = conn.prepareStatement(sql);
        pst.setString(1,stuTel);
        rs = pst.executeQuery();

        // 处理结果集 不是用 if 因为 score 存在 不唯一性
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
     * 根据学生的性别进行查询
     * @param stuSex 学生的性别
     * @return 对应的学生性别集合
     */
    public ArrayList<Student> getStuBySex(String stuSex) throws SQLException {
        ArrayList<Student> stuList = new ArrayList<>();
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `sex`=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,stuSex);
        rs = pst.executeQuery();

        // 处理结果集 不是用 if 因为 score 存在 不唯一性
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
     * 根据学生班级名进行查询
     * @param stuClassid 学生班级名
     * @return 对应的学生信息集合
     */
    public ArrayList<Student> getStuByClassid(String stuClassid) throws SQLException {
        ArrayList<Student> stuList = new ArrayList<>();
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `classid`=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,stuClassid);
        rs = pst.executeQuery();

        // 处理结果集 不是用 if 因为 score 存在 不唯一性
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
     * 根据学生年龄进行查询
     * @param age
     * @return 对应的信息集合
     */
    public ArrayList<Student> getStuByStuage(int age) throws SQLException {

        ArrayList<Student> stuList = new ArrayList<>();
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `age`=?";
        pst = conn.prepareStatement(sql);
        pst.setInt(1,age);
        rs = pst.executeQuery();

        // 处理结果集 不是用 if 因为 score 存在 不唯一性
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
     * 根据年龄区间进行查询
     * @param age 年领区间 age[0] 最小值 age[1] 最大值
     * @return 对应的 学生信息集合
     */
    public ArrayList<Student> getStuByStuage(int[] age) throws SQLException {
        ArrayList<Student> stuList = new ArrayList<>();
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`name`,`sex`,`age`,`score`,`tel`,`classid` from `student` where `age` between ? and ?";
        pst = conn.prepareStatement(sql);
        pst.setInt(1,age[0]);
        pst.setInt(2,age[1]);
        rs = pst.executeQuery();

        // 处理结果集 不是用 if 因为 score 存在 不唯一性
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
     * 添加学员动作
     * @param  addStu 要添加的学员
     * @return true 表示继续添加 false 表示不添加
     */
    public boolean adAddStu(Student addStu) throws SQLException {
        if (null == addStu)
            return false;

        ArrayList<Student> stuList = new ArrayList<>();

        conn = JdbcUtils.getconnection();

        String sql = "insert into `student`(`name`,`sex`,`age`,`score`,`tel`,`classid`) value (?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,addStu.getName());
        pst.setString(2,addStu.getSex());
        pst.setInt(3,addStu.getAge());
        pst.setFloat(4,addStu.getScore());
        pst.setString(5,addStu.getTel());
        pst.setString(6,addStu.getClassid());

        int rows = pst.executeUpdate();
        // 插入成功的反馈
        // 1 调用控制器来 告诉控制器插入成功 让控制器去调用页面
        // 2 通过当前的模型层 直接调用页面 输出成功信息
        if (rows > 0)
            StuPage.success("学生添加成功");
        else
            StuPage.failed("学员添加失败");

        JdbcUtils.free(rs,pst,conn);

        return true;

    }

    /**
     * 执行删除动作
     * @param delStuID 要删除的学员ID
     */
    public void doDelStu(int delStuID) throws SQLException {
        conn = JdbcUtils.getconnection();

        String sql = "delete from `student` where `id`=?";
        pst = conn.prepareStatement(sql);
        pst.setInt(1,delStuID);

        int rows = pst.executeUpdate();

        if (rows > 0)
            StuPage.success("学生删除成功");
        else
            StuPage.failed("学员删除失败");


        JdbcUtils.free(rs,pst,conn);

    }

    /**
     * 更新学员信息
     * @param updateStu 新的学员信息
     */

    public void doUpdateStu(Student updateStu) throws SQLException {
        conn = JdbcUtils.getconnection();

        String sql = "update `student` set " +
                "`name` = ?," +
                "`sex`=?," +
                "`age`=?," +
                "`score`=?," +
                "`tel`=?," +
                "`classid`=?" +
                "where `id`=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,updateStu.getName());
        pst.setString(2,updateStu.getSex());
        pst.setInt(3,updateStu.getAge());
        pst.setFloat(4,updateStu.getScore());
        pst.setString(5,updateStu.getTel());
        pst.setString(6,updateStu.getClassid());
        pst.setInt(7,updateStu.getId());

        int rows = pst.executeUpdate();

        if (rows > 0)
            StuPage.success("学生修改成功");
        else
            StuPage.failed("学员修改失败");


        JdbcUtils.free(rs,pst,conn);

    }
}
