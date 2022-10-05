package com.chenxing.demo30;

/**
 * @ClassName Zi
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 05/10/2022 15:42
 */
public class Zi extends Fu{
    // 构造语句块 在实例化对象的时候会被自动运行
    // 在构造方法之前执行
    {
        System.out.println("我是子类中的构造语句块~");
    }
    // 构造方法 是在实例化对象的时候被自动运行
    // 在构造语句块之后执行
    public Zi(){
        System.out.println("我是子类中的构造方法~");
    }
    // 静态语句块 - 用 static 修饰的语句块
    static{
        System.out.println("我是子类中的静态语句块~");
    }
}
