package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 3, 0, 6, 2, 4, 5, 3, 0, 6));
        System.out.println(suma(list));
    }

    public static int suma(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        return list.stream().filter((Integer i) -> i > 0).reduce(0, (Integer i, Integer j) -> i + j);
    }
}