package edu.aqa.lesson3.secondtask;

import java.util.Scanner;

import static java.lang.System.in;

public class Accountancy {
    public static void main(String[] args) {
        int salary = 0;
        int sumSalary = 0;
        int[] salaryArray = new int[12];

        Company company = new Company("Senla");

        Scanner in = new Scanner(System.in);
        System.out.print("Input count of departments: ");
        int countDep = in.nextInt();
        Department[] departments = new Department[countDep];
        System.out.print("Input count of employees: ");
        int countEmpl = in.nextInt();
        System.out.print("Input number of the aggregated month: ");
        int month = in.nextInt();
        Employee[][] arrayEmployees = new Employee[countDep][countEmpl];

        for (int i = 0; i < countDep; i++) {
            departments[i] = new Department(company.getCompanyName(), "Department" + i+1, "Location" + i+1);
            for (int j = 0; j < countEmpl; j++) {
                for (int s = 0; s < 11; s++) {
                    salaryArray[s] = (new java.util.Random()).nextInt(1000);
                }
                arrayEmployees[i][j] = new Employee(company.getCompanyName(), departments[i].getDepartmentName(), departments[i].getDepartmentLocation(), "FirstName" + i + j, "FirstName" + i + j, salaryArray);
            }
        }

        for (int i = 0; i < countDep; i++) {
            for (int j = 0; j < countEmpl; j++) {
                sumSalary += arrayEmployees[i][j].getSalary()[month];
                System.out.print("Employee " + arrayEmployees[i][j].getEmployeeFirstName() + " earned | " + arrayEmployees[i][j].getSalary()[month] + "\n");
            }
        }

        System.out.println("Total: " + sumSalary);
        in.close();
    }
}
