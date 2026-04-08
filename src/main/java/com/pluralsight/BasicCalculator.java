package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1 = myScanner.nextDouble();

        System.out.println("Enter your Second number: ");
        double num2 = myScanner.nextDouble();
        myScanner.nextLine();
        double result = num1 * num2;

        System.out.println("Please select an option (A), (S), (M), (D) ");
        String selection = myScanner.nextLine();

        System.out.println(num1 + " * " + num2 + " = " + result);
        myScanner.close();
    }
}
