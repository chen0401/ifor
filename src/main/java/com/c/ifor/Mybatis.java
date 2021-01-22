package com.c.ifor;

import java.util.function.BiFunction;

/**
 * @author: cjianping on 2021/1/13 15:04
 */
public class Mybatis {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> function = Integer::sum;
        System.out.println(function.apply(1, 2));
    }
}
