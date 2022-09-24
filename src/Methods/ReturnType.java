package Methods;

public class ReturnType {

    public String hello(String name){

        String message= "Welcome to JAVA " +name;

        System.out.println(message);

        return message;
    }

    public double RectangleArea(double a, double b){

        double Area=a*b;

        System.out.println("AREA OF RECTANGLE a*b = "+Area);

        return Area;

    }


    public static void main(String[] args) {

        ReturnType obj=new ReturnType();
        String NAME=obj.hello("RAJ KUMAR");
        obj.RectangleArea(12.3,45.3);
    }
}
