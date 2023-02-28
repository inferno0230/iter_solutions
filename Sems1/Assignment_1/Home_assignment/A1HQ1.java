/*
 What do each of the following print?
a) System.out.println(2 + "bc");
b) System.out.println(2 + 3 + "bc");
c) System.out.println((2+3) + "bc");
d) System.out.println("bc" + (2+3));
e) System.out.println("bc" + 2 + 3);
 */

public class A1HQ1 {
    public static void main(String[]Args){
    System.out.println(2 + "bc"); //Output: 2bc
    System.out.println(2 + 3 + "bc"); //Output: 5bc 
    System.out.println((2+3) + "bc"); //Output: 5bc
    System.out.println("bc" + (2+3)); //Output: bc5
    System.out.println("bc" + 2 + 3); //Output: bc23
    }   
}