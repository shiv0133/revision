package Set;

import java.util.TreeSet;

public class DemoTreeSet {

    public void CreateList(){

        TreeSet <Integer> s1 = new TreeSet<>();

        s1.add(12);
        s1.add(12);
        s1.add(13);
        s1.add(1214);
        s1.add(1213);
        s1.add(132);
        s1.add(15);


        System.out.println("null not allowed");
        for(Integer var: s1) {
       System.out.println(var);
             }
    }

    public static void main(String[] args) {
        DemoTreeSet obj=new DemoTreeSet();
        obj.CreateList();
    }
}
