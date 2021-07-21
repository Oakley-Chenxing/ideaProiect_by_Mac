package com.chenxing.Demo03;



/**
 * @ClassName Demo03Test
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 7:22 下午
 */
public class Demo03Test {
    public static void main(String[] args) {
        // 匿名内部类调用
        runEat(new Eatable() {
            @Override
            public void eat(String food) {
                System.out.println("匿名内部类爱吃："+food);
            }
        });

        // Lambda 调用
        runEat((String food)->{
            System.out.println("Lambda爱吃："+ food);
        });

        // Lambda 简化版
        runEat(food-> System.out.println("Lambda 简化版爱吃："+food));

        System.out.println("========");

        // 匿名内部类调用
        runCompute(new Computable() {
            @Override
            public Integer compute(Integer a, Integer b) {
                return a+b;
            }
        });
        // Lambda 调用
        runCompute((Integer a,Integer b)->{
            return a-b;
        });
        // Lambda简化版 调用
        runCompute((a,b)->a*b);
    }
    private static  void runEat(Eatable e){
        e.eat("芥末丸");
    }

    private static void runCompute(Computable com){
       Integer res = com.compute(7,8);
       System.out.println("res= "+res);
    }
}
