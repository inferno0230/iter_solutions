package Sems2.Assignment_2.A2Q10;
import Sems2.Assignment_2.A2Q10.package1.*;
import Sems2.Assignment_2.A2Q10.package2.*;

public class A2Q10 implements Sports_A2Q10 {
    public static void main(String[] args) {
        Test_A2Q10 test = new Test_A2Q10();
        test.input();
        test.output();
        
        int grandTotal = test.getTotalMarks() + score1 + score2;
        System.out.println("Grand total marks + score: " + grandTotal);
    }
    
    public int getScore1() {
        return score1;
    }
    
    public int getScore2() {
        return score2;
    }
}


