package com.learnjava;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
        this.currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentsSchedule() {
        System.out.println("PAYMENTS SCHEDULE");
        System.out.println("--------");

        double[] paymentsScheduleArray = mortgageCalculator.getPaymentsScheduleArray();

        for (int i = 0; i < paymentsScheduleArray.length; i++) {
            String remainingLoanCurrencyInstance = currency.format(paymentsScheduleArray[i]);
            System.out.println(remainingLoanCurrencyInstance);
        }
    }

    public void printMortgage() {
        double monthlyPayment = mortgageCalculator.calculateMonthlyPayment();
        String mortgageCurrencyInstance = currency.format(monthlyPayment);
        System.out.println("\n" + "MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageCurrencyInstance + "\n");
    }

}
