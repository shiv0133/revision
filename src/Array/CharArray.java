package Array;

import java.sql.Array;
import java.util.Arrays;

public class CharArray {

    public void Char() {
        String a = "SHIVENDRA";

     //   for (int i = 0; i < a.length(); i++) {
      //      char c = a.charAt(i);
        //    System.out.println(c);
        //using char array
       char [] b = a.toCharArray();
      //  for(char var: b) {
           // System.out.print(var);
        System.out.println(Arrays.toString(b));
        }
    public static void main(String[] args) {
        CharArray obj=new CharArray();
        obj.Char();
    }
}
