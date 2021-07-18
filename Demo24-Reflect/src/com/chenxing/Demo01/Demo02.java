package com.chenxing.Demo01;

/**
 * @ClassName Demo02
 * @Description: TODO  反射 获取 Class 类的对象
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> c01 = Student.class; // 最方便
        System.out.println(c01);
        Class<?> c02 = Class.forName("com.chenxing.Demo01.Student");
        System.out.println(c02);// 最灵活
        Class<? extends Student> c03 = new Student().getClass();
        System.out.println(c03);// 最尴尬
    }
}
