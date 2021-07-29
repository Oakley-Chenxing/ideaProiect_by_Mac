package com.chenxing.Demo06;

/**
 * @ClassName DiscussionPaper
 * @Description: TODO 接口的实现类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/28 11:12 上午
 */
public class DiscussionPaper implements WritingModel{
    @Override
    public void firstParagraphs() {
        System.out.println("Should be the Introduction for the paper!");
    }

    @Override
    public void SecondParagraphs() {
        System.out.println("Should write the first statement!");
    }

    @Override
    public void ThirdParagraphs() {
        System.out.println("Should write the second statement!");
    }

    @Override
    public void FourthParagraphs() {
        System.out.println("Should write the conclusion!");
    }
}
