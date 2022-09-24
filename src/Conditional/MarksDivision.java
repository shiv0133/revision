package Conditional;

public class MarksDivision {
    public static void main(String[] args) {

        int marks=30;

        if(marks>=60){
            System.out.println("Student got First Division ");
        }
        else if (marks>=50 & marks <60 ) {

            System.out.println("Student got Second Division ");
        }
        else if (marks>=33 & marks<50) {

            System.out.println("Student got third Diivsion ");

        }

        else {
            System.out.println("Student is failed");
        }

    }

}
