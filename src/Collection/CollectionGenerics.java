package Collection;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;

public class CollectionGenerics {

    public ArrayList <String> Generics(){
// SYNTAX : COLLECTION NAME <DATA TYPE> OBJ NAME = NEW COLLECTION NAME < >();
        ArrayList <String> cities =new ArrayList < > ();

        cities.add("AGRA");   //0
        cities.add("KANPUR");  //1
        cities.add("NEW DELHI"); //2
        cities.add("PUNE");   //3
        cities.add("MUMBAI");  //4


        return cities;
    }
    public ArrayList <Integer> IntGenerics() {

        ArrayList <Integer> marks =new ArrayList < > ();

        marks.add(43);
        marks.add(55);
        marks.add(62);
        marks.add(43);
        marks.add(20);
        marks.add(33);


             return marks;

        }

        public static void main(String[] args) {

        CollectionGenerics obj=new CollectionGenerics();
        ArrayList <String> cities= obj.Generics();

        for(int i=0; i<cities.size();i++) {
            System.out.println(cities.get(i));
        }

            ArrayList <Integer> marks=obj.IntGenerics();
           for(Integer var: marks){
               System.out.println(var);
           }


    }
}
