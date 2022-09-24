package HashSet;

import Model.Doctor;

import java.util.HashSet;

public class DoctorManagement {

    public  HashSet<Doctor> DocData(){

        HashSet<Doctor> doc=new HashSet<>();
        Doctor doctor1=new Doctor("Dr. Rajeev",45,"Kanpur","Cardiologist");
        Doctor doctor2=new Doctor("Dr.Avinash",55,"Agra","Neurologist");
        Doctor doctor3=new Doctor("Dr. Anil",62,"New Delhi","Ophthalmologist");
        Doctor doctor4=new Doctor("Dr.Radhey Shyam",43,"Nagpur","Orthopedist");
        Doctor doctor5=new Doctor("Dr.Radhey Shyam",43,"Nagpur","Orthopedist");

        doc.add(doctor1);
        doc.add(doctor2);
        doc.add(doctor3);
        doc.add(doctor4);
        doc.add(doctor5);


        return doc;

    }

    public static void main(String[] args) {
        DoctorManagement obj=new DoctorManagement();
        HashSet<Doctor> a= obj.DocData();

        System.out.println("******************* DOCTORS LIST **********************");
        for(Doctor var:a){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getCity());
            System.out.println(var.getSpecialist());
            System.out.println("======================================");
        }
    }
}
