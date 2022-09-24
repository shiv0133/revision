package Conditional;

public class VotingAge {
    public static void main(String[] args) {
        int age=19;
        if(age>18){
            System.out.println("Candidate eligible for voting ");
        }
        else {
            System.out.println("Candidate not eligible for voting ");
        }

        String city="DElHI";
        if(city=="Agra"){

            System.out.println("Candidate belong to agra ");
        }
        else
            System.out.println("not belongs to agra ");
    }
}
