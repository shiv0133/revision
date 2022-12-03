package Basic.Conditional;

public class NotOperator {

    public static void main(String[] args) {

        int age=19;

        if(!(age>18)){

            System.out.println("statement is true ,  print");
        }
        else{
            System.out.println("not print");
        }
        age=13;
        if(!(age<12)){
            System.out.println("print");
        }
        else{
            System.out.println("Statement not true not print");
        }

    }

}
