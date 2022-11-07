package com.chenxing.Stu_manager.controller;

import com.chenxing.Stu_manager.global.User;
import com.chenxing.Stu_manager.model.UserModel;
import com.chenxing.Stu_manager.views.UserPage;

import java.sql.SQLException;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:27
 */
public class UserController {
    private UserModel um = new UserModel();
    /**
     * 用户注册功能的调度器
     * @param a 用户选择的功能
     * @return 登录或者注册成功 返回完整的用户信息  失败返回 null
     */
    public User action(int a) throws SQLException {
        User user = null;
        switch (a){
            case 1: // 登录
                // 通过页面获取一个要登录的对象 只包含用户名和密码
                User loginUser = UserPage.getLoginUser();
                // 通过模型层判断登录的用户是否合法
                user = um.dologin(loginUser);
                if (user == null){
                    UserPage.failed("用户登陆失败！");
                }
                // 如果合法就拿到这个用户的完整信息 并 记录
                // 如果失败就输出一个失败信息
                //System.out.println("登录功能");
                break;
            case 2: // 注册
                // 通过页面获取一个要注册的用户对象，值包含用户名和密码的用户对象（可用）
                User regUser = UserPage.getRegUser();
                // 通过模型层插入用户到数据表，并得到完整的用户信息
                user = um.doReg(regUser);
                //System.out.println("注册功能");
                 break;
            case 0: // 退出
                UserPage.bey();
                System.exit(0);
                //System.out.println("退出功能");
                break;
        }
        return user;
    }
}
