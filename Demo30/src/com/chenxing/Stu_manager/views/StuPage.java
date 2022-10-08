package com.chenxing.Stu_manager.views;

import java.util.Scanner;

/**
 * @ClassName StuPage
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:26
 */
public class StuPage {
    /**
     * 学生操作功能选择页面 返回正确的选择序号
     * @return
     */

    public static int funSelPage() {
        System.out.println("* ********************* *");
        System.out.println("* 欢迎使用学员管理系统 *");
        System.out.println("* 1 - 查询 *");
        System.out.println("* 2 - 添加学员功能 *");
        System.out.println("* 3 - 修改学员功能 *");
        System.out.println("* 4 - 删除学员功能 *");
        System.out.println("* 0 - 退出系统 *");
        System.out.println("* ********************* *");
        int a;
        do {
            System.out.println("请输入正确的功能序号: ");
            a = new Scanner(System.in).nextInt();
        } while (a > 4 || a < 0);
        return a;
    }

    /**
     * 学生查询功能选择页面
     * @return
     */
    public static int showSelPage() {
        System.out.println("* ********************* *");
        System.out.println("* 查询功能选择页面 *");
        System.out.println("* 1 - 查询全部 *");
        System.out.println("* 2 - 按学号查询 *");
        System.out.println("* 3 - 按姓名查询 *");
        System.out.println("* 4 - 按性别查询 *");
        System.out.println("* 5 - 按年龄查询 *");
        System.out.println("* 6 - 按成绩查询 *");
        System.out.println("* 7 - 按电话查询 *");
        System.out.println("* 8 - 按班级查询 *");
        System.out.println("* 0 - 退出查询 *");
        System.out.println("* ********************* *");

        int a;
        do {
            System.out.println("请输入正确的功能序号: ");
            a = new Scanner(System.in).nextInt();
        } while (a > 8 || a < 0);
        return a;

    }
}
