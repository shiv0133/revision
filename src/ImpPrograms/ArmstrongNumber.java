package ImpPrograms;

public class ArmstrongNumber {

    public void ArmstrongNum(){

        int num=153;
        int a=0;
        int b=num;
        while (num>0){
            int r=num%10;
            num=num/10;
            a= (r*r*r)+a;
        }
        if(b==a) {
            System.out.println("YES IT IS A ARMSTRONG NUMBER " +a);
        }
        else {
            System.out.println("NOT A ARMSTRONG NO  " +a);

        }

    }

    public static void main(String[] args) {
        ArmstrongNumber obj =new ArmstrongNumber();
        obj.ArmstrongNum();
    }
}
