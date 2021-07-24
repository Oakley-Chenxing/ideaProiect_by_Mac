package com.chenxing.Demo04;

/**
 * @ClassName Demo04Test
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 4:41 下午
 */
public class Demo04Test {
    public static void main(String[] args) {
        System.out.println(EnumD.UP);
        System.out.println(EnumD.DOWN);
        System.out.println(EnumD.RIGHT);
        System.out.println(EnumD.LEFT);
        System.out.println("===============");
        System.out.println(EnumD.UP.getDinfo()+" ==> "+
                EnumD.UP.getData());

    }
}
