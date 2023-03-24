package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 1, 1));
        System.out.println(findDuplicates(list));
    }

    public static List<Integer> findDuplicates(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> items = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!items.contains(list.get(i))) {
                items.add(list.get(i));
            } else {
                set.add(list.get(i));
            }
        }
        return set.stream().sorted().collect(Collectors.toList());
    }
}