package com.chenxing.Demo12;

/**
 * @ClassName MilkBoxTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 12:24 下午
 */
public class MilkBoxTest {
    public static void main(String[] args) {
        Box box = new Box();

//        Producer producer = new Producer(box);
//        Customer customer = new Customer(box);
//
//        Thread producerThread = new Thread(producer);
//        Thread customerThread = new Thread(customer);
//         匿名内部类实现
        Thread producerThread = new Thread(new Producer(box));
        Thread customerThread = new Thread(new Customer(box));

        producerThread.start();
        customerThread.start();



    }
}
