package Task1;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args){
        BiConsumer<String, Integer> stringIntegerBiConsumer = (String s, Integer i) -> {
            String result = "";
            for (int j = 0; j < i; j++) {
                result += s;
            }
            System.out.println(result);
        };
    stringIntegerBiConsumer.accept("Hello", 3);
    }

}


