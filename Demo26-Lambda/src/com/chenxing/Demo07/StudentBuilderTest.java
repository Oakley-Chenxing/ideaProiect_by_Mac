package com.chenxing.Demo07;

/**
 * @ClassName StudentBuilderTest
 * @Description: TODO 引用构造器 替换 Lambda
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/21 11:30 上午
 */
public class StudentBuilderTest {
    public static void main(String[] args) {
        // 匿名内部类
        runStudentBuilder(new StudentBuilder() {
            @Override
            public Student build(String name, Integer age) {
                return new Student(name,age);
            }
        });
        System.out.println("=====================");
        // Lambda
        runStudentBuilder((String name,Integer age)->{
            return new Student(name,age);
        });
        System.out.println("=====================");

        // 简洁 lambda
        runStudentBuilder((name, age) -> new Student(name,age));
        System.out.println("=====================");

        // 构造方法替换lambda 所有形参当做实参来传递
        runStudentBuilder(Student::new);
        System.out.println("=====================");

    }

    private static void runStudentBuilder(StudentBuilder sb){
        Student andy = sb.build("Andy", 23);
        System.out.printf("Student name=%s\nStudent age=%d\n",andy.getName(),andy.getAge());

    }
}
