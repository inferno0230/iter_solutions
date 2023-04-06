package Sems1.Assignment_2.Home_assignment;
public class A2HCLQ1 {
    public static void main(String[]args){
        double principle = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        System.out.println(principle*(1+ rate/time));
    }
}
