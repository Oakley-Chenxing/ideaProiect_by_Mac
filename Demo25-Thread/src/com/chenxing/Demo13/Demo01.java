package com.chenxing.Demo13;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName Demo01
 * @Description: TODO 定时器 Timer
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 4:02 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时器5秒后开始的程序");
            }
        },5000);

    }
}
