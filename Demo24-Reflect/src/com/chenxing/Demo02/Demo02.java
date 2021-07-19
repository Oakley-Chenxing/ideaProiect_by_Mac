package com.chenxing.Demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Demo02
 * @Description: TODO 获取构造方法并实例化对象
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/18 11:13 下午
 */
public class Demo02 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        // 获取Student类的Class对象
        Class<Student> stuC = Student.class;
        // 根据Class 对象获取公有的带参构造方法
        Constructor<Student> con = stuC.getConstructor(String.class);
        // 用构造方法对象调用 newInstance 方法实例化对象，构造方法实例化传给newInstance
        Student stu = con.newInstance("Andy");

        System.out.println(stu.name);
    }
}
