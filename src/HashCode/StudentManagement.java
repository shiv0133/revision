package HashCode;

import NewModel.Student;

import java.util.HashSet;

public class StudentManagement {
    public HashSet<NewModel.Student> StudentData1(){

        HashSet <NewModel.Student> stu=new HashSet<>();

        NewModel.Student st1=new NewModel.Student("RAJ",45,"HINDI",66);
        NewModel.Student st2=new NewModel.Student("Shiv ",47,"ENGLISH",88);
        NewModel.Student st3=new NewModel.Student("VIVEK",33,"MATHS",33);
        NewModel.Student st4= new NewModel.Student("RAJ",45,"HINDI",66);
        System.out.println("HASH CODE OF st1 : " +st1.hashCode());
        System.out.println("HASH CODE OF st4 : " +st4.hashCode());

        stu.add(st1);
        stu.add(st2);
        stu.add(st3);
        stu.add(st3);

        // there is no any get method in HashSet so printing can be done only advance loop

        return  stu;
    }

    public static void main(String[] args) {
        StudentManagement obj=new StudentManagement();
        HashSet <NewModel.Student> a=obj.StudentData1();
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


