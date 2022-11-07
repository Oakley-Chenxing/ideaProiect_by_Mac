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
     * @param per 用户权限
     */

    public static int funSelPage(String per) {
        String per1 = ""; // 普通管理员的不可用功能
        String per2 = ""; // 普通用户的不可用功能

        switch(per){
            case"1":
                per1 = "(权限不足，不可用)";
                break;
            case"2":
                per2 = "(权限不足，不可用)";
                break;
        }

        System.out.println("* ********************* *");
        System.out.println("* 欢迎使用学员管理系统 *");
        System.out.println("* 1 - 查询 *");
        System.out.println("* 2 - 添加学员功能 *" + per2 );
        System.out.println("* 3 - 修改学员功能 *" + per1 + per2);
        System.out.println("* 4 - 删除学员功能 *" + per1 + per2);
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
        if (stuList.isEmpty()){
            failed("没有找到要查询的数据！");
        }
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
     * 失败页面
     * @param info
     */
    public static void failed(String info) {
        System.out.println("操作失败！原因：" + info);
    }

    /**
     * 操作成功反馈页面
     * @param info 信息
     */
    public static void success(String info) {
        System.out.println("操作成功！原因：" + info);
    }

    /**
     * 获取学生ID
     * @return 用户输入的ID
     */
    public static int getStuID() {
        System.out.println("请输入学生的 ID: ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 再见页面信息输出
     */
    public static void bye() {
        System.out.println("* ******************* *");
        System.out.println("* 再见     欢迎再次使用！ *");
        System.out.println("* ******************* *");
    }

    /**
     * 获取要查询的学生姓名
     * @return 要查询姓名
     */
    public static String getStuName() {
        System.out.println("请输入学生姓名：");
        return new Scanner(System.in).nextLine();
    }

    /**
     * 获取要查询的学生成绩
     * @return 要查询的学生成绩
     */

    public static Float getStuScore() {
        System.out.println("请输入学生成绩：");
        return new Scanner(System.in).nextFloat();
    }

    /**
     * 获取要查询的学生电话
     * @return 要查询的学生电话
     */
    public static String getStuTel() {
        System.out.println("请输入学生电话：");
        return new Scanner(System.in).nextLine();
    }

    /**
     * 获取要查询的学生性别
     * @return 要查询的学生性别
     */
    public static String getStuSex() {
        System.out.println("请输入要查询的学生性别：");
        System.out.println("0 = girl, 1 = boy, 2 = other");
        return new Scanner(System.in).nextLine();
    }

    /**
     * 获取要查询的学生班级名
     * @return 要查询的学生班级名
     */
    public static String getStuClassid() {
        System.out.println("请输入要查询的学生班级名：");
        return new Scanner(System.in).nextLine();
    }

    /**
     * 获取 按照年龄查询的依据
     * @return 功能序号
     */
    public static int getSelAgeFun() {
        System.out.println("* ********************* *");
        System.out.println("* 查询功能选择页面 *");
        System.out.println("* 1 - 精确年龄查询 *");
        System.out.println("* 2 - 年龄区间查询 *");
        System.out.println("* 0 - 退出年龄查询 *");
        System.out.println("* ********************* *");

        int a;
        do {
            System.out.println("请输入正确的功能序号: ");
            a = new Scanner(System.in).nextInt();
        } while (a > 2 || a < 0);
        return a;
    }

    /**
     * 获取学生的年龄
     * @return 学生的年龄
     */
    public static int getStuage() {
        System.out.println("请输入学生的年龄：");
        return new Scanner(System.in).nextInt();
    }

    /**
     * 获取学生年龄的区间
     * @return 年龄区间数组
     */
    public static int[] getStuAgeBetween() {
        int[] age = new int[2];
        System.out.println("请输入年龄的最小值：");
        age[0] = new Scanner(System.in).nextInt();
        System.out.println("请输入年龄的最大值：");
        age[1] = new Scanner(System.in).nextInt();
        return age;

    }

    /**
     * 添加学员页面
     * @return 要添加学员的对象（不包括id的学生对象）
     */
    public static Student addStuPage() {
        System.out.println("* ****************** *");
        System.out.println("* 添加学员页面 *");
        System.out.println("* ****************** *");
        System.out.println("请输入学员姓名: ");
        String name = new Scanner(System.in).nextLine();

        // 如果不想继续添加学员 直接返回空
        if ("exit".equals(name))
            return null;

        System.out.println("请输入学员性别: ");
        System.out.println("1 = boy, 2 = girl, 3 = other ");
        String sex = new Scanner(System.in).nextLine();

        System.out.println("请输入学员年龄: ");
        int age = new Scanner(System.in).nextInt();

        System.out.println("请输入学员成绩: ");
        Float score = new Scanner(System.in).nextFloat();

        System.out.println("请输入学员电话: ");
        String tel = new Scanner(System.in).nextLine();

        System.out.println("请输入学员班级: ");
        String classid = new Scanner(System.in).nextLine();

        return new Student(name,sex,age,score,tel,classid);

    }

    /**
     * 删除确认提示页面
     * @return true 确认删除 flase 放弃删除
     */
    public static boolean delAlert() {
        System.out.println("是否确认删除？ Y: 确认 N: 放弃");
        switch (new Scanner(System.in).next()){
            case "N":
            case "n":
                return false;
            case "Y":
            case "y":
                return  true;
            default:
                failed("输入不正确 ~");
        }
        return false;
    }

    /**
     * 编辑已存在的学员信息
     * @param student 原来的学员信息
     * @return 新的学生对像（完整的学员信息对象 包括id）
     */
    public static Student editStu(Student student) {
        System.out.println("* ****************** *");
        System.out.println("* 修改学员页面 *");
        System.out.println("* ****************** *");
        System.out.println("请输入学员姓名 - ("+student.getName()+"): ");
        String name = new Scanner(System.in).nextLine();

        System.out.println("请输入学员性别 - ("+student.getSex()+"): ");
        System.out.println("1 = boy, 2 = girl, 3 = other ");
        String sex = new Scanner(System.in).nextLine();

        System.out.println("请输入学员年龄 -("+student.getAge()+"): ");
        int age = new Scanner(System.in).nextInt();

        System.out.println("请输入学员成绩: -("+student.getScore()+") ");
        Float score = new Scanner(System.in).nextFloat();

        System.out.println("请输入学员电话: -("+student.getTel()+")");
        String tel = new Scanner(System.in).nextLine();

        System.out.println("请输入学员班级: -("+student.getClassid()+") ");
        String classid = new Scanner(System.in).nextLine();

        return new Student(student.getId(),name,sex,age,score,tel,classid);

    }
}
