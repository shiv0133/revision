package ImpPrograms;

public class LowerCaseString {

    public void LowerString(){

        String Name= "SHIVENDRA PRATAP SINGH";
        String B=Name.toLowerCase();
        System.out.println(B);
    }

    public static void main(String[] args) {
        LowerCaseString obj =new LowerCaseString();
        obj.LowerString();
    }

}
