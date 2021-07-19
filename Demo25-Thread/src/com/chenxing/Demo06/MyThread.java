package com.chenxing.Demo06;

/**
 * @ClassName MyThread
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 5:58 下午
 */
public class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String[] songs={
                "说天亲",
                "天也算亲",
                "天有日月和星辰",
                "古人不见今时月",
                "明月曾经照过古人",
                "说地亲",
                "地也算亲",
                "地长万物似黄金",
                "将军战马今何在？",
                "野草鲜花盼的谁人",
                "要说亲",
                "观众们亲",
                "观众演员心连着心",
                "曾记得早年间有那么句古话",
                "没有君子不养艺人",
                "昨日里趟风冒雪来到塞北",
                "今日里下江南桃杏争春",
                "我劝诸位",
                "酒色财气君莫占",
                "吃喝嫖赌也莫沾身" ,
                "没事儿就把那德云社进",
                "听两段相声就散散心",
                "抱拳拱手尊列位，愿各位——招财进宝，日进斗金。"
        };
        for (int i = 0; i < songs.length; i++) {
            System.out.println(Thread.currentThread().getName() + "正在唱： "+songs[i]);
        }
    }
}
