package org.fasttrackit;

public class Coza {
    public static void main(String[] args) {
        int start = -100;
        int end = 300;

        for (int i = -100; i <= 300; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
            } else if (i % 3 == 0)
                System.out.print("Coza ");
            else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }

        }
    }
}





