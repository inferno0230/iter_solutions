package Sems2.Assignment_3;
/* Write a recursive Java method that takes a character string s and outputs its reverse. For
example, the reverse of ' pots&pans' would be ' snap&stop'. */

public class A3Q10 {
    private static String reverse(String s) {
        String rev = "";
        if (s.length()>0) {
            rev = reverse(s.substring(1))+s.charAt(0);
        } else {
            return "";
        }
        return rev;
    }
    public static void main(String []args) {
        System.out.println(reverse("pots&pans"));
    }
}
