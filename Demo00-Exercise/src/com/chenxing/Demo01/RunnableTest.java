package com.chenxing.Demo01;

/**
 * @ClassName RunnableTest
 * @Description: TODO 练习 Runnable 的实现
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/21 11:52 上午
 */
public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread window00 = new Thread(mr, "大栅栏");
        Thread window02 = new Thread(mr, "前门");

        window00.start();
        window02.start();

    }
}
