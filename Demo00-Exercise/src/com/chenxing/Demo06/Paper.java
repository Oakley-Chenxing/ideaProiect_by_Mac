package com.chenxing.Demo06;

/**
 * @ClassName Paper
 * @Description: TODO 测试的主方法
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/28 11:14 上午
 */
public class Paper {
    public static void main(String[] args) {
        System.out.println(DiscussionPaper.TYPE);
        DiscussionPaper dp = new DiscussionPaper();
        dp.firstParagraphs();
        dp.SecondParagraphs();
        dp.ThirdParagraphs();
        dp.FourthParagraphs();
    }
}
