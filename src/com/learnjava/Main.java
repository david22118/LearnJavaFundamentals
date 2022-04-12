package com.learnjava;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Principal principal = new Principal();
        AnnualInterestRate annualInterestRate = new AnnualInterestRate();
        Period period = new Period();

        int principalValue = principal.getValue(scanner);
        float annualInterestRateValue = annualInterestRate.getValue(scanner);
        int periodValue = period.getValue(scanner);

        printMortgage(principalValue, annualInterestRateValue, periodValue);
        printPaymentsSchedule(principalValue, annualInterestRateValue, periodValue);

    }

    public static double calculateMortgage(Float annualInterestRate, Integer period, Integer principal) {
        Float monthInterestRate = annualInterestRate / 100 / 12;
        Integer periodMonths = period * 12;

        return (principal * (monthInterestRate * (Math.pow((1 + monthInterestRate), periodMonths)))) / ((Math.pow((1 + monthInterestRate), periodMonths)) - 1);
    }

    private static void printMortgage(int principalValue, float annualInterestRateValue, int periodValue) {
        double mortgage = calculateMortgage(annualInterestRateValue, periodValue, principalValue);
        String mortgageCurrencyInstance = getCurrencyInstance(mortgage);
        System.out.println("\n" + "MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageCurrencyInstance + "\n");
    }

    public static double getRemainingLoan(Integer principal, Float monthInterestRate, Integer periodMonths, Integer paymentsMade) {

        return principal * ((Math.pow((1 + monthInterestRate), periodMonths)) -
                (Math.pow((1 + monthInterestRate), paymentsMade))) / ((Math.pow((1 + monthInterestRate), periodMonths)) - 1);
    }

    public static void printPaymentsSchedule(Integer principal, Float annualInterestRate, Integer period) {
        System.out.println("PAYMENTS SCHEDULE");
        System.out.println("--------");

        Float monthInterestRate = annualInterestRate / 100 / 12;
        Integer periodMonths = period * 12;
        Integer paymentsMade = 1;

        while (paymentsMade <= periodMonths) {

            double remainingLoan = getRemainingLoan(principal, monthInterestRate, periodMonths, paymentsMade);
            String remainingLoanCurrencyInstance = getCurrencyInstance(remainingLoan);
            System.out.println(remainingLoanCurrencyInstance);

            paymentsMade++;

        }

    }

    public static String getCurrencyInstance(double mortgage) {
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }
}
