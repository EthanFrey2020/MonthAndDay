package com.Lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner continueKB;
        continueKB = new Scanner(System.in);
        String keepGoing;
        int go = 0;

        while (go == 0) {
\
            System.out.println("Enter the date you were born (Ex September 18, 2001 enter 18)");
            int dayOfMonth = keyboard.nextInt();
            System.out.println("Enter the month number you were born on (Example September is 9, March is 3 and etc.");
            int month = keyboard.nextInt();
            System.out.println("Enter the year you were born in");
            int year = keyboard.nextInt();


            if (month == 1 || month == 2) {

                month = (month == 1) ? 13 : 14;
                year--;

            }


                int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                        + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;


                System.out.println("Day of the week is");
                switch (dayOfWeek){
                    case 0:
                        System.out.println("Saturday ");
                        System.out.println("Saturdays Child Work Hard For Their Living");
                        break;
                    case 1:
                        System.out.println("Sunday ");
                        System.out.println("The Child That is Born On The Sabbath Day Is " +
                                "Fair And Wise And Good In Every Way  |");
                        break;
                    case 2:
                        System.out.println("Monday  ");
                        System.out.println("Mondays Child Is Fair Of Face   ");
                        break;
                    case 3:
                        System.out.println("Tuesday ");
                        System.out.println("Tuesday Child Is Full of Grace  ");

                        break;
                    case 4:
                        System.out.println("Wednesday ");
                        System.out.println("Wednesdays Child Is Full Of Woe ");

                        break;
                    case 5:
                        System.out.println("Thursday ");
                        System.out.println("Thursday's child has far to go ");
                        break;
                    case 6:
                        System.out.println("Friday ");
                        System.out.println("Fridays Child Is Loving And Giving");
                        break;
                        
                }



        }
    }
}
