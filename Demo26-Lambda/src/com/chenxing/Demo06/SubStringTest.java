package com.chenxing.Demo06;

/**
 * @ClassName SubStringTest
 * @Description: TODO 引用类的实例方法： 引用类中的成员方法 类名::方法名 类中实参:: 方法名
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/21 11:09 上午
 */
public class SubStringTest {
    public static void main(String[] args) {
        // 匿名内部类
        runSubString(new MyString() {
            @Override
            public String mySubString(String str, int start, int end) {
                return str.substring(start,end);
            }
        });
        // Lambda
        runSubString((String str,int start,int end)->{
            return str.substring(start,end);
        });

        // 简洁Lambda 第一个参数作为方法的调用者 其他参数作为实参进行传递
        runSubString((str, start, end) -> str.substring(start,end));

        // 引用类的实例方法： 引用类中的成员方法 类中实参 ::方法名
        // 引用类中的实参替换 Lambda
        runSubString(String::substring);
    }
    private static void runSubString(MyString ms){
          String resStr = ms.mySubString("0123456789",0,9);
         System.out.println("resStr= "+resStr);

    }
}
