package Task1;

public class Main {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "trzypiec";
            } else if (i % 3 == 0) {
                result = "trzy";
            } else if (i % 5 == 0) {
                result = "piec";
            } else {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }
}

