package Sems2.Assignment_1;

public class A1Q4 {
    public static void main(String[] args) {
        char[] arr = {'c', 'a', 'r', 'b', 'o', 'n'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < arr.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    for (int l = 0; l < arr.length; l++) {
                        if (l == i || l == j || l == k) {
                            continue;
                        }
                        for (int m = 0; m < arr.length; m++) {
                            if (m == i || m == j || m == k || m == l) {
                                continue;
                            }
                            for (int n = 0; n < arr.length; n++) {
                                if (n == i || n == j || n == k || n == l || n == m) {
                                    continue;
                                }
                                System.out.println("" + arr[i] + arr[j] + arr[k] + arr[l] + arr[m] + arr[n]);
                            }
                        }
                    }
                }
            }
        }
    }
}
