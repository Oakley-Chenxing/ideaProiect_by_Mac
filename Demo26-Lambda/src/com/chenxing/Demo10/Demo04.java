package com.chenxing.Demo10;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @ClassName Demo04
 * @Description: TODO 中间流的操作 & 结束流
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 10:07 下午
 */
public class Demo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        listInit(list);

        // 查找姓迪的
        list.stream().filter(s -> s.startsWith("迪")).forEach(s -> System.out.println(s));
        System.out.println("==========================================");
        // 查找姓李的
        list.stream().filter(s -> s.startsWith("李")).forEach(System.out::println);
        System.out.println("=========================================");
        // 查找两个字的
        list.stream().filter(s -> s.length() == 2).forEach(s -> System.out.println(s));
        System.out.println("=========================================");
        // 取 前六个记录
        list.stream().limit(6).forEach(s -> System.out.println(s));
        System.out.println("=========================================");
        // 跳过三个 取两个
        list.stream().skip(3).limit(2).forEach(System.out::println);
        System.out.println("==========================================");

        // 取前四个 生成一个流
        Stream<String> stream01 = list.stream().limit(4);
        // 跳过一个 取两个
        Stream<String> stream02 = list.stream().skip(1).limit(2);
        // 合并两个流
        Stream<String> stream03 = Stream.concat(stream01, stream02);// 包含重复的值
        stream03.forEach(System.out::println);// 李自成 李刚 李白 李贺 李刚 李白 李世民 李克强。。。。



    }

    /**
     * 初始化集合
     * @param list
     */
    private static void listInit(ArrayList<String> list) {
        list.add("李自成");
        list.add("李刚");
        list.add("李白");
        list.add("李贺");
        list.add("李世民");
        list.add("李克强");
        list.add("迪丽热巴");
    }
}
