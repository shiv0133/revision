package Conditional;

public class SwitchWeek {
    public static void main(String[] args) {

        int week=9;
        switch (week){
            case 1:
                System.out.println("DAY IS MONDAY");
                break;
            case 2:
                System.out.println("DAY IS TUESDAY");
                break;
            case 3:
                System.out.println("DAY IS WEDNESDAY");
                break;
            case 4:
                System.out.println("DAY IS THURSDAY");
                break;
            case 5:
                System.out.println("DAY IS FRIDAY");
                break;
            case 6:
                System.out.println("DAY IS SATURDAY");
                break;
            case 7:
                System.out.println("DAY IS SUNDAY");
                break;
            default :
                System.out.println("PLEASE ENTER A VALID NUMBER");
        }
    }
}
