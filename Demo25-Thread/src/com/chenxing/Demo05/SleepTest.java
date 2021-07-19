package com.chenxing.Demo05;

/**
 * @ClassName SleepTest
 * @Description: TODO 线程休眠测试类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 5:18 下午
 */
public class SleepTest {
    public static void main(String[] args) {
        MyThread thread00 = new MyThread("刘备");
        MyThread thread01 = new MyThread("关羽");
        MyThread thread02 = new MyThread("张飞");
        MyThread thread03 = new MyThread("赵云");

        thread00.start();
        thread01.start();
        thread02.start();
        thread03.start();

    }
}
