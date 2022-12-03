package Collection.HashMap;

import Model.Student;

import java.util.HashMap;
import java.util.Set;

public class StuManagement {

    public void CreateList(){

        HashMap <String, Student> students=new HashMap<>();

        Student st1=new Student("RAJENDRA",23,"HINDI",45);
        Student st2=new Student("RAJENDRA",23,"HINDI",45);
        Student st3=new Student("SHIVENDRA",26,"MATHS",85);
        Student st4=new Student("VIVEK",33,"SCIENCE",56);

    students.put("abc",st1);
    students.put("asa",st2);
    students.put("dsd",st3);
    students.put("ssas",st4);


    // now we have to make set of keys using keySet method.

          Set  <String> a= students.keySet();
        System.out.println("************* STUDENT LIST *****************************");
          for(String var:a){
              System.out.println("NAME : "+students.get(var).getName());
              System.out.println("AGE : "+students.get(var).getAge());
              System.out.println("SUBJECT : "+students.get(var).getSubject());
              System.out.println("MARKS : "+students.get(var).getMarks());
              System.out.println("*********************************************");
          }

    }

    public static void main(String[] args) {
        StuManagement obj=new StuManagement();
        obj.CreateList();
    }
}
