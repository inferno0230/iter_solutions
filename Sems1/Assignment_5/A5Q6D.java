/* Write a program to print the following outputs using for loops:
1
12
123
1234
12345 */

public class A5Q6D {
    public static void main(String[]Args){
        for (int i = 1; i <= 5; i++) {
          for (int j = 1; j <= i; j++) {
            int k = 0;
            k+=j;
            System.out.print(k+" ");
          }
          System.out.println();
        }
        
    }
}
