package Sems1.Assignment_5;
/* Write a program to print the following outputs using for loops:
 A
 A B
 A B C
 A B C D
 A B C D E
 */
public class A5Q7A {
    public static void main(String[]Args){
        for (int i = 1; i <= 5; i++) {
          for (int j = 'A'+1; j -'A' <= i; j++) {  // Use ASCII value of "A" in code
            int k = 0;
            k+=j;
            System.out.print((char)((int)k-1)+" "); // Typecast value of k into char since value of k has added ASCII value of 65 in it.
          }
          System.out.println();
        }
        
    }
}
