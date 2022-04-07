package com.learnjava;

import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
/// First project
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        String principal = scanner.nextLine().trim();

        System.out.print("Annual Interest Rate: ");
        String annualInterestRate = scanner.nextLine().trim();

        System.out.print("Period (Years): ");
        String period = scanner.nextLine().trim();

        Double principalNumber = Double.parseDouble(principal);
        Double monthInterestRate = Double.parseDouble(annualInterestRate) / 100 / 12;
        Double periodMonths = Double.parseDouble(period) * 12;

        Double mortgage = (principalNumber * (monthInterestRate * (Math.pow((1 + monthInterestRate), periodMonths)))) / ((Math.pow((1 + monthInterestRate), periodMonths)) - 1);

        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
