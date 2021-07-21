package com.chenxing.Demo01;

import java.util.Timer;

/**
 * @ClassName Dmeo01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 4:28 下午
 */
public class Dmeo01 {
    public static void main(String[] args) {
        // 面向对象的编程思想
        MyThread myThread = new MyThread();
        myThread.start();

        // Runnable
        Thread threadbyRun = new Thread(new MyRunnableImp());
        threadbyRun.start();

        // 通过匿名对象调用
        new Thread(new MyRunnableImp()).start();

        // 通过匿名内部类实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是通过匿名内部类实现的线程");
            }
        }).start();

        // 函数式编程思想
        new Thread(()->{
            System.out.println("我是通过 Lambda 实现的线程");
        }).start();



    }
}
