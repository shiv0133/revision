package Collection.HashCode;

import NewModel.DoctorNew;

import java.util.HashSet;

public class DocManagement {

        public HashSet<DoctorNew> DocData(){

        HashSet<DoctorNew> doc=new HashSet<>();

            DoctorNew doc1=new DoctorNew("Dr. SHIV",45,"AGRA","Cardiologist");
            DoctorNew doc2=new DoctorNew("Dr.Radhey Shyam",43,"Nagpur","Orthopedist");
            DoctorNew doc3=new DoctorNew("Dr. Anil",62,"New Delhi","Ophthalmologist");
            DoctorNew doc4=new DoctorNew("Dr.Radhey Shyam",43,"Nagpur","Orthopedist");

            System.out.println("hash code for doc2 : "+doc2.hashCode());
            System.out.println("hasg code for doc3 : "+doc4.hashCode());

        doc.add(doc1);
        doc.add(doc2);
        doc.add(doc3);
        doc.add(doc4);


        return doc;

    }

    public static void main(String[] args) {
        DocManagement obj=new DocManagement();
        HashSet<DoctorNew> a=obj.DocData();

        System.out.println("\n******************* DOCTORS LIST **********************");
        for(DoctorNew var:a){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getCity());
            System.out.println(var.getSpecialist());
            System.out.println("======================================");
        }
    }
}



