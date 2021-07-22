package com.chenxing.Demo09;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Predicate;

/**
 * @ClassName Demo05
 * @Description: TODO Predicate 应用场景
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 4:59 下午
 */
public class Demo05 {
    public static void main(String[] args) {
        String[] Arrinfo = {"Zaid,10",
                             "Youou,22",
                             "Xixi,19",
                             "Vivi,18"};
        ArrayList<String> res = myFilter(Arrinfo, s -> s.split(",")[0].length() == 5,
                s -> Integer.parseInt(s.split(",")[1]) > 20);
        System.out.println(res);

    }

    private static ArrayList<String> myFilter(String[] infoArr,
                                              Predicate<String> pre01,
                                              Predicate<String> pre02){
        // 遍历数组 根据判断条件 将得到的结果 写入数组中
        ArrayList<String> list = new ArrayList<>();

        for (String info  : infoArr) {
            if(pre01.and(pre02).test(info))
                list.add(info);
        }
        
        return list;
    }
}
