package com.chenxing.Demo12;

/**
 * @ClassName Box
 * @Description: TODO 奶箱类中是put & get
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/20 11:22 上午
 */
public class Box {
    private int milk; // 定义第几瓶牛奶
    private boolean state = false;// 定义奶箱的状态

    /**
     * 送牛奶动作 如果是满的就等待，如果是空 就放牛奶
     * @param milk
     */
    public synchronized  void  put(int milk){
        if(state){
            try {
                wait();// 线程等待 需要唤醒才能继续
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 送奶动作
        this.milk = milk;
        System.out.println("大哥来送第： "+this.milk +" 瓶牛奶了！");
        // 送完修改奶箱状态
        this.state = true;

        // 唤醒动作 唤醒拿奶的人
        notifyAll();

    }

    /**
     * 拿奶动作
     */
    public synchronized void get(){
        if(!state){ // 如果没有牛奶 就等着
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果有牛奶 就将牛奶拿走
        System.out.println("小明将第："+this.milk+" 瓶牛奶拿走了");
        // 拿走后 修改奶箱状态
        this.state = false;

        // 唤醒 送奶的人 继续送奶
        notifyAll();
    }

}
