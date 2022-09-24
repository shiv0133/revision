package HashSet;

import java.util.HashSet;

public class HashSetString {

    public   HashSet <String> cities(){

        HashSet <String> cities =new HashSet<>();

        cities.add("AGRA");
        cities.add("KANPUR");
        cities.add("DELHI");
        cities.add("AGRA");
        cities.add("PUNE");
        cities.add("KANPUR");

    for (String var :cities){
        System.out.println(var);

    }
        return cities;
    }

    public static void main(String[] args) {
        HashSetString obj=new HashSetString ();
        HashSet <String>  a=obj.cities();
        System.out.println("***************************");
        for (String var :a){
            System.out.println(var);
        }
    }
}
