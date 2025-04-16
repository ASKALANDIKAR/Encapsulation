

//   Create a class Employee with fields: empId, empName, salary.
//  Use getter and setter methods.
//  If salary is set below 10,000, it should display a warning message

package com.practice;
import java.util.Scanner;
public class Employee {
    private int empId;
    private String name;
    private double salary;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        if(empId>=1){
        this.empId = empId;
        }
        else {
            System.err.println("Employee's ID Invalid 🤖");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary<10000){
            System.err.println("Salary is too Low....\n Please Increment 🙏🙏");
            this.salary=salary;
        }
        else {
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ID: ");
        int n= sc.nextInt();
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Salary: ");
        double sal = sc.nextDouble();
        Employee emp = new Employee();
        emp.setEmpId(n);
        System.out.println("Employee ID: "+emp.getEmpId());
        emp.setName(name);
        System.out.println("Employee's Name: "+emp.getName());
        emp.setSalary(sal);
        System.out.println("Employee's Salary: "+ emp.getSalary());
    }
}

