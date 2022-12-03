package Collection.Demo;

import java.util.ArrayList;

public class DemoCollection {

    public void ArrayList(){

        ArrayList list=new ArrayList();

        // adding in the list
        list.add("AGRA"); // 0
        list.add("PUNE");  // 1
        list.add(123);   // 2
        list.add(12.1);   // 3

        System.out.println(list.get(1));
        System.out.println(list.get(3));
        System.out.println();
        System.out.println("USING FOR LOOP");
        for(int i=0 ; i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("USING ADVANCE FOR LOOP");

        for(Object var : list){
            System.out.println(var);
        }

        System.out.println(list);

        list.remove(2);
        System.out.println(list.get(2));

    }

    public static void main(String[] args) {
        DemoCollection obj =new DemoCollection();
        obj.ArrayList();
    }
}
