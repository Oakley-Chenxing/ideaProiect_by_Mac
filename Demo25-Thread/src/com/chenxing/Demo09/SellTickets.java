package com.chenxing.Demo09;

/**
 * @ClassName SellTickets
 * @Description: TODO 卖票出现线程安全问题
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 12:01 上午
 */
public class SellTickets implements Runnable{
    private  int tickets = 100;
    @Override
    public void run() {
        while(true) {
            // 同步语句块 解决线程安全问题
            synchronized (this) {
                // 还有没有票
                if (tickets > 0) {
                    //
                    System.out.println(Thread.currentThread().getName() + " ：正在出售第 " + this.tickets + " 张票");
                    this.tickets--;
                }
            }
        }
    }
}
