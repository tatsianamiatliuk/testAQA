package edu.aqa.lesson3.secondtask;

public class Company {
    private String companyName;
    private Department[] departments;// = new Department[]{new Department("QA"),new Department("AQA")};

    public Company(String name) {
        this.companyName = name;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int commonSalary(){
        int commonSum = 0;
        for (Department department : departments) {
            commonSum += department.sumSalary();
        }
        return commonSum;
    }
}
