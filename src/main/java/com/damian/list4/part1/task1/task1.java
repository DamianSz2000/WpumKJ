package com.damian.list4.part1.task1;

import com.damian.list4.part1.Cost;
import com.damian.list4.part1.DataProvider;

import java.time.Month;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Map<Month, List<Cost>> groupedCostMap = groupedCostMap(DataProvider.getGeneralCosts());
        System.out.println(groupedCostMap);
    }

    public static Map<Month, List<Cost>> groupedCostMap(ArrayList<Cost> costs) {
        Map<Month, List<Cost>> costMap = new TreeMap<>();
        for (Cost cost : costs) {
            Month month = cost.getDate().getMonth();
            if (!costMap.containsKey(month)) {
                costMap.put(month, new ArrayList<>());
            }
            costMap.get(month).add(cost);
        }
        return costMap;
    }
}

