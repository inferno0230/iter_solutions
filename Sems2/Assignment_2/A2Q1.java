package Sems2.Assignment_2;
import java.util.Scanner;
class Phone {
    int area_code;
    int exchange;
    int number;

    void input(int area_code, int exchange, int number) {
        this.area_code = area_code;
        this.exchange = exchange;
        this.number = number;
    }

    void display () {
        System.out.println("My number is ("+area_code+") "+exchange+"-"+number);
    }
}
public class A2Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Phone user1 = new Phone();
        user1.area_code = 212;
        user1.exchange = 767;
        user1.number = 8900;
        
        Phone user2 = new Phone();
        System.out.println("Enter your area_code, exchange, number seperately. ");
        user2.input(input.nextInt(), input.nextInt(), input.nextInt());

        user1.display();
        
        System.out.println("Your number is ("+user2.area_code+") "+user2.exchange+"-"+user2.number);

    }
}
