package com.chenxing.Demo04;

/**
 * @ClassName Demo04Test01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 5:22 下午
 */
public class Demo04Test01 {
    public static void main(String[] args) {
        EnumD.UP.setDinfo("上上上");// 默认自带的
        EnumD.DOWN.setDinfo("下下下");

        EnumD.LEFT.setDinfo("左左左");
        EnumD.RIGHT.setDinfo("右右右");

        System.out.println(EnumD.UP.getDinfo());
        System.out.println(EnumD.DOWN.getDinfo());
        System.out.println("===============");
        System.out.println(EnumD.LEFT.getDinfo());
        System.out.println(EnumD.RIGHT.getDinfo());
    }
}
