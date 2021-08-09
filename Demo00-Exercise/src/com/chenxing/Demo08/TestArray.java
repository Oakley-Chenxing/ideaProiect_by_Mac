package com.chenxing.Demo08;

import java.util.Random;

/**
 * @ClassName TestArray
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/2 8:30 下午
 */
public class TestArray {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] number = new int[6];
        for (int i = 0,j; i < 1000; i++) {
            j=ran.nextInt(6);
            number[i]=j;
            j++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.printf(number[i]+" ");
        }

    }
}
