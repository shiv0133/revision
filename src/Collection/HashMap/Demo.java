package Collection.HashMap;

import Model.Student;

import java.util.HashMap;
import java.util.Set;

public class Demo {

    public void CreateHashMap(){

        // syntax: Hashmap <Datatype Key,  DataType value> name=new Hashmap<>();

        HashMap<Integer,String> hashmap=new HashMap<>();

        hashmap.put(1,"HINDI");
        hashmap.put(2,"JAVA");
        hashmap.put(5,"PYTHON");
        hashmap.put(3,"MATHS");


        System.out.println("1 : " +hashmap.get(1));
        System.out.println("2 : "+hashmap.get(2));
        System.out.println("5 : "+hashmap.get(5));
        System.out.println("3 : "+hashmap.get(3));


        // change in set and make collection

        Set<Integer > keys=hashmap.keySet();
        System.out.println("*******using advance for loop******");
        for(Integer var: keys){
            System.out.println(hashmap.get(var));
        }


        // hash map using user input


      HashMap<Integer,Student> st=new HashMap<>();

        Student student1= new Student("Shivendra",26,"Maths",62);
        Student student2= new Student("Shivam",22,"Science",56);
        Student student3= new Student("Raj",34,"Hindi",72);
        Student student4= new Student("Raj",34,"Hindi",72);


        st.put(1,student1);
        st.put(2,student2);
        st.put(3,student3);
        st.put(4,student4);

        System.out.println("\n******* printing from user input ********");
        System.out.println(st.get(1).getName());
        System.out.println(st.get(1).getAge());
        System.out.println(st.get(1).getSubject());
        System.out.println(st.get(1).getMarks());

        System.out.println("\n****** using advance for loop ***********");

            Set<Integer> keys1= st.keySet();
        for(Integer var: st.keySet()){
            System.out.println(st.get(var).getName());
            System.out.println(st.get(var).getAge());
            System.out.println(st.get(var).getSubject());
            System.out.println(st.get(var).getMarks());
            System.out.println("**************************************************");
        }


    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.CreateHashMap();
    }
}
