package com.learnjava;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
/*
        Second project
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        String userInput = scanner.nextLine().trim();

        Integer userInputNumber = Integer.parseInt(userInput);

        if(userInputNumber % 5 == 0 && userInputNumber % 3 == 0 ){
            System.out.println("FizzBuzz");
        }
        else if (userInputNumber % 5 == 0 ){
            System.out.println("Fizz");
        }
        else if(userInputNumber % 3 == 0 ){
            System.out.println("Buzz");
        }
        else{
            System.out.println(userInputNumber);
        }
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal (1K-1M): ");
        Integer principal = scanner.nextInt();

        while (principal < 1000 || principal > 1000000) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal (1K-1M): ");
            principal = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate (0-10): ");
        Float annualInterestRate = scanner.nextFloat();

        while (annualInterestRate <= 0 || annualInterestRate > 10) {
            System.out.println("Enter a value greater than 0 and less then or equal to 10.");
            System.out.print("Annual Interest Rate (0-10): ");
            annualInterestRate = scanner.nextFloat();
        }

        System.out.print("Period (Years 1-30): ");
        Integer period = scanner.nextInt();

        while (period < 1 || period > 30) {
            System.out.println("Enter a value between 1 to 30.");
            System.out.print("Period (Years 1-30): ");
            period = scanner.nextInt();
        }


        Float monthInterestRate = annualInterestRate / 100 / 12;
        Integer periodMonths = period * 12;

        double mortgage = (principal * (monthInterestRate * (Math.pow((1 + monthInterestRate), periodMonths)))) / ((Math.pow((1 + monthInterestRate), periodMonths)) - 1);

        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));


    }
}
