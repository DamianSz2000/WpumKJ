package com.damian.list2.task1;

import java.util.HashSet;
import java.util.Set;

public class task1 {
    public static int missingNumber(int[] nums) {
        int N = nums.length;
        int totalSum = N * (N + 1) / 2;
        int actualSum = 0;

        Set<Integer> uniqueNums = new HashSet<>();

        for (int num : nums) {
            if(num < 0 || num > N) {
                throw new IllegalArgumentException("Numbers should be within range 0-N");
            }
            if(!uniqueNums.add(num)){
                throw new IllegalArgumentException("Numbers should be unique");
            }
            actualSum += num;
        }

        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] tab = new int[]{2, 4, 5, 3, 0, 6, 1};
        System.out.println(missingNumber(tab));
    }
}
