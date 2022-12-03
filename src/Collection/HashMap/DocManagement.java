package Collection.HashMap;

import Model.Doctor;

import java.util.HashMap;
import java.util.Set;

public class DocManagement {

    public void CreateDoc(){

        HashMap <Integer, Doctor> doc= new HashMap<>();

        Doctor Doctor1=new Doctor("Dr. SHIV",45,"AGRA","Cardiologist");
        Doctor Doctor2=new Doctor("Dr.Radhey Shyam",43,"Nagpur","Orthopedist");
        Doctor Doctor3=new Doctor("Dr. Anil",62,"New Delhi","Ophthalmologist");
        Doctor Doctor4=new Doctor("Dr.Radhey Shyam",43,"Nagpur","Orthopedist");

        doc.put(1,Doctor1);
        doc.put(2,Doctor2);
        doc.put(3,Doctor3);
        doc.put(4,Doctor4);

        // printing using advance loop

        Set<Integer> keys= doc.keySet();
        System.out.println("***** DOCTORS LIST *******");
        for(Integer var:keys){
            System.out.println(doc.get(var).getName());
            System.out.println(doc.get(var).getAge());
            System.out.println(doc.get(var).getCity());
            System.out.println(doc.get(var).getSpecialist());
            System.out.println("************************************");
        }

    }

    public static void main(String[] args) {
        DocManagement obj=new DocManagement();
        obj.CreateDoc();

    }
}
