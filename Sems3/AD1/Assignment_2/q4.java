package Sems3.AD1.Assignment_2;
public class q4 {
    public static void main(String[] args) {
        System.out.println(fibo(10, 0, 1));
    }
    static int fibo(int n,int a,int b){
        if(n==0)
            return a;
        if(n==1)
            return b;
        return fibo((n-1),b,(b+a));
    }
}
