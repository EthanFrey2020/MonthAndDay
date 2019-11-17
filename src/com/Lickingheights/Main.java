package com.Lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// MonthAndDayProject
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the date you were born (Ex September 18, 2001 enter 18)");
        int dayOfMonth = keyboard.nextInt();

        System.out.println("Enter the month number you were born on (Example September is 9, March is 3 and etc.");
        int month = keyboard.nextInt();

        System.out.println("Enter the year you were born in");
        int year = keyboard.nextInt();

        if (month == 1 || month ==2){
                month = (month == 1) ? 13: 14;
                year --;
        }



    }
}
