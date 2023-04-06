package Sems1.Assignment_2;

public class A2CLQ2 {
    public static void main(String[]args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if (x < 0 || y < 0){
            System.out.println("Negative numbers are not allowed.");
        } else {
            System.out.println(x+" to the power "+y+" is "+(int)Math.pow(x, y));
        }
        

    }
}
