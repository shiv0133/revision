package Methods;

public class AddSub {

    public void add(){
        int a=2;
        int b=5;
        int sum=a+b;
        System.out.println("Sum of the two numbers : "+sum);
    }
    public void sub(){
        int a=66;
        int b=44;
        int sub=a-b;
        System.out.println("Sub of two numbers : "+sub);
    }

    public static void main(String[] args) {

        AddSub obj=new AddSub(); //object create
        obj.add();  // object call
        obj.sub();  // object call
    }
}
