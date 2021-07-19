package com.chenxing.Demo08;

/**
 * @ClassName RunnableTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 10:16 下午
 */
public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread thread00 = new Thread(mr,"线程00");
        Thread thread01 = new Thread(mr,"线程01");
        Thread thread02 = new Thread(mr, "线程02");
        Thread thread03 = new Thread(mr,"线程03");

        // 使用匿名内部类实现方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println(Thread.currentThread().getName()+ " ： "+ i);
                }
            }
        },"匿名内部类线程").start();

        thread00.start();
        thread01.start();
        thread02.start();
        thread03.start();

    }
}
