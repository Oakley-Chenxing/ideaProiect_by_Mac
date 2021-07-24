package com.chenxing.Demo05;

/**
 * @ClassName Demo05Test
 * @Description: TODO 枚举中的常用方法
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 5:28 下午
 */
public class Demo05Test {
    public static void main(String[] args) {
        System.out.println("输出枚举变量的成员名：" +Deirction05.UP);
        System.out.println("输出枚举变量的成员名：" +Deirction05.UP.name());// 枚举类型的成员方法
        System.out.println("输出枚举项的编号： "+ Deirction05.UP.ordinal());
        System.out.println("=========================");
        Deirction05 wc = Deirction05.valueOf("WC");
        System.out.println(wc.getDirInfo());
        System.out.println(wc.ordinal());
        System.out.println("=========================");
        Deirction05[] values = Deirction05.values();
        for (Deirction05 value : values) {
            System.out.println(value.ordinal() +" "+value+" "+value.getDirInfo()+" "+value.getData());
        }

    }
}
