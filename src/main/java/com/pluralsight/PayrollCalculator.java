package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    public static void payrollPrompt(){
        Scanner scanner = new Scanner(System.in);
        String name;
        int weeklyHour= 40;
        float hoursWorked, payRate, money, overPay, overHour;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter hours worked: ");
        hoursWorked = scanner.nextFloat();
        System.out.print("Enter pay rate: ");
        payRate = scanner.nextFloat();

        if(hoursWorked > 40){
            overHour = hoursWorked - weeklyHour;
            overPay = (1.5f * payRate) * overHour;
            float beforeOvertime = weeklyHour * payRate;
            money = weeklyHour * payRate + overPay;

            System.out.println("\nEmployee Name: " +name);
            System.out.println("Hours overtime: " + overHour);
            System.out.println("Overtime pay: " + overPay);
            System.out.println("Gross pay before overtime: " + beforeOvertime );
            System.out.printf("Total Gross pay: %.2f \n", money);
        }else if (hoursWorked <= 40){
            money = hoursWorked * payRate;
            System.out.println("\nEmployee Name: " +name);
            System.out.printf("Total Gross pay: %.2f \n", money);
        }
        scanner.close();
    }
}
