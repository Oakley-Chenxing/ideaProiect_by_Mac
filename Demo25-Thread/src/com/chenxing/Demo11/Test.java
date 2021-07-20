package com.chenxing.Demo11;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 10:55 上午
 */
public class Test {
    public static void main(String[] args) {
        SellTickets st = new SellTickets();
        Thread win00 = new Thread(st,"天桥");
        Thread win01 = new Thread(st,"地坛");
        Thread win02 = new Thread(st,"簋街");

        win00.start();
        win01.start();
        win02.start();

    }
}
