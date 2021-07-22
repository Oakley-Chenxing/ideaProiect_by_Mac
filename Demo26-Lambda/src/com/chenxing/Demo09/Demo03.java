package com.chenxing.Demo09;

import java.util.function.Consumer;

/**
 * @ClassName Demo03
 * @Description: TODO Consumer 应用场景 处理特殊字符串格式的输出
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 1:10 下午
 */
public class Demo03 {
    public static void main(String[] args) {
        String[] infoArr={"Alibaba:支付宝",
                "Tecent:腾讯",
                "Huawei:华为",
                "ByteDancer:字节跳动"};
        // Lambda 方法调用输出
        printInfo(infoArr,info->{
                    String englishName = info.split(":")[0];
                    System.out.println("EnglishName: "+englishName);
                },info ->{
                    String chineseName = info.split(":")[1];
                    System.out.println("ChineseName: "+chineseName);
                }
                );
    }

    /**
     * 使用消费者接口处理特殊格式的输出
     * @param infoArr
     * @param con1
     * @param con2
     */
    private static void printInfo(String[] infoArr, Consumer<String> con1,Consumer<String> con2){
        for (String info : infoArr) {
            con1.andThen(con2).accept(info);
            System.out.println("===============");
        }
    }
}
