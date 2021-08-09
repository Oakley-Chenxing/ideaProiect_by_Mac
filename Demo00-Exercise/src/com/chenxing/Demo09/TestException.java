package com.chenxing.Demo09;

/**
 * @ClassName TestException
 * @Description: TODO 先执行finally 中的语句块 在进行 num先赋值给临时变量 再++ 执行输出 然后执行return（语法规则）
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/9 8:56 下午
 */
public class TestException {
    public static void main(String[] args) {
        System.out.println(get());
    }

    private static int get() {
        int num = 10;
        try{
            return num;
        }finally {
            num++;
            System.out.println("finally...");
        }
    }
}
