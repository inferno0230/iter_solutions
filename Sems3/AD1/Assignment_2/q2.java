package Sems3.AD1.Assignment_2;
public class q2 {
    public static void main(String[] args) {
        int [] a={2,1,4,5,0,2};
        System.out.println(min(a, 0, a[0]));
        System.out.println(max(a, 0, a[0]));
    }
    static int min(int []a,int i,int min){
        if(i>a.length-1)
            return min;
        if(a[i]<min)
            min=a[i];
        return min(a, (i+1), min);
    }
    static int max(int []a,int i,int max){
        if(i>a.length-1)
            return max;
        if(a[i]>max)
            max=a[i];
        return max(a, (i+1), max);
    }
}