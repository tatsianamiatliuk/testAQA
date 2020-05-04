package edu.aqa.lesson3.secondtask;

public class Employee extends Department{
    private String employeeFirstName, employeeLastName;
    private int[] salary = new int[12];

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public int[] getSalary() {
        return salary;
    }

    public Employee (String compName, String depName, String depLocation, String firstName, String lastName, int [] salary) {
        super(compName, depName,depLocation);
        this.employeeFirstName = firstName;
        this.employeeLastName = lastName;
        for (int i : salary)
                this.salary = salary;
    }
}
