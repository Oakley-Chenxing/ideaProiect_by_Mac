package com.chenxing.Demo05;

import java.util.Locale;

/**
 * @ClassName PrintUpperTest
 * @Description: TODO 引用对象中的成员方法 对象::成员方法名
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/21 9:50 上午
 */
public class PrintUpperTest {
    public static void main(String[] args) {
        // 匿名内部类
        runPrint(new Printer() {
            @Override
            public void print(String str) {
                System.out.println(str.toUpperCase());
            }
        });

        // Lambda
        runPrint((String str)->{
            System.out.println(str.toUpperCase());
        });

        // 简洁Lambda
        runPrint(str -> System.out.println(str.toUpperCase() ));

        // 引用对象的实例方法替换 Lambda
        // 后面会用到runPrint(PrintUpperTest::print);
        // 对象::成员方法名 会将所有的形参作为引用方法的实参传递（隐式）
        runPrint(new PrintUpper()::printUpper );

    }
    private static void runPrint(Printer pri){
        pri.print("hello lambda & nba");
    }

    private static void print(String str) {
        System.out.println(str.toUpperCase());
    }
}
