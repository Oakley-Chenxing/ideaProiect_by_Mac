package com.chenxing.Demo09;

import java.util.function.Supplier;

/**
 * @ClassName Demo01
 * @Description: TODO 生产者接口 Supplier 生产数据 通常返回一个数据
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 9:53 上午
 */
public class Demo01 {
    public static void main(String[] args) {
        // 匿名内部类实现Supplier 获取数据
//        String str = getString(new Supplier<String>() {
//            @Override
//            public String get() {
//                return "字符串";
//            }
//        });

        // 完整 lambda 数据获取
//        String str = getString(() -> {
//            return "完整lambda字符串";
//        });

        // 简洁 lambda 数据获取
        String str = getString(() -> "简洁lambda");

        // 简洁 lambda 实现数据截取功能
        String substr = getString(() -> "Hello Java").substring(6, 10);

        //利用 lambda 实现最大值的获取
        int[] arr={1,2,3,4,5,6,7,8,9};
        Integer max = maxValue(()-> {
            int mv = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (mv < arr[i])
                    mv = arr[i];
            }
                return mv;
        });
        System.out.println("Max = "+max);

        System.out.println(str);
        System.out.println(substr);
    }

    private static Integer maxValue(Supplier<Integer> sup) {
        return sup.get();
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
