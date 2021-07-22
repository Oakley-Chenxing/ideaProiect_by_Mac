package com.chenxing.Demo10;

/**
 * @ClassName Demo02
 * @Description: TODO 对象的连贯操作 底层原理
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 6:49 下午
 */
public class Demo02 {
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();
        msb.append("Hello").append("World").append("This").append("is").append("Oakley").printStrInfo();
        System.out.println(msb.getStr());// 不会输出，因为模仿结束流 清空操作


    }
}
