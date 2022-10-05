package com.chenxing.day01;
import java.util.Random;

/**
 * @ClassName Random10
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 23/02/2022 15:18
 */
public class Random10 {
    public static void main(String[] args){
        int[] arr = new int[1000000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(1000000);
        }
        //最后输出arr，请自行测试一下。
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
}
