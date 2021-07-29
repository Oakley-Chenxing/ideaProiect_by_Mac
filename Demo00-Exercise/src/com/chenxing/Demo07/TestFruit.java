package com.chenxing.Demo07;

/**
 * @ClassName TestFruit
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/28 12:19 下午
 */
public class TestFruit {
    public static void main(String[] args) {
        Fruit f = new Apple(); // 子类实例化父类对象
        f.eat();
        Fruit f01 = new Orange();
        f01.eat();
    }
}
