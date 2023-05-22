package com.damian.list2.task2;

import java.util.*;

public class task2 {
    public static List<Integer> findDuplicates(List<Integer> nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        Set<Integer> duplicates = new TreeSet<>();

        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                duplicates.add(num);
            }
        }

        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(0, 1, 1, 1, 4, 4, 4, 9, 3, 3, 3, 3, 3, 3);
        System.out.println(findDuplicates(lst));
    }
}
