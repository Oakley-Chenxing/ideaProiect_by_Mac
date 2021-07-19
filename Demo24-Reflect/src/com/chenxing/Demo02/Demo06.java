package com.chenxing.Demo02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName Demo06
 * @Description: TODO 绕过泛型检测
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 12:26 上午
 */
public class Demo06 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ArrayList<Integer> list = new ArrayList<>();

        Class<? extends ArrayList> listC = list.getClass();

        Method add = listC.getMethod("add", Object.class);

        add.invoke(list,"Hello");
        add.invoke(list,3.141f);
        add.invoke(list,1200);
        add.invoke(list,new Student("Andy"));

        System.out.println(list);
    }
}
