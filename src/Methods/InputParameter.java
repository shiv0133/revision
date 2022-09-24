package Methods;

public class InputParameter {

    public void marks(int marks){

        if(marks>=60){
            System.out.println("FIRST DIVISION");
        } else if ( marks>=50 & marks<60) {

            System.out.println("SECOND DIVISION");
        } else if (marks>=33 & marks<50) {

            System.out.println("THIRD DIVISION");

        }
        else {
            System.out.println("FAILED");
        }
    }

    public static void main(String[] args) {
        InputParameter obj=new InputParameter();
        obj.marks(50);
    }
}
