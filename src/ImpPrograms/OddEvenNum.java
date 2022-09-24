package ImpPrograms;

import java.util.Scanner;

public class OddEvenNum {

    public void OddEven(){
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println( num+" GIVEN NO. IS EVEN ");
        }
        else {
            System.out.println(num +" GIVEN NO IS NOT PRIME");
        }

    }

    public static void main(String[] args) {
        OddEvenNum obj=new OddEvenNum();
        obj.OddEven();
    }
}
