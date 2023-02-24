package Task1;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("trzypiec");
            } else if (i % 3 == 0) {
                System.out.println("trzy");
            } else if (i % 5 == 0) {
                System.out.println("piec");
            } else {
                System.out.println(i);
            }
        }
    }
}

