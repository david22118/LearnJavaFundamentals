package com.learnjava;

import java.util.Scanner;

public class Period implements LoanValues <Integer> {
    @Override
    public Integer getValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Period (Years 1-30): ");
        Integer period = scanner.nextInt();

        while (period < 1 || period > 30) {
            System.out.println("Enter a value between 1 to 30.");
            System.out.print("Period (Years 1-30): ");
            period = scanner.nextInt();
        }

        return period;
    }
}
