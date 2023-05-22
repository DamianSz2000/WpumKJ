package com.damian.list3.task7;

import java.util.*;

public class task7 {

    static boolean isSumInPreviousSublist(List<Integer> list, int start, int end, int num){
        Set<Integer> comp = new HashSet<>();
        for(int i = start; i < end; i++) {
            if(comp.contains(list.get(i))) return true;
            comp.add(num - list.get(i));
        }
        return false;
    }

    static int check(int preamble, List<Integer> list) {
        for(int i = preamble; i < list.size(); i++) {
            if(!isSumInPreviousSublist(list, i - preamble, i, list.get(i))) return list.get(i);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(check(5, Arrays.asList(35, 25, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576)));
    }
}

