package HashCode;

import Model.Employee;
import NewModel.NewEmp;

import java.util.HashSet;

public class EmpManagement {

    public HashSet<NewEmp> EmpData() {

        HashSet<NewEmp> emp = new HashSet<>();

        NewEmp emp1=new NewEmp("Raj", 34, 42525.23, "IT");
        NewEmp emp2=new NewEmp("Utkarsh", 56, 76000.34, "Testing");
        NewEmp emp3=new NewEmp("Rajeev", 45, 45000.50, "Purchase");
        NewEmp emp4=new NewEmp("Utkarsh", 56, 76000.34, "Testing");

        System.out.println("hash set for emp2 : "+emp2.hashCode());
        System.out.println("hash set for emp4 : "+emp4.hashCode());

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);

        return emp;
    }

    public static void main(String[] args) {


        EmpManagement obj = new EmpManagement();
        HashSet <NewEmp> a=obj.EmpData();
        System.out.println("\n*********** using HashSet ********************");
        for(NewEmp var:a){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getSalary());
            System.out.println(var.getDept());
            System.out.println("==============================================");
        }
    }

}
