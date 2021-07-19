package com.chenxing.Demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Demo04
 * @Description: TODO 获取私有成员方法 并 实例化对象
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/18 11:19 下午
 */
public class Demo03 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<Student> stuC = Student.class;

        Constructor<Student> dcon = stuC.getDeclaredConstructor(String.class, String.class, int.class, float.class);
        // 通过要抑制权限检测的对象调用Accessible true 表示开启 false 表示关闭
        dcon.setAccessible(true);// 抑制权限检测

        Student stu = dcon.newInstance("Bill", "male", 18, 100);

        System.out.println(stu);


    }
}
