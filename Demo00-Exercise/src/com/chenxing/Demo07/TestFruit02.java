package com.chenxing.Demo07;

/**
 * @ClassName TestFruit02
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/28 12:29 下午
 */
public class TestFruit02 {
    public static void main(String[] args) {
        Fruit f00 = Factory.getInstance("orange");// 通过工厂类取得指定标记的对象
        f00.eat();
    }
}
