package Exceptional_Handeling;

public class Voting {

    public void vote(int age) throws AgeNotEligible {

        if ( age<18){
            throw new AgeNotEligible ("Voter Age is more less than 18 & not eligible for voting" );
        }
        else {
            System.out.println("Welcome to Voting  ");
        }
    }

    public static void main(String[] args) {

        Voting obj=new Voting();
        try {
            obj.vote(17);
        }
        catch (Exception e){
            System.out.println("exception occoured...."+e);
        }
    }
}
