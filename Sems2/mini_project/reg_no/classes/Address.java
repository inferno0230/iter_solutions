package Sems2.mini_project.reg_no.classes;

public class Address {
    protected String localArea;
    protected String city;
    protected String state;
    protected String country;

    public Address (String localArea,String city,String state,String country) {
        this.localArea = localArea;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
