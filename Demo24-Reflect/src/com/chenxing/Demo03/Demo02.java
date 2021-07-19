package com.chenxing.Demo03;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName Demo02
 * @Description: TODO 通过配置文件实现不同的程序功能
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 11:48 上午
 */
public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("./ConfigureFile.ini");
        prop.load(fr);
        fr.close();
 //       System.out.println(prop);
//   包名 package com.chenxing.Demo03;

        String classname = prop.getProperty("classname");
        String methodname = prop.getProperty("methodname");

        // System.out.println(classname + ", " + methodname);

        // 通过反射来调用
        // 通过字符串格式的类名 来获取 Class 对象
        Class<?> c = Class.forName("com.chenxing.Demo03."+classname);
//        System.out.println(c); 获取到这个类的class 对象

        // 根据 class 对象 来获取无参构造方法
        Constructor<?> con = c.getConstructor();
        // 通过构造方法实例化对象
        Object o = con.newInstance();
        // 通过字符串获取要执行的方法
        Method method = c.getMethod(methodname);
        // 通过反射机制调用
        method.invoke(o);


    }
}
