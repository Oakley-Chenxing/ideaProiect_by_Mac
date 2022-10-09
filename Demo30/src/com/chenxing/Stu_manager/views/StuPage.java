package com.chenxing.Stu_manager.views;

import com.chenxing.Stu_manager.global.Student;

import java.util.ArrayList;
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

    /**
     * 格式化输出学生让那个信息
     * @param stuList 要输出的学生信息
     */
    public static void showStuList(ArrayList<Student> stuList) {
        String[] sex = {"girl","boy","other"};
        // 制表符
        System.out.printf("┌──────┬────────────┬──────┬──────┬──────┬────────────┬──────────┐\n");
        System.out.printf("│%-6s│%-12s│%-6s│%-6s│%-6s│%-12s│%-10s│\n",
                "ID", "NAME", "SEX", "AGE", "SCORE", "TEL", "CLASSID");
        for (Student stu : stuList) {
            System.out.printf("├──────┼────────────┼──────┼──────┼──────┼────────────┼──────────┤\n");
            System.out.printf("│%-6s│%-12s│%-6s│%-6s│%-6s│%-12s│%-10s│\n",
                    stu.getId(), stu.getName(),
                    sex[Integer.parseInt(stu.getSex())],
                    stu.getAge(), stu.getScore(),
                    stu.getTel(), stu.getClassid());
        }
        System.out.printf("└──────┴────────────┴──────┴──────┴──────┴────────────┴──────────┘\n");

    }

    /**
     * 获取学生ID
     * @return 用户输入的ID
     */
    public static int getStuID() {
        System.out.println("请输入学生的 ID: ");
        return new Scanner(System.in).nextInt();
    }
}
