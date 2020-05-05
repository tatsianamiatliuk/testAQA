package edu.aqa.lesson3.secondtask;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Senla");
        Department[] arrayDepartments = new Department[]{new Department("QA"), new Department("AQA")};
        Employee[] arrayEmployees = new Employee[]{new Employee("Ivan", "Ivanov", 130), new Employee("Petr", "Petrov", 120)};

        company.setDepartments(arrayDepartments);
        arrayDepartments[0].setEmployees(new Employee[]{new Employee("Ivan", "Ivanov", 130), new Employee("Petr", "Petrov", 120)});
        arrayDepartments[1].setEmployees(new Employee[]{new Employee("Fedor", "Bondarchuk", 1200), new Employee("Irina", "Hokomada", 1250)});
        System.out.print("Common month salary: " + company.commonSalary());
    }
}
