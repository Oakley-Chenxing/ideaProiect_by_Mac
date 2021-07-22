package com.chenxing.Demo09;

import java.util.function.Function;

/**
 * @ClassName Demo06
 * @Description: TODO Function 加工接口
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 5:17 下午
 */
public class Demo06 {
    public static void main(String[] args) {
        // 字符串转整型
        convert("27149",s -> Integer.parseInt(s));
        // 引用类方法 替换 Lambda
        convert("9527",Integer::parseInt);
        System.out.println("================");

        // 整型转字符型
        convert(27149,integer -> String.valueOf(integer));
        System.out.println("================");

        // 字符串转整型+1 271491
        // 再转 字符型+1 2714921
        convert("27149",s ->Integer.parseInt(s+1),
                integer -> String.valueOf(integer+1));
        System.out.println("============================");
        // 引用静态类 271491
        convert("27149",Integer::parseInt,String::valueOf);
    }

    /**
     * 把 str 类型的转换为 int 整型
     * @param str
     * @param fun
     */
    private static void convert (String str, Function<String,Integer> fun){
        Integer integer = fun.apply(str);
        System.out.println(integer+1);
    }

    /**
     * 把 Integer 类型转换为 string
     * @param i
     * @param fun
     */
    private static void convert(Integer i,Function<Integer,String> fun){
        String str = fun.apply(i);
        System.out.println(str+1);
    }

    /**
     * 把字符串转换为整型 在转换为字符型
     * @param str
     * @param fun01
     * @param fun02
     */
    private static void convert(String str,Function<String,Integer> fun01,
                                Function<Integer,String> fun02){
        Integer s = fun01.apply(str); // 转换为整型
        String i = fun02.apply(s); // 再转换为字符型
        System.out.println(i+1);


    }
}
