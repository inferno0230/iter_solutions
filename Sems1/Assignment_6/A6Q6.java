

import java.util.Scanner;
public class A6Q6 {
    public static void main(String[]Args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String n = input.next();
    System.out.print("Enter a letter: ");
    char a = input.next().charAt(0);
    input.close();
    
    System.out.print(count(n, a));
    
    }

    public static int count(String str, char a){
    int count=0;
    for (int i = 0;i<str.length();i++){
        if(str.charAt(i)==a){
            count++;
        }
    }
    return count;
    }


}
