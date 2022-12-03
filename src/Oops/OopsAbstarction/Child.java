package Oops.OopsAbstarction;

public class Child extends Oops_Abstraction {
    @Override
    public void m1() {
        System.out.println("child can write code here as there requirement");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();
        obj.m2();
    }
}
