package com.chenxing.Demo02;

/**
 * @ClassName Demo01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 3:46 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        MyThread myThread00 = new MyThread("线程00");
        MyThread myThread01 = new MyThread("线程01");
        MyThread myThread02 = new MyThread();

        myThread02.setName("线程02");

        // 启动线程
        myThread00.start();
        myThread01.start();
        myThread02.start();
    }
}
