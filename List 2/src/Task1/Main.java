package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 3, 0, 6));
        System.out.println(missingNumber(list));
    }

    public static int missingNumber(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                throw new IllegalArgumentException("List cannot contain negative numbers");
            }
            sum += list.get(i);
        }
        int n = list.size() + 1;
        int expectedSum = n * (n - 1) / 2;
        return expectedSum - sum;
    }
}