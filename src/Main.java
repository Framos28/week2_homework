/**/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double regularWages;
        double overtimeWages;
        double totalWages;



        System.out.println("What is your base pay? (Enter 25)\n");
        double basePay = scan.nextDouble();

        System.out.println("How many hours did you work that were not overtime this week? (Enter 40)\n");
        double regularHours= scan.nextDouble();

        System.out.println("How much do you get paid overtime? (Enter 37.5)\n");
        double overtimePay = scan.nextDouble();

        System.out.println("How many hours did you work overtime this week? (Enter 10)\n");
        double overtimeHours = scan.nextDouble();


        regularWages=basePay*regularHours;
        overtimeWages=overtimePay*overtimeHours;
        totalWages=regularWages+overtimeWages;

        System.out.println("Wages for this week are: $"+totalWages);


    }
}