package com.chenxing.Demo07;

/**
 * @ClassName Factory
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/28 12:26 下午
 */
public class Factory {
    public static Fruit getInstance(String className){
        if("apple".equals(className)){
            return new Apple();
        }
        if("orange".equals(className)){
            return new Orange();
        }else {
            return null;
        }
    }

}
