package com.damian.list3.task2;

import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -4, 12, 0, -3, 29, -150);
        int sum = numbers.stream()
                .filter(number -> number > 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}

