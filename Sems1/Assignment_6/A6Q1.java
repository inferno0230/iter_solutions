

import java.util.Scanner;
public class A6Q1 {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number x: ");
        int x = input.nextInt();
        System.out.print("Enter two number y: ");
        int y = input.nextInt();
        System.out.print("* / + - % and square root (sq): ");
        String choice = input.next();
        input.close();

        switch(choice){
            case "+":
                System.out.println(additionSimple(x, y));
                break;
            case "-":
                System.out.println(subtractionSimple(x, y));
                break;
            case "*":
                System.out.println(multiplicationSimple(x, y));
            case "/":
                System.out.println(divisionSimple(x, y));
                break;
            case "%":
                System.out.println(remainderSimple(x, y));
                break;
            case "sq":
                System.out.println(squareRootSimple(x));
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }

    public static int additionSimple(int x, int y){
        return x+y;
    }

    public static int subtractionSimple(int x, int y){
        return x-y;
    }

    public static int multiplicationSimple(int x, int y){
        return x*y;
    }

    public static double divisionSimple(int x, int y){
        return x/y;
    }

    public static int remainderSimple(int n, int m){
        return n%m;
    }

    public static double squareRootSimple(int n){
        return Math.pow(n,2);
    }

}
