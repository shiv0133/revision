package HashSet;

import java.util.HashSet;

public class HashSetDouble {

    public HashSet <Double > Salary(){

        HashSet <Double > sal =new HashSet<>();
        sal.add(343343.65);
        sal.add(343343.76);
        sal.add(12323.56);
        sal.add(143343.76);
        sal.add(343343.76);

        return  sal;
    }

    public static void main(String[] args) {
        HashSetDouble obj=new HashSetDouble();
        HashSet <Double > b=obj.Salary();
        for(Double var:b){
            System.out.println("Double using HashSet : "+var);
        }
    }
}
