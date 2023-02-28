
import java.util.Scanner;

public class P1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[100];
        System.out.print("Enter the integers between 1 and 100: ");

        int number = input.nextInt();
        while (number != 0) {
            counts[number-1]++;
            number = input.nextInt();
        }
        input.close();

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println(i+1 + " occurs " + counts[i] + " " + (counts[i] > 1 ? "times" : "time"));
            }
        }
    }
}
