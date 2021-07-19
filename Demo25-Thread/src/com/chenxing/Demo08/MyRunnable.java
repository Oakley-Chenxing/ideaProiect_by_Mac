package com.chenxing.Demo08;

/**
 * @ClassName MyRunnable
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 10:15 下午
 */
public class MyRunnable implements Runnable{
    /**
     * 必须重写
     */
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+ " ： "+ i);
        }
    }
}
