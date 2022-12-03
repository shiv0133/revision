package Collection.ArraylList;

import Model.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManagement {

    public ArrayList <Student> StudentData(){

        // SYNTAX :  ArrayLIst <DATA_TYPE> obj_Name =new ArrayList <>();

        ArrayList <Student> students = new ArrayList<>();

        Student student1= new Student("Shivendra",26,"Maths",62);
        Student student2= new Student("Shivam",22,"Science",56);
        Student student3= new Student("Raj",34,"Hindi",72);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println("*********PRINT USING ITERATOR***********");
        Iterator <Student> itr=students.iterator();
        while(itr.hasNext()){
            System.out.println("NAME : "+itr.next().getName() );
            System.out.println("MAKES : " +itr.next().getMarks() );
            System.out.println("AGE : "+itr.next().getAge() );

        }
        Iterator<Student> itr1=students.iterator();
        while(itr1.hasNext()) {
            System.out.println("SUBJECT " + itr1.next().getName());
        }
        System.out.println("\n**************************");
        System.out.println("USING SIMPLE FOR LOOP : ");
        System.out.println("***************************");
      for(int i=0;i<3;i++) {
          System.out.println(students.get(i).getName() +" " +students.get(i).getAge() +" " +students.get(i).getSubject() +" " +students.get(i).getMarks());
      }


      return  students;

}

    public static void main(String[] args) {
        StudentManagement obj=new StudentManagement();
        ArrayList <Student> b=obj.StudentData();
        System.out.println("\n**********************");
        System.out.println("USING ADVANCE LOOP");
        for(Student var:b){
            System.out.println(var.getName() +" " +var.getAge() +" "+var.getSubject() +" " +var.getMarks());
        }
        System.out.println("**********************");
        for (Student var :b){
            System.out.println("NAME:" +var.getName());
            System.out.println("AGE :" +var.getAge());
            System.out.println("SUB :" +var.getSubject());
            System.out.println("MARKS :"+var.getMarks());
            System.out.println("*************************");
        }

    }
}
