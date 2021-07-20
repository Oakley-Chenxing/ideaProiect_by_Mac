package com.chenxing.Demo10;

/**
 * @ClassName SellTicketsTest
 * @Description: TODO synchroniaed 上的锁对象
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 12:18 上午
 */
public class SellTicketsTest {
    public static void main(String[] args) {
        SellTickets win = new SellTickets();

        Thread thread00 = new Thread(win,"东单");
        Thread thread01 = new Thread(win,"西单");
        Thread thread02 = new Thread(win,"大望路");

        thread00.start();
        thread01.start();
        thread02.start();
    }
}
