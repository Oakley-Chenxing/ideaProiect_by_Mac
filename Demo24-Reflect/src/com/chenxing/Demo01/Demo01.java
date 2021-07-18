package com.chenxing.Demo01;

/**
 * @ClassName Demo01
 * @Description: TODO 平台的 内置加载器
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);
        //un.misc.Launcher$AppClassLoader@18b4aac2 应用程序加载器
        System.out.println(c.getParent());
        // sun.misc.Launcher$ExtClassLoader@29453f44 平台类加载器
        System.out.println(c.getParent().getParent());
        // null Bootstrap class loader：虚拟机内置加载器
    }
}
