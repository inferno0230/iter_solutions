

public class A6Q10 {
    public static void main(String[]args){
        int a = 4; // length of square
        area(a);
        int l = 10,b=5; // Dimens of rectangle
        area(l,b);
        double height=40,base=5.5; // Dimens of tiangle
        area(height,base);
        double radius=3.14; // Dimens of circle
        area(radius);
    }

    public static void area(int a){
        System.out.println("Area of Square with lenght "+a+" is "+a*a);
    }

    public static void area(int l,int b){
        System.out.println("Area of Square with lenght "+l+" and width "+b+" is "+(l*b));
    }

    public static void area(double b,double h){
        System.out.println("Area of Triangle with Height "+h+" and width "+b+" is "+(0.5*b*h));
    }

    public static void area(double r){
        System.out.println("Area of Circle with radius "+r+" is "+(2*Math.PI*r*r));
    }

}
