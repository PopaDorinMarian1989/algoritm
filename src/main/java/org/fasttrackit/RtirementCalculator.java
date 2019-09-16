package org.fasttrackit;

import java.time.LocalDate;
import java.util.Scanner;

public class RtirementCalculator {

    public static void   main (String[] args){
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("At what age would ypu like to retire?");
        LocalDate currentData = LocalDate.now();
        int retirement = scanner.nextInt();
        int remainingYears = retirement - age;
        System.out.println("You have" + remainingYears + "years left until retirement");
        System.out.println("It's " + currentData.getYear() + "so , you can retire in" + (currentData.getYear() + remainingYears));

    }


}
