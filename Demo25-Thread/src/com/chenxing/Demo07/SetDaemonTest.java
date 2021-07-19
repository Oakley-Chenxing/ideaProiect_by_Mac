package com.chenxing.Demo07;

/**
 * @ClassName SetDeamonTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 9:34 下午
 */
public class SetDaemonTest {
    public static void main(String[] args) {
        MyThread mt00 = new MyThread("郭德纲");
        MyThread mt01 = new MyThread("岳云鹏");
        MyThread mt02 = new MyThread("孙越");
        MyThread mt03 = new MyThread("郭麒麟");

        System.out.println("下课了！====================");
// 设置为守护线程
        mt00.setDaemon(true);
        mt01.setDaemon(true);
        mt02.setDaemon(true);
        mt03.setDaemon(true);

        // 开始进程
        mt00.start();
        mt01.start();
        mt02.start();
        mt03.start();

        // 开始主线程
        for (int i = 0; i < 3; i++) {
            System.out.println("师爷开始讲话了");
        }
        System.out.println("上课了！****************");

    }
}
