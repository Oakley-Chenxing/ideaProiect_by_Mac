package com.chenxing.Demo08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName Demo02
 * @Description: TODO 函数式接口作为返回值
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 9:15 上午
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("12345679");
        list.add("123459");
        list.add("123959");
        list.add("12679");
        list.add("5679");
        list.add("679");

        //Collections.sort(list);// 自然规则排序
        Collections.sort(list,getCompator());

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static Comparator<String> getCompator() {
        return Comparator.comparingInt(String::length);
    }

//    /**
//     * 使用 Lambda 排序 按照字符串长度 函数式接口作为返回值
//     * @return
//     */
//    private static Comparator<String> getCompator() {
//        return (s1,s2)->s1.length()-s2.length();
//    }
    
    

//    /**
//     * 使用匿名内部类排序 按照字符串的长度排序
//     * @return
//     */
//    private static Comparator<String> getCompator() {
//         return new Comparator<String>() {
//             @Override
//             public int compare(String o1, String o2) {
//                 return o1.length()-o2.length();
//             }
//         };
//    }

}
