package com.chenxing.Demo10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Demo06
 * @Description: TODO 翻页逻辑 & 地图逻辑
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/23 11:38 上午
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        initList(list);

        // 找出姓黄的所有人
        //list.stream().filter(s -> s.startsWith("黄")).forEach(System.out::println);

        // 定义最大页码 一页5个
        final int PAGE_COUNT = 5;
        final int MAX_PAGE = list.size()/PAGE_COUNT + (list.size()%PAGE_COUNT != 0?1:0);
        int page =0;
        while(true){
            list.stream().skip(page*PAGE_COUNT).limit(PAGE_COUNT).forEach(System.out::println);
            System.out.println("P 上一页 ========== N 下一页");
            System.out.println("input 'exit' can end the programme");
            switch (new Scanner(System.in).next()){
                case "p":
                case "P":
                    // 判断 page-1 是否 大于等于0 是的话 返回page-1 不然返回0
                    // 这里的max 意思就是返回较大的 不要超过 list 范围的下限
                    page=Math.max(page-1,0);
                    break;
                case "n":
                case "N":
                    // 判断 page+1 是否小于等于 页码最大值-1 是的话 返回page+1 不然返回 页码最大值-1
                    // 这里的min 意思是返回较小的 不要超过 list 范围的上限
                    page=Math.min(page+1,MAX_PAGE-1);
                    break;
                case "Exit":
                case "e":
                    System.exit(0);
                default:
                    System.out.println("Error Input,Please input N or P!");
            }
        }

    }

    /**
     * 初始化集合
     * @param list
     */
    private static void initList(ArrayList<String> list) {
        list.add("赵游艇");
        list.add("钱学森");
        list.add("孙文竹");
        list.add("李向西");
        list.add("周文帅");
        list.add("吴倩");
        list.add("郑爽");
        list.add("王丹");
        list.add("白万方");
        list.add("王迅");
        list.add("黄渤");
        list.add("黄磊");
        list.add("罗志祥");
        list.add("孙红雷");
        list.add("张艺兴");
        list.add("岳云鹏");
        list.add("雷佳音");
        list.add("贾乃亮");
    }
}
