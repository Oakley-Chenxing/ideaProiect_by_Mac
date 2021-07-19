package com.chenxing.Demo02;

import java.lang.reflect.Constructor;

/**
 * @ClassName Demo01
 * @Description: TODO 构造方法的获取
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/18 5:29 下午
 */
public class Demo01 {
    public static void main(String[] args) throws NoSuchMethodException {

        Class<Student> stuC = Student.class;

        // 获取当前类中所有共有的构造方法
//        Constructor<?>[] cons = stuC.getConstructors();
//        for (Constructor<?> con : cons) {
//            System.out.println(con);
//        }

        // 获取当前类中 所有构造方法
//        Constructor<?>[] dcons = stuC.getDeclaredConstructors();
//        for (Constructor<?> dcon : dcons) {
//            System.out.println(dcon);
//        }

        // 获取所有的公有无参的构造方法 获取不到则返回异常
//        Constructor<Student> con = stuC.getConstructor();
//        System.out.println(con);

        // 获取带参的公有构造方法 注意参数类型后面添加 class.
//        Constructor<Student> scon = stuC.getConstructor(String.class);
//        System.out.println(scon);

        // 获取当前类中 任意权限的构造方法
       Constructor<Student> constructor = stuC.getDeclaredConstructor(String.class, String.class, int.class, float.class);
//        Constructor<Student> constructor = stuC.getConstructor(String.class, String.class, int.class, float.class); 只能获取私有的
        System.out.println(constructor);

    }

}
