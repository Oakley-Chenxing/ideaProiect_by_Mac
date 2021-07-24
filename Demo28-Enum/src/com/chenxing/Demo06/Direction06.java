package com.chenxing.Demo06;

/**
 * @ClassName Direction06
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 5:50 下午
 */
public enum Direction06 {
    // 枚举项
    UP("上","w"),
    DOWN("下","s"),
    RIGHT("右","d"),
    LEFT("左","a");
    // 构造方法

    Direction06() {
    }

    Direction06(String dirInfo, String data) {
        this.dirInfo = dirInfo;
        this.data = data;
    }

    // 成员变量
    private String dirInfo ;
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
