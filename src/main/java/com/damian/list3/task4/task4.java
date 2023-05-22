package com.damian.list3.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, -6, -1, -1, 2, 3);
        List<Integer> result = IntStream.range(0, numbers.size())
                .filter(i -> i % 2 != 0 && numbers.get(i) > 0)
                .map(i -> numbers.get(i) * numbers.get(i))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

