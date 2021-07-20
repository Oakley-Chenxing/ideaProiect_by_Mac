package com.chenxing.Demo13;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName Demo02
 * @Description: TODO Timer VS Thread
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 4:03 下午
 */
public class Demo02 {
    public static void main(String[] args) {
        // 匿名内部类创造线程 Thread00
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+": " + i );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        // 创建Timer
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName()+": "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.gc();// 告诉JVM Timer 已经运行完成 可以回收了

            }
        },5000);

}
}
