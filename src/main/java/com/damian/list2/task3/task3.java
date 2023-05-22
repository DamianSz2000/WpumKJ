package com.damian.list2.task3;

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static Map<Integer, Boolean> addToBoolean() {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= 20; i++) {
            map.put(i, i % 2 == 0);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(addToBoolean());
    }
}
