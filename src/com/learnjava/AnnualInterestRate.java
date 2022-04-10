package com.learnjava;

import java.util.Scanner;

public class AnnualInterestRate implements LoanValues <Float>{
    @Override
    public Float getValue(Scanner scanner) {
        System.out.print("Annual Interest Rate (0-10): ");
        Float annualInterestRate = scanner.nextFloat();

        while (annualInterestRate <= 0 || annualInterestRate > 10) {
            System.out.println("Enter a value greater than 0 and less then or equal to 10.");
            System.out.print("Annual Interest Rate (0-10): ");
            annualInterestRate = scanner.nextFloat();
        }

        return annualInterestRate;
    }
}
