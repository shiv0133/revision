package ImpPrograms;

public class InterviewChhotu {

    public static void main(String[] args) {
            int num;
        for (int i=1; i<=5;i++){
            if(i%2==0){
               num=0;
               for(int j=1; j<=5;j++){
                   System.out.println(num);
                   num=(num==0)? 1:0;
               }
            }
            else {
                num=1;
                for(int j=1; j<5;j++){
                    System.out.println(num);
                    num=(num==2)?1:0;

                }
            }
        }
        System.out.println();

    }
}
