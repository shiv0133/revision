package Oops.Oops_inheritence;

public class B extends A {

    public static void main(String[] args) {
        B obj=new B();
        System.out.println("here from class B we called method of class A ");
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
