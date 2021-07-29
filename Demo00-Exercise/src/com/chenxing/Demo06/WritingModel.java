package com.chenxing.Demo06;

/**
 * @ClassName WritingModel
 * @Description: TODO 作文模板接口
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/28 11:08 上午
 */
public interface WritingModel {
    // 定义一个字节常量
    String TYPE = "IELTS Write Model";

    void firstParagraphs();
    void SecondParagraphs();
    void ThirdParagraphs();
    void FourthParagraphs();
}
