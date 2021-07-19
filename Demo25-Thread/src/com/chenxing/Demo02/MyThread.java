package com.chenxing.Demo02;

/**
 * @ClassName MyThread
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 3:44 下午
 */
public class MyThread extends Thread{
    // 注意 有参和无参的方法都要设定
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName()+": i= "+i);
        }
    }
}
