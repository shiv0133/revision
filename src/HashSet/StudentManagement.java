package HashSet;

import Model.Student;

import java.util.HashSet;

public class StudentManagement {

    public  HashSet <Student> StudentData1(){

        HashSet <Student> stu=new HashSet<>();

        Student student1= new Student("Shivendra",26,"Maths",62);
        Student student2= new Student("Shivam",22,"Science",56);
        Student student3= new Student("Raj",34,"Hindi",72);
        Student student4= new Student("Raj",34,"Hindi",72);

        stu.add(student1);
        stu.add(student2);
        stu.add(student3);
        stu.add(student4);

      // there is no any get method in HashSet so printing can be done only advance loop

        return  stu;
    }

    public static void main(String[] args) {
        StudentManagement obj=new StudentManagement();
        HashSet <Student> a=obj.StudentData1();
        System.out.println("\n*********HashSet***********");
        System.out.println("===================================");
        for (Student var:a){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getSubject());
            System.out.println(var.getMarks());
            System.out.println("=================================");
        }

    }
}
