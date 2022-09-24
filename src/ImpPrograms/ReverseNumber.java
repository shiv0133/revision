package ImpPrograms;

import java.util.Scanner;

public class ReverseNumber {
    
    public void RNumber(){

        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NO WHOSE REVERSE YOU HAVE TO FIND :");
        int num =sc.nextInt();

        while(num>0) {
            int r = num % 10;
            num=num/10;
            s=(s*10)+r;

        }
        System.out.println("REVERSE OF GIVEN NUMBER IS :" +s);
        
    }
    public static void main(String[] args) {
        ReverseNumber obj=new ReverseNumber();
        obj.RNumber();

    }
}
