
import java.util.Scanner;
public class P1Q6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a[] = new double[10];
        for (int i=0;i<a.length;i++){
            System.out.println("Enter ten numbers: ");
            a[i] = input.nextDouble();
        }
        input.close();

        System.out.print("The minimum number is: "+min(a));


    }

    public static double min(double[] array){
        double min = array[0];
        double sec_min = Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(min>array[j]){
                    min = array[j];
                }
                
            }

        }
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(sec_min>array[j] && array[j]>min){
                    sec_min = array[j];
                }
                
            }

        }

        return sec_min;
    }
}
