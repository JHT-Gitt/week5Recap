package com.pluralsight;
import java.util.Scanner;


public class BasicCalculator {



    public static void calculate(){

        String option;
        float answer;
        float firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextFloat();

        System.out.println("Possible calculations:\n(A)-Add\n(S)-Subtract\n(M)-Multiply\n(D)-Divide");
        System.out.println("Please select an option: ");
        option = scanner.next();
        if(option.equals("M") || option.equals("m")){
            answer = firstNumber * secondNumber;
            System.out.printf("Answer is: %.2f", answer);
        }else if(option.equals("A") || option.equals("a")) {
            answer = firstNumber + secondNumber;
            System.out.printf("Answer is: %.2f", answer);
        }else if(option.equals("s") || option.equals("S")){
            answer = firstNumber - secondNumber;
            System.out.printf("Answer is: %.2f", answer);
        }else if(option.equals("d") || option.equals("D")){
            answer = firstNumber / secondNumber;
            System.out.printf("Answer is: %.2f", answer);
        }else{
            System.out.println("Invalid option");
        }
    }




}
