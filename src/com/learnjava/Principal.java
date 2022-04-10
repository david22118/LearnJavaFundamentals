package com.learnjava;

import java.util.Scanner;

public class Principal implements LoanValues <Integer> {
    @Override
    public Integer getValue(Scanner scanner) {
        System.out.print("Principal (1K-1M): ");
        Integer principal = scanner.nextInt();

        while (principal < 1000 || principal > 1000000) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal (1K-1M): ");
            principal = scanner.nextInt();
        }
        return principal;
    }
}
