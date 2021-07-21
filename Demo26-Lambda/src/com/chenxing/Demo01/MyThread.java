package com.chenxing.Demo01;

/**
 * @ClassName MyThread
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 4:27 下午
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("我是通过继承方式实现的线程！");
    }
}
