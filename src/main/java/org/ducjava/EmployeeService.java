package org.ducjava;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    HashSet<Employee> employeeHashSet = new HashSet<Employee>();

    Employee emp1 = new Employee(101, "ducnguyen", 24, "Developer", 25000);
    Employee emp2 = new Employee(102, "ducngoc", 26, "IT", 57000);
    Employee emp3 = new Employee(103, "ngoc hai", 20, "DevOps", 5000);
    Employee emp4 = new Employee(104, "nha to", 27, "System Tech", 70000);

    Scanner sc = new Scanner(System.in);
    private boolean found = false;
    private int id;
    private String name;
    private int age;
    private String department;

    private double salary;

    public EmployeeService() {

        employeeHashSet.add(emp1);
        employeeHashSet.add(emp2);
        employeeHashSet.add(emp3);
        employeeHashSet.add(emp4);

    }

    //view all employees
    public void viewAllEmployees() {
        for (Employee emp : employeeHashSet) {
            System.out.println(emp);
        }
    }

    //view emp based on there id
    public void viewEmployee() {

        System.out.print("Enter id: ");
        id = sc.nextInt();
        for (Employee emp : employeeHashSet) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Employee is not present. Check id again please!");
        }
    }

    //add employee
    public void addEmployee() {
        System.out.print("Enter id:");
        id = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter Department: ");
        department = sc.next();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        Employee emp = new Employee(id, name, age, department, salary);

        employeeHashSet.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");

    }

    //update the employee
    public void updateEmployee() {
        System.out.print("Enter id: ");
        id = sc.nextInt();
        boolean found = false;
        for (Employee emp : employeeHashSet) {
            if (emp.getId() == id) {
                System.out.print("Enter name: ");
                name = sc.next();
                System.out.print("Enter new Salary: ");
                salary = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.print("Updated Details of employee are: ");
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            System.out.println("Employee details updated successfully !!");
        }
    }

    //delete employee
    public void deleteEmployee() {
        System.out.print("Enter id");
        id = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : employeeHashSet) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            employeeHashSet.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }
    }



}

