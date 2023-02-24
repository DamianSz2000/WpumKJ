package Task3;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0) {
                System.out.println("trzypiecsiedemjedenascietrzynascie");
            } else if (i % 3 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0) {
                System.out.println("trzysiedemjedenascietrzynascie");
            } else if (i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0) {
                System.out.println("piecsiedemjedenascietrzynascie");
            } else if (i % 3 == 0 && i % 5 == 0 && i % 11 == 0 && i % 13 == 0) {
                System.out.println("trzypiecjedenascietrzynascie");
            } else if (i % 3 == 0 && i % 11 == 0 && i % 13 == 0) {
                System.out.println("trzyjedenascietrzynascie");
            } else if (i % 7 == 0 && i % 11 == 0 && i % 13 == 0) {
                System.out.println("siedemjedenascietrzynascie");
            } else if (i % 3 == 0 && i % 7 == 0 && i % 11 == 0) {
                System.out.println("trzysiedemjedenascie");
            } else if (i % 5 == 0 && i % 7 == 0 && i % 11 == 0) {
                System.out.println("piecsiedemjedenascie");
            } else if (i % 3 == 0 && i % 5 == 0 && i % 11 == 0) {
                System.out.println("trzypiecjedenascie");
            } else if (i % 3 == 0 && i % 11 == 0) {
                System.out.println("trzyjedenascie");
            } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
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
            } else if (i % 11 == 0) {
                System.out.println("jedenascie");
            } else if (i % 13 == 0) {
                System.out.println("trzynascie");
            } else {
                System.out.println(i);
            }
        }
    }
}



