package com.example.Calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Multiply");
        System.out.println("3. Subtract");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();
        int result;
        switch (choice) 
        {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero. try again");
                }
                break;
            default:
                System.out.println("Invalid input! Please choose a valid operation.");
        }
        scanner.close();
    }
}
