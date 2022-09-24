package ImpPrograms;

import java.util.Scanner;

public class PrimeNumber {

    public void prime(){
        Scanner sc= new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER :");
        int num =sc.nextInt();

        int count=0;

       for(int i=1 ; i<=num; i++) {

           if (num %i ==0 ) {

               count++;
           }

           }

        if(count==2){
            System.out.println("GIVEN NO. IS PRIME ");
        }
        else {
            System.out.println("GIVEN NO IS NOT PRIME");
        }
    }

    public static void main(String[] args) {
        PrimeNumber obj=new PrimeNumber();
        obj.prime();

    }

}