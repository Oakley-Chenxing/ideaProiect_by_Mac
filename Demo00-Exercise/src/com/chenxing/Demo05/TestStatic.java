package com.chenxing.Demo05;

/**
 * @ClassName TestStatic
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/27 1:14 下午
 */
public class TestStatic {
    static void fun(){
        int i =0;
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        TestStatic test01 = new TestStatic();
        test01.fun();

    }
}
