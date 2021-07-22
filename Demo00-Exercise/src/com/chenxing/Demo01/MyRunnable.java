package com.chenxing.Demo01;

/**
 * @ClassName MyRunnable
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/21 11:50 上午
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" :"+i);
        }
    }
}
