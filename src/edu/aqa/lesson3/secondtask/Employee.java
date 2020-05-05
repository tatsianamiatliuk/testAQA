package edu.aqa.lesson3.secondtask;

public class Employee{
    private String employeeFirstName;
    private String employeeLastName;
    private int salary;

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public int getSalary() {
        return salary;
    }

    public Employee (String firstName, String lastName, int salary) {
        this.employeeFirstName = firstName;
        this.employeeLastName = lastName;
        this.salary = salary;
    }
}
