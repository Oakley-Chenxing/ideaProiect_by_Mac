package com.chenxing.Demo10;

import java.util.ArrayList;

/**
 * @ClassName Demo01
 * @Description: TODO 偷窥一下 Stream
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 6:03 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        initList(list);
        // 找到名字是三个字的
        ArrayList<String> threeList = new ArrayList<>();
        for (String name : list) {
            if (name.length()==3){
                threeList.add(name);
            }}

            for (String s : threeList) {
                System.out.println(s);
            }
            System.out.println("================");

            // 找到所有姓李的
            ArrayList<String> liList = new ArrayList<>();

            for (String name01 : list) {
                if(name01.startsWith("李")){
                    liList.add(name01);
                }
            }
            // 找到之后输出数组
            for (String s01 : liList) {
                System.out.println(s01);
            }
            System.out.println("=================");

            // 找到三个字姓李的
            // 三个字里面找姓李的 or 姓李的里面找三个字的
            ArrayList<String> liThreeList = new ArrayList<>();
            for (String name02 : liList) {
                if (name02.length()==3){
                    liThreeList.add(name02);
                }
            }
            for (String res : liThreeList) {
                System.out.println(res);
            }
        System.out.println("==============");

        System.out.println("Stream流实现 找到三个字并且姓李的人");
            list.stream().filter(s -> s.length()==3)
                    .filter(s -> s.startsWith("李"))
                    .forEach(System.out::println);
        System.out.println("============================");
         }
    /**
     * 初始化测试数据
     * @param list 目标集合
     */
    private static void initList(ArrayList<String> list) {
        list.add("李一");
        list.add("李二");
        list.add("李三");
        list.add("李四");
        list.add("李五");
        list.add("李六");
        list.add("李七");
        list.add("李八");
        list.add("李九");
        list.add("李十一");
        list.add("李十二");
        list.add("王十二");
    }
}
