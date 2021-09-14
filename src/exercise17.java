/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {

        System.out.printf("Enter a 1 if you are male, 2 if you are female: ");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine();
        int newGender = Integer.parseInt(gender);

        System.out.printf("How many ounces of alcohol did you have? ");
        Scanner scanner1 = new Scanner(System.in);
        String ounces = scanner1.nextLine();
        int alcohol = Integer.parseInt(ounces);

        System.out.printf("What is your weight, in pounds? ");
        Scanner scanner2 = new Scanner(System.in);
        String pounds = scanner2.nextLine();
        int newPounds = Integer.parseInt(pounds);

        System.out.printf("How many hours has it been since your last drink? ");
        Scanner scanner3 = new Scanner(System.in);
        String hours = scanner3.nextLine();
        float HourSinceLast = Float.parseFloat(hours);

        float bacf = (float) (((alcohol * (5.14 / newPounds) * 0.66) - .015) * HourSinceLast);
        float bacm = (float) (((alcohol * (5.14 / newPounds) * 0.73) - .015) * HourSinceLast);
        switch (newGender)
        {
            case 1:
                System.out.printf("Your BAC is %f.", bacm);
                if (bacm <= 0.08)
                {
                    System.out.printf("\nIt is legal for you to drive.");
                    break;
                }
            else
                {
                    System.out.printf("\nIt is not legal for you to drive.");
                    break;
                }
            case 2:
                System.out.printf("Your BAC is %f.", bacf);
                if (bacf <= 0.08)
                {
                    System.out.printf("\nIt is legal for you to drive.");
                    break;
                }
                else
                {
                    System.out.printf("\nIt is not legal for you to drive.");
                    break;
                }
        }
    }
}