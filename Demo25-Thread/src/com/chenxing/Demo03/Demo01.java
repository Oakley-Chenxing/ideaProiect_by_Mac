package com.chenxing.Demo03;

/**
 * @ClassName Demo03
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 3:56 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        MyThread myThread00 = new MyThread("线程00");
        MyThread myThread01 = new MyThread("线程01");

        myThread00.start();
        myThread01.start();
        // 获取正在运行的线程对象 先设置
        Thread.currentThread().setName("主方法线程");

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() +": i = "+i);
        }
    }
}
