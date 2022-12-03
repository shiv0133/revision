package Oops.Oops_Interface;

public class B implements A  {

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    @Override
    public void m3() {
        System.out.println("m3 method");
    }

    @Override
    public void m4() {
        System.out.println("m4 method");
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
