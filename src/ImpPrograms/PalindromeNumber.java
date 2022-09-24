package ImpPrograms;

import java.util.Scanner;

public class PalindromeNumber {

    public void PalindromeNum() {

        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER :");
        int num=sc.nextInt();

        int c;
        int s=0;
         c=num;
         while(num>0){
            int r=num%10;
            num=num/10;
            s=(s*10)+r;
         }
         if(s==c){
             System.out.println("GIVEN NUMBER IS PALINDROME");
         }
         else {
             System.out.println(("NOT PALINDROME"));
         }

    }

    public static void main(String[] args) {
        PalindromeNumber obj=new PalindromeNumber();
        obj.PalindromeNum();
    }
}
