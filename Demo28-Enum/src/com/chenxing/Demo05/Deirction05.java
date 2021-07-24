package com.chenxing.Demo05;

/**
 * @ClassName Deirction05
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 5:26 下午
 */
public enum Deirction05 {
    //默认继承了 Enum JAVA 中是单继承
    //但是可以实现多个接口 比如 Runnable
    // 枚举
    UP("上","UP"),
    DOWN,
    LEFT,
    WC,
    RIGHT;
    // 构造方法

    Deirction05() {
    }

    Deirction05(String dirInfo, String data) {
        this.dirInfo = dirInfo;
        this.data = data;
    }

    // 成员变量
    private String dirInfo;
    private String data;
    // 成员方法


    public String getDirInfo() {
        return dirInfo;
    }

    public void setDirInfo(String dirInfo) {
        this.dirInfo = dirInfo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
