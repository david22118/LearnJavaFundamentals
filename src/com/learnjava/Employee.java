package com.learnjava;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    static int numberOfEmployees;


    public Employee(int baseSalary, int hourlyRate) {
        this.validateWageDetail(baseSalary);
        this.validateWageDetail(hourlyRate);

        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
        this.numberOfEmployees++;
    }

    public Employee(int baseSalary) {
          this(baseSalary,0);
    }




    private void validateWageDetail(int wageDetail) {
        if (wageDetail < 0) {
            throw new IllegalArgumentException("Employee wage details (base salary, hourly rate ....) cannot be zero or less");
        }
    }

    public int calculateWage(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours) ;
    }

    public int calculateWage() {
        return calculateWage(0);
    }


    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
/*    int baseSalary = 50_000;
    int extraHours = 10;
    int hourlyRate = 20;

    int wage = calculateWage(hourlyRate, baseSalary, extraHours);
        System.out.println(wage);
}

    public static int calculateWage(int hourlyRate, int baseSalary, int extraHours) {
        return (hourlyRate * extraHours) + baseSalary;
    }*/
}
