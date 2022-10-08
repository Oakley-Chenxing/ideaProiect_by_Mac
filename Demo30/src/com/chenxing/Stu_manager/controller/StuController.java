package com.chenxing.Stu_manager.controller;

import com.chenxing.Stu_manager.views.StuPage;

/**
 * @ClassName StuController
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:27
 */
public class StuController {
    /**
     * 学生功能 的总调度器
     * @param a
     */
    public void action(int a) {
        switch (a){
            case 1:
                //int a = StuPage.showSelPage();
                //showAction(a);
                showAction(StuPage.showSelPage());
                //System.out.println("查询功能！~");
                break;
            case 2:
                System.out.println("添加功能！~");
                break;
            case 3:
                System.out.println("修改功能！~");
                break;
            case 4:
                System.out.println("删除功能！~");
                break;
            case 0:
                System.out.println("退出功能！~");
                break;
        }
    }

    /**
     * 查询功能调度器
     * @param a 查询功能序号
     */
    private void showAction(int a) {
        switch (a){
            case 1: // 查询全部
                break;
            case 2: // 学号
                break;
            case 3: // 姓名
                break;
            case 4: // 性别
                break;
            case 5: // 年龄
                break;
            case 6: // 成绩
                break;
            case 7: // 电话
                break;
            case 8: // 班级
                break;
            case 0: // 退出
                break;
        }
    }
}
