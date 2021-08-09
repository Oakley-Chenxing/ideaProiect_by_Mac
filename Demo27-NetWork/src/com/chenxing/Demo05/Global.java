package com.chenxing.Demo05;

import java.util.TreeMap;

/**
 * @ClassName Global
 * @Description: TODO 全局都会用到的类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/9 4:32 下午
 */
public class Global {
   public static TreeMap<Integer,String> portMap = new TreeMap<>();

    /**
     * 初始化测试用户port集合
     */
    public static void initUserPortMap(){
        portMap.put(20001,"用户1");
        portMap.put(20002,"用户2");
        portMap.put(20003,"用户3");
        portMap.put(20004 ,"用户4");
    }
}
