
import java.util.Scanner;
public class P1Q1 {
        public static void main(String[]Args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter value of N: ");
            int size = input.nextInt();
            int a[] = new int[size];
            System.out.println("Enter "+size+" numbers: ");
            for (int i=0;i<a.length;i++){
            a[i] = input.nextInt();
            }
            input.close();

            System.out.println(add(a));
            System.out.println(avg(a));
        }

        public static int add(int a[]){
            int sum = 0;
            for (int i=0;i<a.length;i++){
                sum+=a[i];
            }
            return sum;
        }
        
        public static double avg(int a[]){
            double avg = add(a)/a.length;
            return avg;
        }

        
}
