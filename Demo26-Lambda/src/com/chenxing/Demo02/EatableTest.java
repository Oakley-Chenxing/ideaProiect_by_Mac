package com.chenxing.Demo02;

/**
 * @ClassName EatableTest
 * @Description: TODO 吃接口测试类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 5:44 下午
 */
public class EatableTest {
    public static void main(String[] args) {
        // 第一种实现方式 通过继承实现类
        runEat(new EatableImp());
        // 第二种实现方式
        runEat(new Eatable() {
            @Override
            public void eat(String food) {
                System.out.println("匿名内部类爱吃："+food);
            }
        });
        // 第三种 Lambda 实现
        runEat((String food)->{
            System.out.println("Lambda 爱吃："+food);
        });
        // 第四种 多态形式使用
       Eatable e= (String food)->{
            System.out.println("多态 爱吃："+food);
        };
        e.eat("红烧肉");
    }
    private static void runEat(Eatable e){
        e.eat("红烧肉");
    }
}
