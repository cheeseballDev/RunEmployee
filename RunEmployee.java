package javaActivities;

import java.util.Scanner;

public class RunEmployee {

    public static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        Employee classEmployee = new Employee();
        

        System.out.println("Enter name:");
        classEmployee.setName();
        String finalName = classEmployee.getName();
        
        System.out.println("Press F for Full Time or P for Part Time");
        String selection = userInput.nextLine();
        boolean flag = true;
        while(flag){
            switch(selection) {
                case "F": 
                    FullTimeEmployee classFullTimeEmployee = new FullTimeEmployee();
                    System.out.println("Enter monthly salary: ");
                    classFullTimeEmployee.setMonthlySalary();
                    double finalWageFullTime = classFullTimeEmployee.getMonthlySalary();
                    System.out.println("Name: " + finalName);
                    System.out.println("Wage: " + finalWageFullTime);
                    
                    flag = false;
                    break;

                case "P":
                    PartTimeEmployee classPartTimeEmployee = new PartTimeEmployee();
                    System.out.println("Enter rate per hour and no. of hours worked separated by space: ");
                    classPartTimeEmployee.setWage();
                    double finalWagePartTime = classPartTimeEmployee.getWage();
                    System.out.println("Name: " + finalName);
                    System.out.printf("Wage: %.2f", finalWagePartTime);

                    flag = false;
                    break;

                default:
                    flag = true;
                    continue;
            }
        }
    }
}

class Employee {

    public static final Scanner userInput = new Scanner(System.in);

    private String name;

    public void setName() {
        String newName = userInput.nextLine();
        this.name = newName;
    }

    public String getName() {
        return name;
    }
}

class FullTimeEmployee {

    public static final Scanner userInput = new Scanner(System.in);

    private double monthlySalary;

    public void setMonthlySalary() {
        double newMonthlySalary = userInput.nextDouble();
        this.monthlySalary = newMonthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

}


class PartTimeEmployee {

    public static final Scanner userInput = new Scanner(System.in);

    public static double ratePerHour;
    public static int hoursWorked;
    private double wage;

    public void setWage() {
        String rateAndHours = userInput.nextLine();
        String[] twoNumbers = rateAndHours.split(" ");
        double ratePerHour = Double.parseDouble(twoNumbers[0]);
        int hoursWorked = Integer.parseInt(twoNumbers[1]);
        double newWage = ratePerHour * hoursWorked;
        this.wage = newWage;
    }

    public double getWage() {

        return wage;
    }
}