import java.util.Scanner;

/*
* PROGRAM:Comment2.java
* Written by Francisco Ramos
* This program calculates company payroll
* */
public class hw4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your pay rate? (Enter 100)\n");
        double payRate = scan.nextDouble();

        System.out.println("What is your pay rate? (Enter 40)\n");
        double hours = scan.nextDouble();

        System.out.println("What is your pay rate? (Enter 123)\n");
        double employeeNumber = scan.nextDouble();

        double totalPay=payRate*hours;

        System.out.println("Employee: "+employeeNumber+" has made, "+totalPay);




    }
}
