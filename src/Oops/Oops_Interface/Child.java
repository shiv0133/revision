package Oops.Oops_Interface;

public class Child implements Demo {
    @Override
    public void m1() {
        System.out.println("HERE M1 CAN WRITE");
    }

    @Override
    public void m2() {
        System.out.println("HERE M2 CAN WRITE ");
    }

    @Override
    public void m3() {
        System.out.println("HERE IS M3 CAN WRITE ");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
