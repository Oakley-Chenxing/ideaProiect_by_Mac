package com.chenxing.Demo10;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.DoubleToIntFunction;

/**
 * @ClassName Demo05
 * @Description: TODO 中间流 & 结束流 02
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/23 12:36 上午
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("123456789");
        list.add("1234569");
        list.add("1236789");
        list.add("3456789");
        list.add("13456789");
        list.add("56789");

        // 按照字符串的自然规则排序
        System.out.println("按照字符串的自然规则排序: ");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("=============================");

        // 按照字符串对应的数值进行排序
        //System.out.println("按照字符串对应的数值进行排序: ");
        //list.stream().map(s -> Integer.parseInt(s)).sorted().forEach(System.out::println);
        // 将字符串转换为数值之后 求和 (结束流动作)
        int sum = list.stream().mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.println("sum ="+ sum);
        // 求平均值（结束流动作 ）
        OptionalDouble average = list.stream().mapToInt(Integer::parseInt).average();
        System.out.println("Ave= "+average.getAsDouble());
        // count 统计
        long count = list.stream().count();
        System.out.println("一共有几个字符串= "+count);
        // count 统计字符串的长度
        long count1 = list.stream().filter(s -> s.length() > 6).count();
        System.out.println("字符串长度大于6的有几个= "+count1);
        // 求最大值
        OptionalInt max = list.stream().mapToInt(Integer::parseInt).max();
        System.out.println("最大值： "+max.getAsInt());
        // 最小值
        OptionalInt min = list.stream().mapToInt(Integer::parseInt).min();
        System.out.println("最小值："+min.getAsInt());
    }
}
