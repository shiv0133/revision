package HashSet;

import Model.Employee;

import java.util.HashSet;

public class EmployeeManagement {

    public HashSet<Employee> EmpData() {

        HashSet<Employee> emp = new HashSet<>();

        Employee employee1 = new Employee("Raj", 34, 42525.23, "IT");
        Employee employee2 = new Employee("Utkarsh", 56, 76000.34, "Testing");
        Employee employee3 = new Employee("Rajeev", 45, 45000.50, "Purchase");
        Employee employee4 = new Employee("Manoj", 30, 45787.90, "Developer");


        emp.add(employee1);
        emp.add(employee2);
        emp.add(employee3);
        emp.add(employee4);

        return emp;
    }

    public static void main(String[] args) {


        EmployeeManagement obj = new EmployeeManagement();
        HashSet <Employee> a=obj.EmpData();
        System.out.println("*********** using HashSet ********************");
        for(Employee var:a){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getSalary());
            System.out.println(var.getDept());
            System.out.println("==============================================");
        }
    }
}