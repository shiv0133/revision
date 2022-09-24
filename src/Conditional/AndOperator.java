package Conditional;

public class AndOperator {
    public static void main(String[] args) {

        int age=18;
        String city="DELHI";

        if (age >= 18 & city == "DELHI"){

            System.out.println("1*1=1, person age is greater than 18 and eligible for voting in delhi");

        }
        else{
            System.out.println("NOT ELIGIBLE");
        }


        age=19;
        city="CHENNAI";

         if(age> 18 & city=="AGRA" ){
             System.out.println("  person age is less than 18 and not eligible for voting in delhi");
         }
         else{
             System.out.println("1*0=0 ,not eligible");
         }

         age =27;
         city="DELHI";
         if(age<18 & city=="DELHI"){
             System.out.println("person age is less than 18 and not eligible  voting in delhi");
         }
         else {
             System.out.println("0*1=0 , not eligible");
         }

         age=23;
         city="PUNE";
         if (age<18 & city =="AGRA"){
             System.out.println("person age is less than 18 and not eligible for voting in delhi");
         }
         else {
             System.out.println("0*0=0 , not eligible");
         }

    }
}
