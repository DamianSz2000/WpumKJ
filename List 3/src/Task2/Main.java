package Task2;

import java.util.List;

public class Main {

    public static void main(String[] args){
        System.out.println(suma(List.of(-5, 3, 2, -1)));
    }

    public static Integer suma(List<Integer> a){
        Integer sum = a.stream().filter(StreamHelpers.not(item -> item < 0)).reduce(0, (result, item) -> {
            result += item;
            return result;
        });
        return sum;
    }



}