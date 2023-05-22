package com.damian.list4.part1.task2;

import com.damian.list4.part1.Cost;
import com.damian.list4.part1.DataProvider;
import com.damian.list4.part1.task1.task1;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

public class task2 {
    public static void main(String[] args) {
        printCosts(DataProvider.getGeneralCosts());
    }

    public static void printCosts(ArrayList<Cost> costs) {
        Map<Month, List<Cost>> costMap = task1.groupedCostMap(costs);
        for (Map.Entry<Month, List<Cost>> entry : costMap.entrySet()) {
            Month month = entry.getKey();
            List<Cost> costList = entry.getValue();
            costList.sort(Comparator.comparing(Cost::getDate));
            System.out.println(month.getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase());
            for (Cost cost : costList) {
                System.out.println(String.format("%02d %s %d zł", cost.getDate().getDayOfMonth(), cost.getType().getCostType(), cost.getAmount()));
            }
        }
    }
}

