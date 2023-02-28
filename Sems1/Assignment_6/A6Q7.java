

import java.util.Scanner;
public class A6Q7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String in = input.next();
        input.close();
        System.out.println("Total vowels in "+in+" is "+count(in));
        
    }

    public static int count(String str){
        int count = 0;
        char a[] = {'a','e','i','o','u'};

        for (int i = 0;i<str.length();i++){
            if(str.charAt(i)==a[0] || str.charAt(i)==a[1] || str.charAt(i)==a[2] || str.charAt(i)==a[3] || str.charAt(i)==a[4] ){
                count++;
            }
        }
        return count;
    }
}
