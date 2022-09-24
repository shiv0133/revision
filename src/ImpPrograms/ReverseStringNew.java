package ImpPrograms;

public class ReverseStringNew {
    public void reverse(){
        String str="SHIVENDRA";
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        ReverseStringNew obj=new ReverseStringNew();
        obj.reverse();
    }
}
