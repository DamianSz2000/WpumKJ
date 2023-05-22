package com.damian.list1.task3;

public class task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            StringBuilder output = new StringBuilder();
            if (i % 3 == 0) {
                output.append("trzy");
            }
            if (i % 5 == 0) {
                output.append("piec");
            }
            if (i % 7 == 0) {
                output.append("siedem");
            }
            if (i % 11 == 0) {
                output.append("jedenascie");
            }
            if (i % 13 == 0) {
                output.append("trzynascie");
            }
            if (output.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }
    }
}
