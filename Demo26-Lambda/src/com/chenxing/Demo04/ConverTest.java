package com.chenxing.Demo04;

/**
 * @ClassName ConverTest
 * @Description: TODO 引用类中的静态方法
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 10:17 下午
 */
public class ConverTest {
    public static void main(String[] args) {
        // 普通的 通过实现类
        runConvert(new ConverterImp());

        // 匿名内部类
        runConvert(new Converter() {
            @Override
            public Integer convert(String str) {
                return Integer.parseInt(str);
            }
        });

        // Lambda
        runConvert((String str)->{
            return Integer.parseInt(str);
        });

        // Lambda简洁版
        runConvert(str -> Integer.parseInt(str));

        // 引用类中的静态方法 替换 Lambda
        // 在引用类中的静态方法替换 Lambda 的时候，原Lambda 中的所有实参将会作为替换方法的实参进行传递
        runConvert(Integer::parseInt);

    }
    private static void runConvert(Converter con){
        Integer num = con.convert("27149");
        System.out.println(num+1);
    }
}
