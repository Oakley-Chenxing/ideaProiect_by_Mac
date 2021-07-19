package com.chenxing.Demo07;

/**
 * @ClassName MyThread
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 9:28 下午
 */
public class MyThread extends Thread{
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String [] talks={
                "蒸羊羔",
                "蒸熊掌",
                "蒸鹿尾儿",
                "烧花鸭",
                "烧雏鸡",
                "烧子鹅",
                "卤猪",
                "卤鸭",
                "酱鸡",
                "腊肉",
                "松花",
                "小肚儿",
                "晾肉",
                "吃撑啦！"
       };
        for (int i = 0; i < talks.length; i++) {
            System.out.println(Thread.currentThread().getName()+": "+ talks[i]);
        }
    }
}
