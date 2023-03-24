package Task2;

public class Main {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                result = "trzypiecsiedem";
            } else if (i % 3 == 0 && i % 7 == 0) {
                result = "trzysiedem";
            } else if (i % 5 == 0 && i % 7 == 0) {
                result = "piecsiedem";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result = "trzypiec";
            } else if (i % 3 == 0) {
                result = "trzy";
            } else if (i % 5 == 0) {
                result = "piec";
            } else if (i % 7 == 0) {
                result = "siedem";
            } else {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }
}