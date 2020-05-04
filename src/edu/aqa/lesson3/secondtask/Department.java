package edu.aqa.lesson3.secondtask;

public class Department extends Company {
    private String departmentName, departmentLocation;

    public Department (String CompName, String depName, String depLocation){
        super(CompName);
        this.departmentName = depName;
        this.departmentLocation = depLocation;
    }

    public String getDepartmentLocation() {
        return departmentLocation;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
