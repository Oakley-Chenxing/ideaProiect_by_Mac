package com.chenxing.Demo06;

import java.util.Scanner;

/**
 * @ClassName Demo06Test
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 5:52 下午
 */
public class Demo06Test {
    public static void main(String[] args) {
        // 定义一个枚举类型的对象
        Direction06 direction06 = null;
        while (true){
            switch (new Scanner(System.in).next()){
                case "w":
                    direction06 = Direction06.UP;
                    break;
                case "s":
                    direction06 = Direction06.DOWN;
                    break;
                case "a":
                    direction06 = Direction06.LEFT;
                    break;
                case "d":
                    direction06 = Direction06.RIGHT;
                    break;
            }

            switch (direction06){
                case UP :
                    System.out.println(Direction06.UP.ordinal() +" "+
                            Direction06.UP+" "+
                            Direction06.UP.getDirInfo()+" "+
                            Direction06.UP.getData());
                    break;
                case DOWN:
                    System.out.println(Direction06.DOWN.ordinal() +" "+
                            Direction06.DOWN+" "+
                            Direction06.DOWN.getDirInfo()+" "+
                            Direction06.DOWN.getData());
                    break;
                case RIGHT:
                    System.out.println(Direction06.RIGHT.ordinal() +" "+
                            Direction06.RIGHT+" "+
                            Direction06.RIGHT.getDirInfo()+" "+
                            Direction06.RIGHT.getData());
                    break;
                case LEFT:
                    System.out.println(Direction06.LEFT.ordinal() +" "+
                            Direction06.LEFT+" "+
                            Direction06.LEFT.getDirInfo()+" "+
                            Direction06.LEFT.getData());
                    break;
            }
        }
        }

}
