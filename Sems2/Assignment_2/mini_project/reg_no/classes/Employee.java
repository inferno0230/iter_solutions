package Sems2.Assignment_2.mini_project.reg_no.classes;


public class Employee {
    public String name;
    public int empId;
    public double salary;
    public Date hireDate;
    public String jobPosition;
    public String contactNumber;
    public Address address;

    public Employee (String name,int empId,double salary,Date hireDate,String jobPosition,String contactNumber,Address address) {
    this.name = name;
    this.empId = empId;
    this.salary = salary;
    this.hireDate = hireDate;
    this.jobPosition = jobPosition;
    this.contactNumber = contactNumber;
    this.address = address;
    }

    public Date getHireDate() {
        return this.hireDate;
    }

}