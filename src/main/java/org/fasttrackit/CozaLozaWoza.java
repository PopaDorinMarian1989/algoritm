package org.fasttrackit;

public class CozaLozaWoza {

    public static void main(String[] args) {
        CozaLozaWoza cozaLozaWoza = new CozaLozaWoza();
                cozaLozaWoza.printCozaWoza(35,150);


        for (int i = 1; i <= 110; i++) {
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
    public void printCozaWoza(int start, int end){
        for (int i = start; i <= end; i++) {
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
                System.out.println();}
    }

}}



