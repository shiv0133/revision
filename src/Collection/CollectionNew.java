package Collection;

import java.util.ArrayList;

public class CollectionNew {
    public void New(){

        ArrayList list=new ArrayList();

        //adding variables
        list.add("AGRA");
        list.add(23.4);
        list.add("RAMESH");
        list.add(11);
        list.add("DELHI");
        list.add(0);
        list.add("SHIV");

        System.out.println(list.get(1));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println("");
        System.out.print(list.get(0));
        System.out.print(" "+list.get(2));
        System.out.print(" "+list.get(3));
        System.out.println("");

        // simple for loop
        System.out.println("");
        System.out.println("printing using simple for loop");

        for(int i=0;i<list.size();i++ ){
            System.out.println(list.get(i));
        }
        // advance for loop

        System.out.println("");
        System.out.println("printing using advance for loop" );
        for(Object var:list){
            System.out.println(var);
        }
        System.out.println("");
        System.out.println("printing directly list");
        System.out.println(list);

        // removing elements
        System.out.println("");
        System.out.println("printing after removal element at index 1");
        list.remove(1);
        for (Object var1 : list) {
            System.out.println(var1);
        }
        System.out.println(" ");
        System.out.println("printing in a line after remove index 1");
        for(Object var2 :list) {
            System.out.print(" " + var2);
        }
    }

    public static void main(String[] args) {
        CollectionNew obj=new CollectionNew();
        obj.New();
    }
}
