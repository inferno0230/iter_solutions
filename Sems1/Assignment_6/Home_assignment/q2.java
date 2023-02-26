package Sems1.Assignment_6.Home_assignment;

public class q2 {
    public static void main(String[]args){
        int s = 4;
        area(s);
        double r = 4.5;
        area(r);
        int l=4,b=12,h=32;
        area(l,h,b);
        
    }

    public static void area(int a){
        System.out.println("Volume of Cube is "+Math.pow(a,3));
    }

    public static void area(int a,int b,int c){
        System.out.println("Volume of Cuboid is "+a*b*c);
    }

    public static void area(double a){
        System.out.println("Volume of Sphere is "+(4/3)*Math.PI*a*a*a);
    }
    
}
