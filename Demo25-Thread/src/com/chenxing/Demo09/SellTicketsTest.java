package com.chenxing.Demo09;

/**
 * @ClassName SellTicketsTest
 * @Description: TODO 卖票出现线程安全问题实现类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 12:05 上午
 */
public class SellTicketsTest {
    public static void main(String[] args) {
        SellTickets st = new SellTickets();

        Thread thread00 = new Thread(st,"工体");
        Thread thread01 = new Thread(st,"北新桥");
        Thread thread02 = new Thread(st,"东单");

        thread00.start();
        thread01.start();
        thread02.start();

    }
}
