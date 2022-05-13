package com.learnjava;


public class MortgageCalculator {

    private int principalValue;
    private float annualInterestRateValue;
    private int periodYears;

    public MortgageCalculator(int principalValue, float annualInterestRateValue, int periodYears) {
        this.principalValue = principalValue;
        this.annualInterestRateValue = annualInterestRateValue;
        this.periodYears = periodYears;
    }

    public double calculateMonthlyPayment() {
        float monthInterestRate = getMonthInterestRate();
        int periodMonths = getPeriodMonths();

        return (principalValue * (monthInterestRate * (Math.pow((1 + monthInterestRate), periodMonths)))) /
                ((Math.pow((1 + monthInterestRate), periodMonths)) - 1);
    }

    private double getRemainingLoan(int paymentsMade) {
        float monthInterestRate = getMonthInterestRate();
        int periodMonths = getPeriodMonths();

        return principalValue * ((Math.pow((1 + monthInterestRate), periodMonths)) -
                (Math.pow((1 + monthInterestRate), paymentsMade))) / ((Math.pow((1 + monthInterestRate), periodMonths)) - 1);
    }

    public double[] getPaymentsScheduleArray() {
        double[] paymentsScheduleArray = new double[getPeriodMonths()];

        for (int i = 0; i < paymentsScheduleArray.length; i++) {
            paymentsScheduleArray[i] = getRemainingLoan(i+1);
        }

        return paymentsScheduleArray;
    }

    private float getMonthInterestRate() {
        return annualInterestRateValue / 100 / 12;
    }

    private int getPeriodMonths() {
        return periodYears * 12;
    }
}
