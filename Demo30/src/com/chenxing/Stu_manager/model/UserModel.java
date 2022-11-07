package com.chenxing.Stu_manager.model;

import com.chenxing.Stu_manager.global.JdbcUtils;
import com.chenxing.Stu_manager.global.User;
import com.chenxing.Stu_manager.views.UserPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName UserModel
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:26
 */
public class UserModel {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    /**
     * 登录校验
     * @param loginUser 要登录的用户 质保函用户名和密码的对象
     * @return 成功 返回完整的用户对象 失败 返回 null
     */
    public User dologin(User loginUser) throws SQLException {
        User user = null;

        // 根据参数的用户名查询用户，如果用户存在则 userTmp 被赋值为完整的用户信息
        // 如果不存在则得到一个null
        User userTmp = selByUserName(loginUser.getUsername());
        if (userTmp != null){
            if (userTmp.getPassword().equals(loginUser.getPassword())){
                user = userTmp; // 可以登录，记录这个可用的用户对象进行返回
            }else {
                UserPage.failed("密码不正确！~");
            }
        }else {
            UserPage.failed("用户名不存在！~");
        }

        return user;
    }

    /**
     * 根据用户名查询
     * @param username 要查询的用户名
     * @return 成功 返回完整的用户对象 失败 返回 null
     */

    public User selByUserName(String username) throws SQLException {
        User user = null;
        conn = JdbcUtils.getconnection();
        String sql = "select `id`,`username`,`password`,`permission` from `user` where `username`=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, username);
        rs = pst.executeQuery();
        if (rs.next()){
            user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("permission")
            );
        }
        JdbcUtils.free(rs, pst, conn);

        return user;
    }

    /**
     * 注册用户的功能
     * @param regUser 只包含用户名和密码的注册用户对象
     * @return 完整的用户信息
     * @throws SQLException
     */
    public User doReg(User regUser) throws SQLException {
        User user = null;

        conn = JdbcUtils.getconnection();

        String sql = "insert into `user`(`username`,`password`) value (?, ?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, regUser.getUsername());
        pst.setString(2, regUser.getPassword());
        int rows = pst.executeUpdate();
        if (rows > 0){
            user = selByUserName(regUser.getUsername());
        }
        JdbcUtils.free(null, pst, conn);

        return user;
    }
}

