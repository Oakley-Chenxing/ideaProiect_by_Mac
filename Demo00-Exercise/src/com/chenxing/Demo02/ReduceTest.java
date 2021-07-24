package com.chenxing.Demo02;
       import java.util.stream.Stream;
/**
 * @ClassName ReduceTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 10:04 下午
 */
public class ReduceTest {
    public static void main(String[] args) {
        int accResult = Stream.of(1, 2, 3, 4)
                .reduce(0, (acc, item) -> {
                    System.out.println("acc : " + acc);
                    acc += item;
                    System.out.println("item: " + item);
                    System.out.println("acc+ : " + acc);
                    System.out.println("--------");
                    return acc;
                });
        System.out.println(accResult);
    }
}


//package cn_lemon;
//
//        import org.junit.Test;
//
//        import java.util.Optional;
//        import java.util.stream.Stream;
//
//public class ReduceDemo {
//    @Test
//    public void reduceTest() {
//        int accResult = Stream.of(1, 2, 3, 4)
//                .reduce(100, (acc, item) -> {
//                    System.out.println("acc : " + acc);
//                    acc += item;
//                    System.out.println("item: " + item);
//                    System.out.println("acc+ : " + acc);
//                    System.out.println("--------");
//                    return acc;
//                });
//        System.out.println(accResult);
//    }
//}

