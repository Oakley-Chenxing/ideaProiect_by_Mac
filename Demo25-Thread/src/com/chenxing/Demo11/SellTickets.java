package com.chenxing.Demo11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName SellTickets
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 10:53 上午
 */
public class SellTickets implements Runnable {
    private int tickets = 2000;
    //创建锁对象
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try{
                lock.lock();    //锁定
                if (tickets > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在出售第 "+tickets+"张票");
                    tickets--;
                }
            }finally {
                lock.unlock();  //解锁
            }
            // sellTicks();
        }
    }
}
