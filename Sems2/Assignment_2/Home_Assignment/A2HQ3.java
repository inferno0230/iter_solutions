package Sems2.Assignment_2.Home_Assignment;

class Distance {
    int meters;
    int centimeters;

    Distance(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }

    void display() {
        System.out.println("Distance: " + meters + " meters " + centimeters + " centimeters");
    }

    Distance sum(Distance d) {
        int totalMeters = this.meters + d.meters;
        int totalCentimeters = this.centimeters + d.centimeters;
        if (totalCentimeters >= 100) {
            totalMeters += totalCentimeters / 100;
            totalCentimeters = totalCentimeters % 100;
        }
        return new Distance(totalMeters, totalCentimeters);
    }
}

public class A2HQ3 {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 70);
        Distance d2 = new Distance(3, 30);
        Distance sum = d1.sum(d2);
        
        d1.display();
        d2.display();
        sum.display();
    }
}

