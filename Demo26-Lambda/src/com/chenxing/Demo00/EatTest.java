package com.chenxing.Demo00;

/**
 * @ClassName EatTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 6:03 下午
 */
public class EatTest {
    public static void main(String[] args) {
        // Lambda 表达式
        runEat((food)->{
            System.out.println("Lambda 爱吃： "+food);
        });

        // 省略版 Lambda
        // 参数的类型可以省略
        //如果参数有且仅有一个 （） 可以省略不写
        //如果代码块的语句只有一条，可以省略大括号和分号 如果有return 则 一起删除
        runEat(food -> System.out.println("Lambda 省略版喜欢吃： "+food));
    }
    private static void runEat(Eat e){
        e.eat("大虾米");
    }
}
