package com.chenxing.Demo03;

import java.util.Random;

/**
 * @ClassName BubbleSort01
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/25 12:18 上午
 */
public class BubbleSort01 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[10];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = ran.nextInt(100);
        }

        System.out.println("数组进行排序之前的值： ");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }

        // 开始进行排序
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] >= arr[j+1]){
                    // 交换位置
                    arr[j] ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j] ^= arr[j+1];
                }
            }
        }
        // 输出排序后的数组
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
