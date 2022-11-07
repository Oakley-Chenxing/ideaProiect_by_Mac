package com.chenxing.Stu_manager.views;

import com.chenxing.Stu_manager.global.User;
import com.chenxing.Stu_manager.model.UserModel;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @ClassName UserPage
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:26
 */
public class UserPage {
    /**
     * 欢迎页面 用户登录注册功能选择
     * @return 功能序号
     */
    public static int welcome() {
        System.out.println("* ****************** *");
        System.out.println("* 欢迎使用学员管理系统 *");
        System.out.println("* 1 - 登录 *");
        System.out.println("* 2 - 注册 *");
        System.out.println("* 0 - 退出 *");
        System.out.println("* ****************** *");

        int a;
        do {
            System.out.println("请输入正确的标号：");
            a = new Scanner(System.in).nextInt();
        }while(a > 2 || a < 0 );
        return a;
    }

    /**
     * 欢迎回来页面
     * @param username 用户名
     */
    public static void welcomeToBack(String username) {
        System.out.println("* **************** *");
        System.out.println("* 欢迎 - " +username+ " - 回来 *");
        System.out.println("* **************** *");
    }

    /**
     * 失败信息页面
     * @param info 失败原因
     */
    public static void failed(String info) {
        System.out.println("用户操作失败， 失败原因: " + info);
    }

    /**
     * 成功信息页面
     * @param info 成功原因
     */
        public static void success(String info) {
            System.out.println("用户操作成功， 成功原因: " + info);
        }

    /**
     * 获取要登录的用户
     * @return 质保函用户名和密码的用户对象
     */
    public static User getLoginUser() {
        System.out.print("请输入用户名：");
        String username = new Scanner(System.in).nextLine();

        System.out.print("请输入密码：");
        String password = new Scanner(System.in).nextLine();
        return new User(username, password);
    }

    /**
     * 获取注册用户信息页面
     * @return 一个质保函用户名和密码的可用注册对象
     */
    public static User getRegUser() throws SQLException {
        UserModel um = new UserModel();
        String username = "";
        String password = "";

        System.out.println("请输入用户名: ");
        username = new Scanner(System.in).nextLine();

        do {
            System.out.print("请输入用可用的户名：");
            username = new Scanner(System.in).nextLine();
            // 如果查询到的不是空，说明用户名已存在
        }while (null != um.selByUserName(username));
        // 模拟 Ajax 做页面无刷新的情况下的数据同步
        // 当退出这个循环的时候，用户名一定是可用的

        do {
            System.out.print("请输入密码：");
            password = new Scanner(System.in).nextLine();
            System.out.print("请确认密码：");
        }while (!password.equals(new Scanner(System.in).nextLine()));
        // 退出这个循环的时候，密码也一定是可用的

        return new User(username, password);
    }

    /**
     * 拜拜页面
     */
    public static void bey() {
        System.out.println("欢迎再次回来！");
    }
}

