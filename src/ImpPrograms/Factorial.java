package ImpPrograms;

public class Factorial {

    public void fact() {

        int number=6;
        int factorial=1;

        for (int i=number; i>0 ; i--){
        factorial= factorial*i;
        }
        System.out.println("FACTORIAL OF GIVEN NO IS : "+factorial);


}
    public static void main(String[] args) {
            Factorial obj=new Factorial();
            obj.fact();


    }
}
