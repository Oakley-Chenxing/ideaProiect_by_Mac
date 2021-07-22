package com.chenxing.Demo08;

/**
 * @ClassName Demo01
 * @Description: TODO 函数式接口作为参数
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/21 11:59 上午
 */
public class Demo01 {
    public static void main(String[] args) {
        // 匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i + " =我是通过匿名内部类实现的线程");
                }
            }
        });

        // Lambda
        startThread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " =我是通过完整Lambda实现的线程");
            }
        });

        // 简洁 Lambda
        startThread(()-> System.out.println("我是通过简洁Lambda实现的线程"));
    }

    /**
     * Runnable run（函数式接口） 在这里作为参数
     * @param run
     */
    private static void startThread(Runnable run){
        Thread thread = new Thread(run);
        thread.start();

    }
}
