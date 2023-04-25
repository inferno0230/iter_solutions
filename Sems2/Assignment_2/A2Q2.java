package Sems2.Assignment_2;
class Complex {
    double real;
    double imag;
    
    public void setData(double r, double i) {
        real = r;
        imag = i;
    }
    
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }
    
    public void add(Complex c) {
        real += c.real;
        imag += c.imag;
    }
}

public class A2Q2 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.setData(2.0, 3.0);
        Complex c2 = new Complex();
        c2.setData(1.0, 4.0);
        System.out.print("First complex number: ");
        c1.display();
        System.out.print("Second complex number: ");
        c2.display();
        c1.add(c2);
        System.out.print("Sum of the two complex numbers: ");
        c1.display();
    }
}
