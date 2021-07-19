package com.chenxing.Demo03;

/**
 * @ClassName Demo01
 * @Description: TODO 不通过反射正常调用
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 11:08 上午
 */
public class Demo01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        Teacher teacher = new Teacher();
        teacher.teach();
    }
}
