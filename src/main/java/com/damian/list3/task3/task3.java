package com.damian.list3.task3;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        List<Object> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("c", "d", "f"),
                Arrays.asList("d", "f", "g",
                        Arrays.asList("h", "h", "a",
                                Arrays.asList("b", "c"))));

        List<String> flattenedList = new ArrayList<>();
        flatten(listOfLists, flattenedList);

        Map<String, Long> count = new HashMap<>();
        for (String s : flattenedList) {
            count.put(s, count.getOrDefault(s, 0L) + 1);
        }
        System.out.println(count);
    }

    public static void flatten(List<?> nestedList, List<String> flatList) {
        for (Object item : nestedList) {
            if (item instanceof List<?>) {
                flatten((List<?>) item, flatList);
            } else {
                flatList.add((String) item);
            }
        }
    }
}


