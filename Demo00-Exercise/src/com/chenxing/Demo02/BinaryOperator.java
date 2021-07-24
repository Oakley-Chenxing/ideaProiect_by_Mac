package com.chenxing.Demo02;

import java.util.function.BiFunction;

/**
 * @ClassName BinaryOperator
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/24 10:06 下午
 */

@FunctionalInterface
public interface BinaryOperator <T> extends BiFunction<T, T, T> {

}
