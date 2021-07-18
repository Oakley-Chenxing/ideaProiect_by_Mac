package com.chenxing.Demo01;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName Demo01
 * @Description: TODO 当做 map 使用
 * @Author: lichenxingbeijing@163.com
 */
public class Demo01 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("Stu01","Huawei");
        prop.put("Stu02","Xiaomi");
        prop.put("Stu03","Yijia");
        prop.put("Stu04","Oppo");
        //System.out.println(prop);
        Set<Object> keySet = prop.keySet();
        for(Object key : keySet){
            System.out.println(key+" "+ prop.get(key));
        }
    }
}
