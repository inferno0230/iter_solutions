package Sems2.Assignment_2;
import java.util.Scanner;

class product {
    int pid;
    double tot_price;

    void getData(int pid,double tot_price){
        this.pid = pid;
        this.tot_price = tot_price;
    }

    void display(){
        System.out.println("Price of product "+pid+" is "+tot_price);
    }
}
public class A2Q4 {
    public static void main(String[]args){
        product p[] = new product[5];
        for (int i=0;i<p.length;i++){
            p[i] = new product();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the pid of the product: ");
            int pid = input.nextInt();
            System.out.print("Enter the price of product: ");
            Double price = input.nextDouble();
            p[i].getData(pid,price);
        }

        double total = 0;
        for (int i=0;i<p.length;i++){
            total += p[i].tot_price;
        }
        System.out.println("Total price of all products is: "+total);
    }
    
}
