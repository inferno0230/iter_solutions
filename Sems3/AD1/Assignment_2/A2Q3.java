package Sems3.AD1.Assignment_2;
public class A2Q3 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
}
