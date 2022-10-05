package com.chenxing.day01;

/**
 * @ClassName PalindromeNumber
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/10/3 1:56 下午
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("121是否是回文数：" + isPalindromNumber(121));
        System.out.println("-121是否是回文数：" + isPalindromNumber(-121));
        System.out.println("10是否是回文数：" + isPalindromNumber(10));
        System.out.println("-101是否是回文数：" + isPalindromNumber(-101));
        System.out.println("101是否是回文数：" + isPalindromNumber(101));

    }

    private static boolean isPalindromNumber(int num) {
        // 负数
        if (num < 0) {
            return false;
        }

        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (chars[i] != chars[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
    }
