package Task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 12, 19, 19, 30));
        System.out.println(check(3, list));
    }

    public static Integer check(int p, List<Integer> list){
        Integer index = p-1;
        for(int i = p; i < list.size(); i++){
            List<Integer> preamble = list.subList(index-2, index+1);
            Integer number = list.get(i);
            if(!preamble.contains(preamble.stream().mapToInt(Integer::intValue).sum() - number)){
                return number;
            }
            else{
                index += 1;
            }
        }
        return -1;
    }

}