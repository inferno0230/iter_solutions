package Sems3.AD1.Assignment_2;
import java.util.Arrays;
public class q8 {
    public static void main(String[] args) {
        int[] a = { -1,-4,0,1,2,3};
        Arrays.sort(a);
        System.out.print("Smallest missing no.");
        System.out.println(smallestmissing(a, 1));
    }
    static int smallestmissing(int[] temp, int i) {
        if (i == temp.length) {
            return temp[temp.length - 1] + 1;
        }
        if (temp[i] <= 0 || temp[i] == temp[i - 1] + 1) {
            return smallestmissing(temp, i + 1);
        }
        if (temp[i] > temp[i - 1] + 1) {
            return temp[i - 1] + 1;
        }
        return 1;
    }
}