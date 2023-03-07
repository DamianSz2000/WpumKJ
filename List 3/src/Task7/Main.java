package Task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 12, 30));
        System.out.println(check(3, list));
    }

    public static Integer check(Integer p, List<Integer> list){
        Integer index = p-1;
        for (int i = p; i < list.size()-1; i++){
            if (list.get(p + 1) - list.get(p) == list.get(p - 1) || list.get(p + 1) - list.get(p - 1) == list.get(p - 2)){
                continue;
            }
            else{
                return list.get(p + 1);
            }
        }
        return -1;
    }

}