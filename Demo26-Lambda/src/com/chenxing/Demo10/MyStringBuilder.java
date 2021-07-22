package com.chenxing.Demo10;

/**
 * @ClassName MyStringBuilder
 * @Description: TODO 字符串操作类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 6:46 下午
 */
public class MyStringBuilder {
    private String str ="";
// 模拟中间流动作
    public MyStringBuilder append(String s){
        str += s + " ";
        return this;
    }
    // 模拟结束流动作
    public  void printStrInfo(){
        System.out.println("结果是： "+ this.str);
        this.str=" "; // 清空操作
    }

    // set get

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
