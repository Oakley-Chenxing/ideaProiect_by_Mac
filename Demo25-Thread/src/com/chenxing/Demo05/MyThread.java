package com.chenxing.Demo05;

/**
 * @ClassName MyThread
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 5:04 下午
 */
public class MyThread extends Thread{
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    /**
     * static void sleep(long ms)
     * 使当前正在执行的线程停留指定的毫秒数
     */
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"正在进行第 " +i+ " 回合");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
