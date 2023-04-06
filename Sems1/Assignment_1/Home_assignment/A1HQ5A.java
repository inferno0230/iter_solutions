package Sems1.Assignment_1.Home_assignment;
/*Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
W will move to A, A to K, K to G and finally G to W. Exchange using with and without
using extra variables */

//With extra variable
public class A1HQ5A {
    public static void main(String[]Args){
        int a=1,b=2,c=3,d=4,z;
        System.out.println("Before swapping");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
        System.out.println("C= "+c);
        System.out.println("D= "+d);
        System.out.println("After swapping");
        z=d;
        System.out.println("A= "+z);
        z=c;
        System.out.println("B= "+z);
        z=b;
        System.out.println("C= "+z);
        z=a;
        System.out.println("D= "+z);
    }
    
}
