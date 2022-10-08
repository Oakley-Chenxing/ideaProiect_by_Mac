package com.chenxing.Stu_manager;

import com.chenxing.Stu_manager.controller.StuController;
import com.chenxing.Stu_manager.views.StuPage;

/**
 * @ClassName StudentManagerMain
 * @Description: TODO 主方法类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:25
 */
public class StudentManagerMain {
    public static void main(String[] args) {
        StuController sc = new StuController();
        // 1.功能选择页面 (获取到用户选择的功能序号)
        //int a = StuPage.funSelPage();
        // 将用户选择的序号 传递给控制器
        // 让控制器进行功能的总体调度
        //sc.action(a);
        while (true){
            sc.action(StuPage.funSelPage());
        }


    }
}
