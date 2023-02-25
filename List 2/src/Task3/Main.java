package Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(addToBoolean());
    }

    public static Map<Integer, Boolean> addToBoolean() {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                map.put(i, true);
            } else {
                map.put(i, false);
            }
        }
        return map;
    }
}
