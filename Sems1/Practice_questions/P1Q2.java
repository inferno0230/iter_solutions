
import java.util.Scanner;
public class P1Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int a[] = new int[size];
        System.out.println("Enter "+size+" numbers: ");
        for (int i=0;i<a.length;i++){
            a[i] = input.nextInt();
        }
        input.close();

        System.out.println(prime(a));
        
    }

    public static int prime(int a[]){
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=3;j<(a.length/2);j++){
                if(a[i]==1 || a[i]==2 || a[i]==3){
                    count+=1;
                } else if (a[i]%j!=0){
                    count+=1;
                }
            }
        }
        return count;
    }
}
