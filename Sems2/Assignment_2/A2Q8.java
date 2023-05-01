package Sems2.Assignment_2;

interface DetailInfo {
    void display();
    int count();
}

class Person2 implements DetailInfo {
    static int maxcount = 0;
    String name;

    public Person2(String name) {
        this.name = name;
        maxcount = Math.max(maxcount, name.length());
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public int count() {
        return name.length();
    }
}

public class A2Q8 {
    public static void main(String[]args){
        Person2 p1 = new Person2("Aditya");
        Person2 p2 = new Person2("Ganyu");
        p1.display();
        System.out.println(p1.count());       
        p2.display();
        System.out.println(p2.count());
    }
}
