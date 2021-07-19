package com.chenxing.Demo02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Demo05
 * @Description: TODO 获取成员方法并调用
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 12:09 上午
 */
public class Demo05 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> stuC = Student.class;
        // 获取当前类 以及 父类 中继承下来的 所有的公有成员方法
//        Method[] methods = stuC.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

        // 获取当前类中所有的成员方法
//        Method[] declaredMethods = stuC.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }

        // 获取单个的公有成员方法
//        Method methodPub = stuC.getMethod("methodPub");
        Method methodPub = stuC.getMethod("methodPub",String.class);
//        System.out.println(methodPub);
        // 获取私有成员方法 并抑制权限
        Method methodPri = stuC.getDeclaredMethod("methodPri", String.class);
        methodPri.setAccessible(true);

        Student student = stuC.getDeclaredConstructor().newInstance();
        student.methodPub("Hello Pub");// 常规调用
        // 调用 student 中 methodPub 方法传实参
        methodPub.invoke(student,"Hello OK!");

        methodPri.invoke(student,"Hello Okk!");



    }
}
