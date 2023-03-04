package Task5;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut"));
        System.out.println(srt(list));
    }

    public static List<List<String>> srt(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        return list.stream().filter((String s) -> s.length() % 2 == 0).collect(Collectors.groupingBy((String s) -> s.substring(0, 1))).entrySet().stream().map((Map.Entry<String, List<String>> e) -> {
            List<String> l = new ArrayList<>();
            l.add(e.getKey());
            l.add(e.getValue().toString());
            return l;
        }).sorted(Comparator.comparing((List<String> l) -> l.get(0))).collect(Collectors.toList());
    }
}