package edu.aqa.lesson3.secondtask;


public class Department{
    private String departmentName;
    private Employee[] employees;// = new Employee[]{new Employee("Tania","Miatliuk", 100), new Employee("Ivan","Ivanov", 150),new Employee("Petr","Petriv", 160)};

    public Department (String depName){
        this.departmentName = depName;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int sumSalary(){
        int sum;
        sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }
}
