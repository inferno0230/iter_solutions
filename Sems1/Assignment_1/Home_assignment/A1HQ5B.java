
public class A1HQ5B {
    public static void main(String[]Args){
        int a=1,b=2,c=3,d=4;
        System.out.println("Before swapping");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
        System.out.println("C= "+c);
        System.out.println("D= "+d);
        d=a+b+c+d;
        c=d-(a+b+d);
        b=d-(a+b+c);
        a=d-(a+b+c);
        d=d-(a+b+c);
        System.out.println("After swapping");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
        System.out.println("C= "+c);
        System.out.println("D= "+d);
    }
}
