package Methods;

public class MulDiv {
    public void mul(){
        int a=43;
        int b=66;
        int mul=a*b;
        System.out.println("mul of two numbers : "+mul);
    }
    public void div(){
        float a=43;
        float b=4;
        float div=a/b;
        System.out.println("Div of two numbers : "+div);
    }

    public static void main(String[] args) {
        MulDiv obj=new MulDiv();
        obj.div();
        obj.mul();
    }
}
