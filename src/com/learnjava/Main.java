package com.learnjava;

public class Main {

    public static void main(String[] args) {
        Principal principal = new Principal();
        AnnualInterestRate annualInterestRate = new AnnualInterestRate();
        Period period = new Period();


        int principalValue = principal.getValue();
        float annualInterestRateValue = annualInterestRate.getValue();
        int periodValue = period.getValue();

        MortgageCalculator mortgageCalculator = new MortgageCalculator(principalValue, annualInterestRateValue, periodValue);
        MortgageReport mortgageReport = new MortgageReport(mortgageCalculator);

        mortgageReport.printMortgage();
        mortgageReport.printPaymentsSchedule();
    }
}

