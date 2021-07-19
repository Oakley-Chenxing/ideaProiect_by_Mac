package com.chenxing.Demo01;

/**
 * @ClassName MyThread
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 3:40 下午
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("i = " + i);
        }

    }
}
