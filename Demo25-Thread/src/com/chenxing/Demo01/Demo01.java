package com.chenxing.Demo01;

/**
 * @ClassName Demo01
 * @Description: TODO 继承Thread的方式实现多线程
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 3:39 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        // 创建线程
        MyThread myThread01 = new MyThread();
        MyThread myThread02 = new MyThread();
        MyThread myThread03 = new MyThread();
        MyThread myThread04 = new MyThread();
        // 启动线程
        myThread01.start();
        myThread02.start();
        myThread03.start();
        myThread04.start();
    }
}
