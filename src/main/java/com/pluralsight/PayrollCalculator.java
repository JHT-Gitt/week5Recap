package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    public static void payrollPrompt(){
        Scanner scanner = new Scanner(System.in);
        String name;
        float hoursWorked, payRate, money;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter hours worked: ");
        hoursWorked = scanner.nextFloat();
        System.out.println("Enter pay rate: ");
        payRate = scanner.nextFloat();

        money = hoursWorked * payRate;

        System.out.println("Employee Name: " +name);
        System.out.printf("Gross pay: %.2f", money);





    }

}
