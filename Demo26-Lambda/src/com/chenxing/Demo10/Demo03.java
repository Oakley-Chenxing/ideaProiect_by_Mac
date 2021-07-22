package com.chenxing.Demo10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @ClassName Demo03
 * @Description: TODO Stream 流的生成
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/22 9:53 下午
 */
public class Demo03 {
    public static void main(String[] args) {
        // Collection list&set
        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        // HashSet
        HashSet<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        // Map
        HashMap<String, String> map = new HashMap<>();
        Stream<String> stream2 = map.keySet().stream();
        Stream<String> stream3 = map.values().stream();
        Stream<Map.Entry<String, String>> stream4 = map.entrySet().stream();

        // Array
        String[] strArr ={};
        Stream<String> strArr1 = Stream.of(strArr);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Stream<String> stringStream = Stream.of("1", "2", "3");
        Stream<Double> doubleStream = Stream.of(3.14);
        Stream<Float> floatStream = Stream.of(9.98f);
    }

}
