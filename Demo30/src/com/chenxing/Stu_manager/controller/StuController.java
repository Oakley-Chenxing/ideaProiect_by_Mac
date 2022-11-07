package com.chenxing.Stu_manager.controller;

import com.chenxing.Stu_manager.global.Student;
import com.chenxing.Stu_manager.model.StuModel;
import com.chenxing.Stu_manager.views.StuPage;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @ClassName StuController
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:27
 */
public class StuController {
    private StuModel sm = new StuModel();
    /**
     * 学生功能 的总调度器
     * @param a
     * @param per 权限  0-crud 1-cr 2-r
     */
    public void action(int a, String per) throws SQLException {
        switch (a){
            case 1:
                //int a = StuPage.showSelPage();
                //showAction(a);
                showAction(StuPage.showSelPage());
                //System.out.println("查询功能！~");
                break;
            case 2:
                if ("2".equals(per)
                ) {
                    StuPage.failed("用户权限不足");
                    break;
                }
                //System.out.println("添加功能！~");
                // 从页面获取一个学员对象
                //Student addStu = StuPage.addStuPage();
                // 通过 Model 层将学院对象添加到数据库中
                // 继续添加返回真 true， 停止添加返回假 false
                //boolean b = sm.adAddStu(addStu);
                while(sm.adAddStu(StuPage.addStuPage()));
                break;
            case 3:
                if ("1".equals(per) || "2".equals(per)
                ) {
                    StuPage.failed("用户权限不足");
                    break;
                }
                //System.out.println("修改功能！~");s
                //获取要修改的学生 ID
                int editStuID = StuPage.getStuID();
                //如果没有 提示 失败
                ArrayList<Student> editStu = sm.getStuByID(editStuID);
                if(editStu.isEmpty()){
                    StuPage.failed("要修改的学生不存在~");
                }else {
                    //显示要修改的学生信息
                    //同步要求用户要输入新的学生信息
                    // 获取需改后的学生对象
                    Student updateStu = StuPage.editStu(editStu.get(0));
                    //通过模型层做修改的动作
                    sm.doUpdateStu(updateStu);
                }
                break;
            case 4:
                if ("1".equals(per) || "2".equals(per)
                ) {
                    StuPage.failed("用户权限不足");
                    break;
                }
                //System.out.println("删除功能！~");
                // 获取要删除的学员id
                int delStuID = StuPage.getStuID();
                // 显示要删除的学员信息
                // 通过 Model 层查询学员信息
                ArrayList<Student> delStu = sm.getStuByID(delStuID);
                if (delStu.isEmpty()){
                    StuPage.failed("要删除的学员信息不存在");
                }else {
                    // 显示要删除的学生信息
                    StuPage.showStuList(delStu);
                    // 如果有的话输出确认信息 y 确认删除 n 取消删除
                    // 如果得到的 true 删除  false放弃
                    if (StuPage.delAlert()){
                        // 执行删除动作
                        sm.doDelStu(delStuID);
                    }else{
                        StuPage.failed("放弃删除");
                    }
                }
                // 执行删除动作

                //
                break;
            case 0:
                StuPage.bye();
                System.exit(0);
                //System.out.println("退出功能！~");
                break;
        }
    }

    /**
     * 查询功能调度器
     * @param a 查询功能序号
     */
    private void showAction(int a) throws SQLException {
        switch (a){
            case 1: // 查询全部
                // 通过模型层拿到数据
                // 将拿到的数据展示出来
                StuPage.showStuList(sm.getAllStu());
//                ArrayList<Student> stuList = sm.getAllStu();
//                StuPage.showStuList(stuList);

                break;
            case 2: // 学号
                StuPage.showStuList(sm.getStuByID(StuPage.getStuID()));
//                int stuID = StuPage.getStuID();
//                StuPage.showStuList(sm.getStuByID(stuID));

                break;
            case 3: // 姓名
                // 通过页面获取要查询的学生姓名
                String stuName = StuPage.getStuName();
                // 将查询结果格式化输出
                StuPage.showStuList(sm.getStuByName(stuName));
                break;
            case 4: // 性别 --
                //通过页面获取要查询的学生性别
                String stuSex = StuPage.getStuSex();
                //将查询结果格式化输出
                StuPage.showStuList(sm.getStuBySex(stuSex));
                break;
            case 5: // 年龄
                int ageSelFun = StuPage.getSelAgeFun();
                ageShowAction(ageSelFun);

                break;
            case 6: // 成绩 --
                // 通过页面获取 要查询的学生成绩
                Float StuScore = StuPage.getStuScore();
                // 将查询结果格式化输出
                StuPage.showStuList(sm.getStuByScore(StuScore));
                break;
            case 7: // 电话 --
                // 通过页面获取 要查询学生电话
                String StuTel = StuPage.getStuTel();
                // 将查询结果格式化输出
                StuPage.showStuList(sm.getStuByTel(StuTel));
                break;
            case 8: // 班级
                // 通过页面获取 要查询的学生班级信息
                String StuClassid = StuPage.getStuClassid();
                // 将查询结果格式化输出
                StuPage.showStuList(sm.getStuByClassid(StuClassid));
                break;
            case 0: // 退出
                break;
        }
    }

    /**
     * 年龄查询 依据 调度器
     * @param a 功能序号
     */
    private void ageShowAction(int a) throws SQLException {
        switch (a){
            case 1: // 精确年龄查询
                // 获取一个精确的年龄
                int age = StuPage.getStuage();
                // 通过模型层 获取查询结果
                ArrayList<Student> stuList = sm.getStuByStuage(age);
                // 显示查询结果
                StuPage.showStuList(stuList);
                break;
            case 2: // 区间查询
                // 获取一个年龄区间
                int age1[] = StuPage.getStuAgeBetween(); // 获取 一个年龄数组
                // 通过模型层 获取查询结果
                ArrayList<Student> stuList1 =sm.getStuByStuage(age1); // 此时 age 变成了数组 所以需要方法的重载
                //显示查询结果
                StuPage.showStuList(stuList1);
                break;
            case 0:
                break;
        }
    }
}
