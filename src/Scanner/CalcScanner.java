package Scanner;

import java.util.Scanner;

public class CalcScanner {

    public double add(double a, double b) {
        double sum=a+b;
        System.out.println("SUM OF THE GIVEN TWO NUMBERS : " +sum);
        return sum;
    }


    public double sub(double a, double b) {
        double sub=a+b;
        System.out.println("SUM OF THE GIVEN TWO NUMBERS : " +sub);
        return sub;
    }

    public double div(double a, double b) {
        double div=a+b;
        System.out.println("SUBTRACTION OF THE GIVEN TWO NUMBERS : " +div   );
        return div;
    }

    public double mul(double a, double b) {
        double mul=a+b;
        System.out.println("MULTIPLICATION OF THE GIVEN TWO NUMBERS : " +mul);
        return mul;

    }

    public double Square(double a) {
        double square=a*a;
        System.out.println("SQUARE OF NUMBER IS : " +square);
        return square;
    }

    public static void main(String[] args) {
        CalcScanner obj = new CalcScanner();
        Scanner scanner = new Scanner(System.in);

        String CONDITION="Y";

        while (CONDITION.equals("Y")) {
            System.out.println("PLEASE ENTER THE VALUE OF a : ");
            double a = scanner.nextDouble();
            System.out.println("PLEASE ENTER THE VALUE OF b : ");
            double b = scanner.nextDouble();

            System.out.println("PLEASE ENTER YOUR CHOICE :");
            System.out.println("PRESS 1 FOR ADDITION  :");
            System.out.println("PRESS 2 FOR SUBTRACTION  :");
            System.out.println("PRESS 3 FOR DIVISION  :");
            System.out.println("PRESS 4 FOR MULTIPLICATION  :");
            System.out.println("PRESS 5 FOR SQUARE OF a :");

            Scanner scanner1 = new Scanner(System.in);
            int CHOICE = scanner1.nextInt();

            if (CHOICE == 1) {

                obj.add(a, b);
            } else if (CHOICE == 2) {

                obj.sub(a, b);
            } else if (CHOICE == 3) {
                obj.div(a, b);
            } else if (CHOICE == 4) {
                obj.mul(a, b);
            }
            else if (CHOICE==5){
                obj.Square(a);
            }
            else{
                System.out.println("invalid please choose correct option");
            }

            System.out.println("ARE YOU WANT TO EXIT PLEASE PRESS N & PRESS Y FOR CONTINUE");
            Scanner scanner2=new Scanner(System.in);
            CONDITION = scanner2.nextLine();


        }
    }
}
