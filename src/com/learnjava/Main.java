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

        Principal principal = new Principal();
        AnnualInterestRate annualInterestRate = new AnnualInterestRate();
        Period period= new Period();

        int principalValue = principal.getValue(scanner);
        float annualInterestRateValue = annualInterestRate.getValue(scanner);
        int periodValue = period.getValue(scanner);

        double mortgage = calculateMortgage(annualInterestRateValue, periodValue, principalValue);
        String mortgageCurrencyInstance = getCurrencyInstance(mortgage);

        System.out.println(mortgageCurrencyInstance);

    }

    public static double calculateMortgage(Float annualInterestRate, Integer period, Integer principal) {
        Float monthInterestRate = annualInterestRate / 100 / 12;
        Integer periodMonths = period * 12;

        return (principal * (monthInterestRate * (Math.pow((1 + monthInterestRate), periodMonths)))) / ((Math.pow((1 + monthInterestRate), periodMonths)) - 1);
    }

    public static String getCurrencyInstance(double mortgage) {
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }
}
