package Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, -6, -1, -1, 2, 3));
        System.out.println(evenPositiveSquare(list));
    }

    public static List<Integer> evenPositiveSquare(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        return list.stream().filter((Integer i) -> i > 0).filter((Integer i) -> list.indexOf(i) % 2 == 1).map((Integer i) -> i * i).collect(Collectors.toList());
    }
}