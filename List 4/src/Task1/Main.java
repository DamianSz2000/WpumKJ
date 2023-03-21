package Task1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        groupedCostMap(DataProvider.getGeneralCosts());
    }



    public static Map<String, Cost> groupedCostMap(ArrayList<Cost> costArray){
        List<String> months = new ArrayList<>(Arrays.asList("JANUARY, FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"));
        Map<String, Cost> costMap = new HashMap<>();
        for (int i = 0; i < costArray.size(); i++){
            Cost item = costArray.get(i);
            costMap.put(months.get(), )
            System.out.println(item.getDate().getMonthValue());
        }
        return costMap;
    }
}
