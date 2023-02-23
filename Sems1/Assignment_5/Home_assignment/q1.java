package Sems1.Assignment_5.Home_assignment;

public class q1 {
    public static void main(String[]Args){
        for (int i=1;i<=5;i++){
            for (int j=5;j>=1;j--){
                if (i==j){
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
