package Array;

public class ArrayDemo {
    public void array (){

        String [] cities = {"AGRA" ,"KANPUR","DELHI","PUNE","MUMBAI","PATNA"};
        //                     0       1        2       3      4         5
        System.out.println("PRINTING NAME USING SIMPLE PROGRAM");
        System.out.println(cities[5]);
        System.out.println(cities[3]);
        System.out.println();
        System.out.println("USING FOR LOOP");
        for(int i=0;i<=5;i++){
            System.out.println(cities[i]);
        }
        System.out.println();
        System.out.println("PRINTING USING ADVANCE FOR LOOP");
                for(String var :cities){
                    System.out.println(var);
                }
    }

    public static void main(String[] args) {
        ArrayDemo obj=new ArrayDemo();
        obj.array();
    }
}
