package com.chenxing.Demo09;

import java.util.function.Consumer;

/**
 * @ClassName Demo02
 * @Description: TODO 是一个消费者接口，针对于数据做一些提取的操作，不需要返回值
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 11:50 上午
 */
public class Demo02 {
    public static void main(String[] args) {
        // 匿名内部类
        operatorString("Oakley ", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("你的名字是："+s);
            }
        });
        // Lambda
        operatorString("oakley-Lambda",(str)->{
            System.out.println("你的名字是: "+str);
        });
        // 反过来 消费 二次消费
        operatorString("Oakley-Lambda",(str)->{
            System.out.println("你的名字反过来是： "+ new StringBuilder(str).reverse());
        });
        // 简洁版 lambda
        operatorString("Hello",(str)-> System.out.println("你的简洁名字是："+str));
        // 调用两个参数
        System.out.println("==============================");
        operatorString("two consumer",
                (str)-> System.out.println(str),
                (str)-> System.out.println(new StringBuilder(str).reverse())
        );


    }
    private static  void operatorString(String str, Consumer<String> con){
        con.accept(str);
    }

    private static void operatorString(String str,Consumer<String>con1,Consumer<String>con2){
//        con1.accept(str);
//        con2.accept(str);
        // 作用相当于上两行
        con1.andThen(con2).accept(str);
    }
}
