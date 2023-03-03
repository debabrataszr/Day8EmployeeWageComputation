package com.bridgelabz;

public class EmployeeWage {

    public static void calculateTotalWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHours) {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        int totalWage = 0;
        int workingHours = 0;
        System.out.println("Details of " + companyName + " employee");
        System.out.println("-----------------------------------------------------");
        System.err.println("Wage per hour:" + wagePerHr);
        System.out.println("Maximum working days:" + maxWorkingDays);
        System.out.println("Maximum working hours:" + maxWorkingHours);
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        for (int day = 1, totalWorkingHours = 0; day <= maxWorkingDays
                && totalWorkingHours <= maxWorkingHours; day++, totalWorkingHours += workingHours) {
            int empType = (int) (Math.random() * 100) % 3;
            switch (empType) {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
                    workingHours = 0;
                    break;
            }
            int wage = workingHours * wagePerHr;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHours + workingHours);
        }
        System.out.println("Total wage for a month of " + companyName + " employee is " + totalWage + "\n");
    }

    public static void main(String args[]) {
        calculateTotalWage("Accenture", 40, 15, 200);
        calculateTotalWage("TCS", 20, 10, 100);
    }
}