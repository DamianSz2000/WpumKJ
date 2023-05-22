package com.damian.list3.task1;

import java.util.function.BiFunction;

public class task1 {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> repeatString = (s, i) -> s.repeat(i);
        System.out.println(repeatString.apply("a", 3));
    }
}

