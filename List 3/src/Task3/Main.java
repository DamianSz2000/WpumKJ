package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("a", "b", "c")),
                new ArrayList<>(Arrays.asList("c", "d", "f")),
                new ArrayList<>(Arrays.asList("d", "f", "g"))
        ));
        System.out.println(countElements(list));
    }

    public static Map<String, Integer> countElements(List<List<String>> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        Map<String, Integer> map = new HashMap<>();
        list.stream().forEach((List<String> l) -> {
            l.stream().forEach((String s) -> {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            });
        });
        return map;
    }
}

