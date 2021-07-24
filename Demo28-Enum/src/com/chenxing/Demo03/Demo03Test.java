package com.chenxing.Demo03;

/**
 * @ClassName Demo03Test
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 4:15 下午
 */
public class Demo03Test {
    public static void main(String[] args) {
        System.out.println(DirectionEnum.UP);
        System.out.println(DirectionEnum.DOWN);
        System.out.println(DirectionEnum.RIGHT);
        System.out.println(DirectionEnum.LEFT);
        System.out.println("==================");
        DirectionEnum direction = null;
        direction = DirectionEnum.UP;
        System.out.println(direction);

    }
}
