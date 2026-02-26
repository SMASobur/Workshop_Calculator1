package se.lexicon;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {

            System.out.println("        ");
            System.out.println("       Simple Calculator ");
            System.out.println("--------------------------------");

            System.out.println("Enter first number:");
            double num1 = myScanner.nextDouble();

            System.out.println("Enter operator (+, -, *, /):");
            char operator = myScanner.next().charAt(0);

            System.out.println("Enter second number:");
            double num2 = myScanner.nextDouble();


            System.out.println("Given task is: "+ num1+ " "+ operator + " "+ num2);
        }
    }
}