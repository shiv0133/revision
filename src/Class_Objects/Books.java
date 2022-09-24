package Class_Objects;

public class Books {

    String NAME ="JAVA PROGRAMMING";
    int PAGES=450;
    String  WRITTER ="R D SHARMA";

    public static void main(String[] args) {
        Books obj=new Books();
        System.out.println("NAME OF BOOK :" +obj.NAME);
        System.out.println("NUMBER OF PAGES :" +obj.PAGES);
        System.out.println("WRITTER OF BOOK :" +obj.WRITTER);

    }
}
