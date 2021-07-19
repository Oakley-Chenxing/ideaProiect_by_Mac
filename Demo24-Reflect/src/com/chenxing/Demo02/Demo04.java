package com.chenxing.Demo02;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Demo04
 * @Description: TODO 获取成员变量并访问
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/18 11:26 下午
 */
public class Demo04 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> stuC = Student.class;
            // 获取所有公有成员变量
//        Field[] fields = stuC.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
            // 获取所有成员变量
//        Field[] dFields = stuC.getDeclaredFields();
//        for (Field dField : dFields) {
//            System.out.println(dField);
//        }

        // 获取指定成员的成员属性(公有的)
//        Field name = stuC.getField("name");
//        System.out.println(name);

        // 获取任意权限的成员属性
//        Field score = stuC.getDeclaredField("score");
//        System.out.println(score);

        Field age = stuC.getDeclaredField("age");



        // 实例化对象
        Student student = stuC.getDeclaredConstructor().newInstance();

        // 权限不足 Student.age(18);
        // 常规方法 student.setAge(89);

        // 利用反射 绕过抑制
        age.setAccessible(true);
        // 设置 student 对象中 age 成员值为189
        age.set(student,189);

        System.out.println(student.getAge());
        // 获取 student 中 age 成员属性值
        System.out.println(age.get(student));




    }

}
