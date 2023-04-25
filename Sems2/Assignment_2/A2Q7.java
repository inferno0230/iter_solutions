package Sems2.Assignment_2;

abstract class Shape {
    abstract double area();
}

class Square extends Shape {
    double side;
    
    Square(double side) {
        this.side = side;
    }
    
    double area() {
        return side * side;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    double area() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double area() {
        return Math.PI * radius * radius;
    }
}

public class A2Q7 {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 6);
        Shape circle = new Circle(3);
        
        System.out.println("Area of square: " + square.area());
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Area of circle: " + circle.area());
    }
}
