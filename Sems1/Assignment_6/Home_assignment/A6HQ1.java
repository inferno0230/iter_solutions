package Sems1.Assignment_6.Home_assignment;

import java.util.Scanner;

public class A6HQ1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        input.close();
        System.out.println(check(in));
    }

    private static Character check(String a){
        for (int i=0;i<a.length();i++){
            char temp = a.charAt(i);
            int flag = 0;
            for (int j=0;j<a.length();j++){
                if (i!=j && a.charAt(i)==a.charAt(j)){
                    flag = 1;
                    break;
                }
            }
            if (flag==0){
                return temp;
            }

        }
        return null;
    }
}
