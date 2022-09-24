package ImpPrograms;

public class PalindromeString {

    public void palindromeS(){

        String name= "MADAM";
        String reverse ="";

        int a=name.length();

        for(int i=a-1; i>=0;i--)
        {
            reverse= reverse+name.charAt(i);
        }

        System.out.println(reverse);

        if(reverse.equals(name)) {
            System.out.println(reverse +" GIVEN STRING IS PALINDROME ");
        }
        else{
            System.out.println(reverse +"  NOT PALINDROME ");
        }
    }

    public static void main(String[] args) {
        PalindromeString obj=new PalindromeString();
        obj.palindromeS();
    }
}
