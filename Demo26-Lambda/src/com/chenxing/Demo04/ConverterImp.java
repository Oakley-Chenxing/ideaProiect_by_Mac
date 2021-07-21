package com.chenxing.Demo04;

/**
 * @ClassName ConverterImp
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 10:23 下午
 */
public class ConverterImp implements Converter{
    @Override
    public Integer convert(String str) {
        return Integer.parseInt(str);
    }
}
