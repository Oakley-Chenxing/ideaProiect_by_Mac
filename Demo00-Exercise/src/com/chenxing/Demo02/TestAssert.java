package com.chenxing.Demo02;

/**
 * @ClassName TestAssert
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 8:17 下午
 */
public class TestAssert {
    public static void main(String[] args) {
        System.out.println("start");
        assert true;
        System.out.println("go on");
        assert false:"stop";
        System.out.println("end");
    }
}
