package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 3, 0, 6, 2, 4, 5, 3, 0, 6));
        System.out.println(findDuplicates(list));
    }

    public static List<Integer> findDuplicates(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) {
                duplicates.add(list.get(i));
            } else {
                set.add(list.get(i));
            }
        }
        return duplicates.stream().sorted().collect(Collectors.toList());
    }
}