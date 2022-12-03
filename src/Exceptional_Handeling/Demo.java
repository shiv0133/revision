package Exceptional_Handeling;

public class Demo {

    public  int Div(int a,int b){

        int div = 0;

        try {

            div=a/b;
        }
        catch (RuntimeException  e){

            System.out.println("Exception occurred 1..."+e);
        }
        catch (Exception e){

            System.out.println("Exception occurred 2..."+e);
        }


        return div;
    }


    public static void main(String[] args) {
        Demo obj=new Demo();

            int res=obj.Div(2,0);
          System.out.println("division of two no is : "+res );

    }
}
