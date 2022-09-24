package ImpPrograms;

import java.util.Scanner;

public class FactorialScanner {

    public void FactScanner (){

        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER");
        int num =sc.nextInt();
        int fact=1;
        for(int i=num; i>0;i--) {
            fact = fact * i;
        }
        System.out.println("FACTORIAL OF GIVEN NUMBER IS : "+fact);
    }

    public static void main(String[] args) {
        FactorialScanner obj=new FactorialScanner();
        obj.FactScanner();
    }
}
