package com.chenxing.Demo03;

import java.util.Random;

/**
 * @ClassName BubbleSort
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 10:35 下午
 */
public class BubbleSort {
//    冒泡排序算法的原理如下：
//    比较相邻的元素。如果第一个比第二个大，就交换他们两个。
//    对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
//    针对所有的元素重复以上的步骤，除了最后一个。
//    持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
    /*
    冒泡排序法 升序
    22 58 72 10 90 19 91 10 75 11 原始数据格式
    22 58 10 72 19 90 10 75 11 91 第一次比较 比9次
    22 10 58 19 72 10 75 11 90    第二次比较 比8次
    10 22 19 58 10 72 11 75       第三次比较 比7次
    10 19 22 10 58 11 72          第四次比较   6
    10 19 10 22 11 58               五        5
    10 10 19 11 22                  六        4
    10 10 11 19                     七        3
    10 10 11                        八        2
    10 10                           九        1
    10                            数组长度-1  数组长度-1-外循环次数
*/
public static void main(String[] args) {
    Random ran = new Random();
    int[] arr = new int[10];
    System.out.println(arr.length);
    // 数组初始化
    for (int i = 0; i < arr.length; i++) {
        arr[i]= ran.nextInt(100);
    }
    System.out.println("排序之前的数组顺序：");

    // 输出数组
    for (int i = 0; i < arr.length; i++) {
        System.out.printf(arr[i]+" ");
    }
    // 进行排序
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            if(arr[j]>arr[j+1]){
                arr[j]^=arr[j+1];
                arr[j+1]^=arr[j];
                arr[j]^=arr[j+1];
            }
        }
        
    }
    System.out.println(" ");
    // 排序完进行输出
    for (int i = 0; i < arr.length; i++) {
        System.out.printf(arr[i]+" ");
    }


}
}
