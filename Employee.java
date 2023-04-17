package com.constructor;


public class Employee {
        int employeeId ;
        int employeeAge ;
        String employeeFirstName;
        String employeelastName;
        String employeeCompanyName ;
        String employeeCity;
        float employeeSalary;

    public Employee(int employeeId, int employeeAge, String employeeFirstName, String employeelastName, String employeeCompanyName, String employeeCity, float employeeSalary) {
        this.employeeId = employeeId;
        this.employeeAge = employeeAge;
        this.employeeFirstName = employeeFirstName;
        this.employeelastName = employeelastName;
        this.employeeCompanyName = employeeCompanyName;
        this.employeeCity = employeeCity;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", employeeId=" + employeeId +
                ", employeeAge=" + employeeAge +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeelastName='" + employeelastName + '\'' +
                ", employeeCompanyName='" + employeeCompanyName + '\'' +
                ", employeeCity='" + employeeCity + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee(10,24,"Shubham","Shrikhande","TCS","pune",30000);
        System.out.print(emp);
    }
}
