package com.chenxing.Demo10;

/**
 * @ClassName SellTickets
 * @Description: TODO synchroniaed 上的锁对象
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 12:17 上午
 */
public class SellTickets implements Runnable {
    private  int tickets = 1000;
    private Object lock = new Object();

    @Override
    public void run() {
        while(true) {

            // 同步语句块 解决线程安全问题
            synchronized (lock) {
                // 还有没有票
                if (this.tickets > 0) {
                    //
                    System.out.println(Thread.currentThread().getName() + " ：正在出售第 " + this.tickets + " 张票");
                    this.tickets--;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
