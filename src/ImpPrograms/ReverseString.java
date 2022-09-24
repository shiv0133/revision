package ImpPrograms;

import java.util.Scanner;

public class ReverseString {

    public void RString(){

        Scanner SC=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE STRING :");

        String city =SC.nextLine();

        String  REVERSE ="";

       int l=city.length();
       for(int i= l-1; i>=0;i--){

         REVERSE= REVERSE+ city.charAt(i);
       }
       System.out.println("YOUR REVERSE OF STRING IS : "+REVERSE);
    }

    public static void main(String[] args) {
        ReverseString obj=new ReverseString();
        obj.RString();
    }
}
