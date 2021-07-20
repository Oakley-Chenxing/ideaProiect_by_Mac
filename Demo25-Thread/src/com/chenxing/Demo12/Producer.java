package com.chenxing.Demo12;

/**
 * @ClassName Producer
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 12:21 下午
 */
public class Producer implements Runnable{
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 1; i <=7; i++) {
            box.put(i);
        }
    }
}
