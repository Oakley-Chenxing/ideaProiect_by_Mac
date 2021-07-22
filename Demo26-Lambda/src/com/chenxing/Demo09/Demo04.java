package com.chenxing.Demo09;

import java.util.function.Predicate;

/**
 * @ClassName Demo044
 * @Description: TODO Predicate 判断接口
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 1:22 下午
 */
public class Demo04 {
    public static void main(String[] args) {
        // 匿名内部类
        // Lambda 格式的调用 返回的是一个布尔类型的值
        boolean b = checkString("Hello World This is Oakley!", s -> s.length() > 10);
        System.out.println(b);
        System.out.println("===============================");
        // 做两个条件判断
        boolean b01 = checkString("H", s -> s.length() > 1, s -> s.length() < 100);
        System.out.println(b01);


    }
    private static boolean checkString(String str, Predicate<String> pre){
        return pre.test(str);
       // return !pre.test(str); 逻辑非
   //     return pre.negate().test(str); 等价于上一行
    }
    private static boolean checkString(String str,Predicate<String> pre01,Predicate<String> pre02){
        //return pre01.test(str) && pre02.test(str); // 逻辑与
        return pre01.and(pre02).test(str);
        // 等价于上一行
    }
}
