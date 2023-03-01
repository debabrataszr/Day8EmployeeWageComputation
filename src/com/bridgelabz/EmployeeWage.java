package com.bridgelabz;

public class EmployeeWage {
    static final int FULL_TIME = 2;
    static final int PART_TIME = 1;

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.Wage();
    }
        public void Wage() {

            final int WAGE_PER_HR = 20;
            final int MAX_WORKING_DAYS = 20;
            final int MAX_WORKING_HRS = 100;
            int totalWage = 0;
            int workingHours = 0;
            for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                    && totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHours) {
                int empType = (int) (Math.random() * 100) % 3;

                switch (empType) {
                    case FULL_TIME:
                        System.out.println("Employee is Present Full time");
                        workingHours = 8;
                        break;
                    case PART_TIME:
                        System.out.println("Employee is Present Part time");
                        workingHours = 4;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        workingHours = 0;
                        break;
                }
                int wage = workingHours * WAGE_PER_HR;
                totalWage += wage;
                System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHrs + workingHours);
            }
            System.out.println("Total wage for a month is " + totalWage);
        }
    }
