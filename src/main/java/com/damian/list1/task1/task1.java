package com.damian.list1.task1;

public class task1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            StringBuilder output = new StringBuilder();
            if (i % 3 == 0) {
                output.append("trzy");
            }
            if (i % 5 == 0) {
                output.append("piec");
            }
            if (output.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }
    }
}
