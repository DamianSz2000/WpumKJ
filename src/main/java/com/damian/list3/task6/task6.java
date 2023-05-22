package com.damian.list3.task6;

import java.util.*;

public class task6 {

    static void generatePermutations(List<Integer> list, List<List<Integer>> result, int k) {
        for(int i = k; i < list.size(); i++) {
            Collections.swap(list, i, k);
            generatePermutations(list, result, k + 1);
            Collections.swap(list, k, i);
        }
        if (k == list.size() - 1) {
            result.add(new ArrayList<>(list));
        }
    }

    public static List<List<Integer>> perm(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(list, result, 0);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(perm(Arrays.asList(1, 2, 3)));
    }
}

