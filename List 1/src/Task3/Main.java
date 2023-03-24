package Task3;

public class Main {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0) {
                result = "trzypiecsiedemjedenascietrzynascie";
            } else if (i % 3 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0) {
                result = "trzysiedemjedenascietrzynascie";
            } else if (i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0) {
                result = "piecsiedemjedenascietrzynascie";
            } else if (i % 3 == 0 && i % 5 == 0 && i % 11 == 0 && i % 13 == 0) {
                result = "trzypiecjedenascietrzynascie";
            } else if (i % 3 == 0 && i % 11 == 0 && i % 13 == 0) {
                result = "trzyjedenascietrzynascie";
            } else if (i % 7 == 0 && i % 11 == 0 && i % 13 == 0) {
                result = "siedemjedenascietrzynascie";
            } else if (i % 3 == 0 && i % 7 == 0 && i % 11 == 0) {
                result = "trzysiedemjedenascie";
            } else if (i % 5 == 0 && i % 7 == 0 && i % 11 == 0) {
                result = "piecsiedemjedenascie";
            } else if (i % 3 == 0 && i % 5 == 0 && i % 11 == 0) {
                result = "trzypiecjedenascie";
            } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                result = "trzypiecsiedem";
            } else if (i % 3 == 0 && i % 11 == 0) {
                result = "trzyjedenascie";
            }  else if (i % 3 == 0 && i % 7 == 0) {
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
            } else if (i % 11 == 0) {
                result  = "jedenascie";
            } else if (i % 13 == 0) {
                result = "trzynascie";
            } else {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }
}



