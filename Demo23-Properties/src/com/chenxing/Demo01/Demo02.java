package com.chenxing.Demo01;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName Demo02
 * @Description: TODO Properties 中的特有方法
 * @Author: lichenxingbeijing@163.com
 */
public class Demo02 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        // setProperty 用于添加键值对
        prop.setProperty("No.01","HuaWei");
        prop.setProperty("No.02","Xiaomi");
        prop.setProperty("No.03","Oppo");
        prop.setProperty("No.04","Vivo");
        // stringPropertyNames() 获取键对集合
        Set<String> keySet = prop.stringPropertyNames();
        for(String key : keySet){
            System.out.println(key + " "+ prop.getProperty(key));
            // getProperty 通过键 获取值
        }
    }
}

