package com.chenxing.Stu_manager;

import com.chenxing.Stu_manager.controller.StuController;
import com.chenxing.Stu_manager.controller.UserController;
import com.chenxing.Stu_manager.global.User;
import com.chenxing.Stu_manager.views.StuPage;
import com.chenxing.Stu_manager.views.UserPage;

import java.sql.SQLException;

/**
 * @ClassName StudentManagerMain
 * @Description: TODO 主方法类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:25
 */
public class StudentManagerMain {
    public static void main(String[] args) throws SQLException {
        UserController uc = new UserController();
        StuController sc = new StuController();

        //
        //int a = UserPage.welcome();
        // 通过用户控制器 得到一个用户 或者是null
        User user =uc.action(UserPage.welcome());

        if (null != user){
            UserPage.welcomeToBack(user.getUsername());
        }else {
            UserPage.failed("注册或登录失败！");
            System.exit(-1); // 退出码 -1 表示用户或注册失败退出系统
        }

        // 1.功能选择页面 (获取到用户选择的功能序号)
        //int a = StuPage.funSelPage();
        // 将用户选择的序号 传递给控制器
        // 让控制器进行功能的总体调度
        //sc.action(a);
        while (true){
            sc.action(StuPage.funSelPage(user.getPermission()), user.getPermission());
        }
    }
}
