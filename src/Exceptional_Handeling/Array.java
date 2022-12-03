package Exceptional_Handeling;

public class Array {
    public static void main(String[] args) {

        int [] a={1,2,3,4,5,6};

        try{
        for (int i=0;i<=a.length;i++) {
            System.out.println("a:" + a[i]);
        }
         catch(IOException e2){

        }
        catch( e){

        }


            int [] b={2,3,4,5,6};
            for( int i=0;i< b.length;i++){
            System.out.println(b[i]);
        }
        }
    }

