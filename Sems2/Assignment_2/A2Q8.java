package Sems2.Assignment_2;

class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int Eid;
    double salary;
    
    public Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }
    
    public void empDisplay() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
}


public class A2Q8 {
    public static void main(String[]args){
        Person p1 = new Person("Aditya",19);
        Employee e1 = new Employee(p1.name,p1.age,1,40000);

        e1.empDisplay();
    }
}
