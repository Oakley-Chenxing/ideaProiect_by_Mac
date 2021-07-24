package com.chenxing.Demo02;

/**
 * @ClassName BiFunction
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 10:07 下午
 */
@FunctionalInterface
public interface BiFunction <T,U,R>{
    R apply(T t,U u);
}
