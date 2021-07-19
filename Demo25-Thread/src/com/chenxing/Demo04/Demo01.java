package com.chenxing.Demo04;

/**
 * @ClassName Demo01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 4:14 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        MyThread myThread00 = new MyThread("线程00");
        MyThread myThread01 = new MyThread("线程01");
        MyThread myThread02 = new MyThread("线程02");

        myThread00.setPriority(Thread.MAX_PRIORITY);
        myThread01.setPriority(Thread.NORM_PRIORITY);
        myThread02.setPriority(Thread.MIN_PRIORITY);

        System.out.println(myThread00.getPriority());
        System.out.println(myThread01.getPriority());
        System.out.println(myThread02.getPriority());

        myThread00.start();
        myThread01.start();
        myThread02.start();

    }
}
