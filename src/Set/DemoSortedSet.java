package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSortedSet {

    public void createSortedList(){

        SortedSet <String> List= new TreeSet();

        List.add("B");
        List.add("D");
        List.add("A");
        List.add("Z");
        List.add("X");
        System.out.println("HERE WE GOT NATURAL INCREASING ORDER");
        for(String var :List){
            System.out.println(var);

        }
    }

    public static void main(String[] args) {
        DemoSortedSet obj=new DemoSortedSet();
        obj.createSortedList();
    }
}
