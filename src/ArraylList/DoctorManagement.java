package ArraylList;

import Model.Doctor;

import java.util.ArrayList;

public class DoctorManagement {


    public ArrayList <Doctor> DoctorData(){

        ArrayList <Doctor> Doctors =new ArrayList<>();
        Doctor doctor1=new Doctor("Dr. Rajeev",45,"Kanpur","Cardiologist");
        Doctor doctor2=new Doctor("Dr.Avinash",55,"Agra","Neurologist");
        Doctor doctor3=new Doctor("Dr. Anil",62,"New Delhi","Ophthalmologist");
        Doctor doctor4=new Doctor("Dr.Radhey Shyam",43,"Nagpur","Orthopedist");

        Doctors.add(doctor1);
        Doctors.add(doctor2);
        Doctors.add(doctor3);
        Doctors.add(doctor4);

        return  Doctors;
    }

    public static void main(String[] args) {
        DoctorManagement obj=new DoctorManagement();
        ArrayList <Doctor> a=obj.DoctorData();
        System.out.println("******** DOCTORS DATA *********");
        for(Doctor var:a){
            System.out.println("NAME :"+var.getName());
            System.out.println("SPECIALIZATION :"+var.getSpecialist());
            System.out.println("AGE :"+var.getAge());
            System.out.println("CITY :"+var.getCity());
            System.out.println("*******************************");
        }

    }

}
