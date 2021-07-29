package com.chenxing.Demo07;

/**
 * @ClassName Apple
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/28 12:18 下午
 */
public class Apple implements Fruit{ // 定义接口子类
    @Override
    public void eat() { // 重写接口方法
        System.out.println("Andy like eat Apple!");
    }
}
