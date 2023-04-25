package Sems2.Assignment_2;
import java.util.Scanner;

class Deposit {
    long principle;
    int time;
    double rate;
    double total_amt;

    void Deposit() {
        this.principle = 0;
        this.time = 0;
        this.rate = 0;
        this.total_amt = 0;
    }

    void Deposit(long principle,int time,double rate){
        this.principle = principle;
        this.time = time;
        this.rate = rate;
        this.total_amt = 0;
    }

    void Deposit(long principle,int time){
        this.principle = principle;
        this.time = time;
        this.rate = 7;
        this.total_amt = 0;
    }

    void Deposit(long principle,double rate) {
        this.principle = principle;
        this.time = 5;
        this.rate = rate;
        this.total_amt = 0;
    }

    void display(){
        System.out.println("Principle = "+this.principle+"\nTime = "+this.time+"\nRate = "+this.rate+"\n");
    }

    void calc_amt(){
        this.total_amt = principle + ((principle*rate*time)/100);
        System.out.println("Total ammount is : "+this.total_amt);
    }
}

public class A2Q6 {
    public static void main(String[]args){
        Deposit user1 = new Deposit();
        Deposit user2 = new Deposit();
        Deposit user3 = new Deposit();
        Deposit user4 = new Deposit();
        user1.Deposit();
        user2.Deposit(800,5,7.0);
        user3.Deposit(800,5);
        user4.Deposit(800,7.0);

        user1.display();
        user2.display();
        user3.display();
        user4.display();

        user1.calc_amt();
        user2.calc_amt();
        user3.calc_amt();
        user4.calc_amt();
    }
}
