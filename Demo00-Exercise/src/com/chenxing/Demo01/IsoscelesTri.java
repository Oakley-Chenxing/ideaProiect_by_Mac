package com.chenxing.Demo01;

/**
 * @ClassName IsoscelesTri
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/26 10:27 上午
 */
public class IsoscelesTri {
    public static void main(String[] args) {
        for(int i=0;i<=9;i++) {
            for(int j=0;j<9-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
