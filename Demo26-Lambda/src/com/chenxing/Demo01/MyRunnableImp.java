package com.chenxing.Demo01;

/**
 * @ClassName MyRunnableImp
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 4:30 下午
 */
public class MyRunnableImp implements Runnable{

    @Override
    public void run() {
        System.out.println(
                "我是通过实现接口方式实现的继承！ "
        );
    }
}
