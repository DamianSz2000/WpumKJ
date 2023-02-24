package Task2;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("trzypiecsiedem");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("trzysiedem");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("piecsiedem");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("trzypiec");
            } else if (i % 3 == 0) {
                System.out.println("trzy");
            } else if (i % 5 == 0) {
                System.out.println("piec");
            } else if (i % 7 == 0) {
                System.out.println("siedem");
            } else {
                System.out.println(i);
            }
        }
    }
}