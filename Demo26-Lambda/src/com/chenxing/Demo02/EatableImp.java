package com.chenxing.Demo02;

/**
 * @ClassName EatableImp
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 5:48 下午
 */
public class EatableImp implements Eatable{
    @Override
    public void eat(String food) {
        System.out.println("继承实现类 爱吃： "+food);
    }
}
