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

            System.out.println("Enter an operator (+, -, *, /):");
            char operator = myScanner.next().charAt(0);

            System.out.println("Enter second number:");
            double num2 = myScanner.nextDouble();


            System.out.println("Given task is: "+ num1+ " "+ operator + " "+ num2);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator, valid operators +, -, *, /");
            }
        }
    }
}