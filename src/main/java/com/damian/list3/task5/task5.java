package com.damian.list3.task5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut");
        List<String> alphabet = Stream.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z").collect(Collectors.toList());

        List<List<Object>> result = new ArrayList<>();
        for(String letter : alphabet) {
            final String l = letter;
            List<String> filteredFruits = fruits.stream()
                    .filter(fruit -> fruit.startsWith(l) && fruit.length() % 2 == 0)
                    .collect(Collectors.toList());
            if(!filteredFruits.isEmpty())
                result.add(Arrays.asList(l, filteredFruits));
        }
        System.out.println(result);
    }
}


