package com.chenxing.Demo06;

/**
 * @ClassName JoinTest
 * @Description: TODO join（） 等待这个进程死亡
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 6:11 下午
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread00  = new MyThread("郭德纲");
        MyThread myThread01  = new MyThread("郭麒麟");
        MyThread myThread02  = new MyThread("郭汾阳");

        myThread00.start();// 郭德纲唱完了 其他人才能唱
        myThread00.join();
        myThread01.start();
        myThread02.start();
    }
}
