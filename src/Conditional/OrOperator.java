package Conditional;

public class OrOperator {
    public static void main(String[] args) {


        int ram =8;
        String brand ="DELL";

        if (ram >= 8 || brand == "DELL"){

            System.out.println("1+1=1, GOOD CONFIGURATION LAPTOP");

        }
        else{
            System.out.println("NOT A GOOD LAPTOP");
        }


        ram=16;
        brand="lenovo";

        if(ram > 8 || brand=="asus" ){
            System.out.println(" 1+0=1 ,GOOD CONFIGURATION LAPTOP ");
        }
        else{
            System.out.println("1*0=0 ,not eligible");
        }

        ram =4;
        brand="DELL";
        if(ram<8 || brand=="DELl"){
            System.out.println("0+1=1 GOOD CONFIGURATION LAPTOP");
        }
        else {
            System.out.println("not a god laptop");
        }

        ram=2;
        brand="lenovo";
        if (ram > 8 & brand =="AGRA"){
            System.out.println("person age is less than 18 and not eligible for voting in delhi");
        }
        else {
            System.out.println("0*0=0 , VERY POOR QUALITY");
        }
    }
}
