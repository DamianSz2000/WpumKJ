package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(perm(list));
    }

    public static List<List<Integer>> perm(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        List<List<Integer>> result = new ArrayList<>();
        perm(list, 0, result);
        return result;
    }

    private static void perm(List<Integer> list, int index, List<List<Integer>> result) {
        if (index == list.size()) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = index; i < list.size(); i++) {
                swap(list, index, i);
                perm(list, index + 1, result);
                swap(list, index, i);
            }
        }
    }

    private static void swap(List<Integer> list, int i, int j) {
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}