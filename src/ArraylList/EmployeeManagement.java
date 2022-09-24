package ArraylList;

import Model.Employee;

import java.util.ArrayList;

public class EmployeeManagement {

    public  ArrayList <Employee> EmployeeData(){

        ArrayList <Employee> employees=new ArrayList<>();

        Employee employee1=new Employee("Raj",34,42525.23,"IT");
        Employee employee2=new Employee("Utkarsh",56,76000.34,"Testing");
        Employee employee3=new Employee("Rajeev",45,45000.50,"Purchase");
        Employee employee4=new Employee("Manoj" ,30,45787.90,"Developer");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        return employees;
    }

    public static void main(String[] args) {

        EmployeeManagement obj=new EmployeeManagement();
        ArrayList <Employee> c=obj.EmployeeData();
        System.out.println("\n********* EMPLOYEE DATA ********");
        for (Employee var:c){
            System.out.println("NAME :"+var.getName());
            System.out.println("AGE :"+var.getAge());
            System.out.println("SALARY :"+var.getSalary());
            System.out.println("Dept. :" +var.getDept());
            System.out.println("*****************************************");


        }
    }
}
