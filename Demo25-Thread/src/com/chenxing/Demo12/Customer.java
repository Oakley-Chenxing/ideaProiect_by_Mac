package com.chenxing.Demo12;

import static java.lang.Thread.*;

/**
 * @ClassName Customer
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 12:23 下午
 */
public class Customer implements Runnable{
    private Box box;

    public Customer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true){
            box.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
