package Oops.OopsAbstarction;

public class B extends A {
    @Override
    public void m1() {
        System.out.println("this is m1 method of class A and here ohter user can write code as there requirement");
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.m1();
        obj.m2();
    }
}
