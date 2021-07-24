package com.chenxing.Demo04;

/**
 * @ClassName EnumD
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 4:38 下午
 */
public enum EnumD {
    // 枚举类型参数
    UP("This is UP","W"),
    DOWN("This is DOWN","D"),
    RIGHT,
    LEFT;
    // 构造方法

    EnumD() {
    }

    EnumD(String dinfo, String data) {
        this.dinfo = dinfo;
        this.data = data;
    }


    // 成员变量
    private String dinfo;
    private String data;
    // 成员方法

    public String getDinfo() {
        return dinfo;
    }

    public void setDinfo(String dinfo) {
        this.dinfo = dinfo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
