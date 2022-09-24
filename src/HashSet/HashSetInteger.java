package HashSet;

import java.util.HashSet;

public class HashSetInteger {


    public HashSet<Integer> AgeInt(){

        HashSet<Integer> age=new HashSet<>();

        age.add(12);
        age.add(54);
        age.add(54);
        age.add(12);
        age.add(11);
        age.add(9);

        return age;
    }

    public static void main(String[] args) {
        HashSetInteger obj=new HashSetInteger();
        HashSet<Integer> c=obj.AgeInt();
        for(int var: c){
            System.out.println(var);
        }
    }
}
