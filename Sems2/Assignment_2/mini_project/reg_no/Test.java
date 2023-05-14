package Sems2.Assignment_2.mini_project.reg_no;
import Sems2.Assignment_2.mini_project.reg_no.classes.*;
import java.util.Scanner;

public class Test extends Employee {

    public Test(String name, int empId, double salary, Date hireDate, String jobPosition, String contactNumber,
            Address address) {
        super(name, empId, salary, hireDate, jobPosition, contactNumber, address);
    }

    public static void arrangeEmployeeBySalary(Employee e[]) {
        Employee temp;
        for(int i = 0;i<e.length-1;i++) {
            for(int j = 0; j < e.length-i-1; j++) {
                if(e[j].salary < e[j+1].salary) {
                    // Swap the employees
                    temp = e[j];
                    e[j] = e[j+1];
                    e[j+1] = temp;
                }
            }
        }
    }
    

    public static void getEmployeesByJobPosition(Employee e[], String jp) {
        int count = 0;
        for (int i=0;i<e.length;i++) {
            if (e[i].jobPosition.equals(jp)) {
                System.out.print(e[i].name+" is a "+jp);
                count++;
            }
        }

        if (count == 0) {
            System.out.print("No one is manager.");
        }

    }

    public static void getEmployeesByHireDate(Employee[] e, Date d1, Date d2) {
        for (int i = 0; i < e.length; i++) {
            if (isBetween(e[i].hireDate, d1, d2)) {
                System.out.println((i + 1) + ": " + e[i].name);
            }
        }
    }
    
    
    
    public static boolean isBetween(Date hireDate, Date after, Date before) {
        if (hireDate.year > after.year && hireDate.year < before.year) {
            return true;
        } else if (hireDate.year == after.year && hireDate.month > after.month) {
            return true;
        } else if (hireDate.year == after.year && hireDate.month == after.month && hireDate.day >= after.day) {
            return true;
        } else if (hireDate.year == before.year && hireDate.month < before.month) {
            return true;
        } else if (hireDate.year == before.year && hireDate.month == before.month && hireDate.day <= before.day) {
            return true;
        }
        return false;
    }
    
    
    
    
    public static int foreignEmployeeCount(Employee e[]) {
        int count = 0;
        for (int i = 0; i < e.length; i++) {
            String temp[] = e[i].contactNumber.split(" ");
            if (!temp[0].equals("+91")) {
                count++;
            }
        }
        return count;
    }
    
    public static void getEmployeesBySalary(Employee e[], double s1, double s2) {
        for (int i = 0; i < e.length; i++) {
            if (e[i].salary >= s1 && e[i].salary <= s2) {
                System.out.println(e[i].name + " has a salary between " + s1 + " and " + s2);
            }
        }
    }
    
    public static Date newDate(String a) {
        int day = Integer.parseInt(a.substring(0, 2));
        int month = Integer.parseInt(a.substring(2, 4));
        int year = Integer.parseInt(a.substring(4, 8));
        Date tempDate = new Date(day, month, year);
        return tempDate;
    }

    // Driver code
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        Test emp[] = new Test[2];

        // Input block for Employee array
        for(int i = 0;i<emp.length;i++){
            emp[i] = new Test("", 0, 0, null, "", "", null);
            int temp = i;
            System.out.println("Enter details of employee "+(temp+1)+"\n\n");

            System.out.print("Enter name of the employee: ");
            emp[i].name = input.nextLine();

            System.out.print("Enter the Employee ID: ");
            emp[i].empId = input.nextInt();

            System.out.print("Enter the salary of employee: ");
            emp[i].salary = input.nextDouble();

            input.nextLine(); // flush line b4 inputting date
            while(emp[i].hireDate == null){
                System.out.print("Enter the date of employement in DDMMYYYY: ");
                String tempDate = input.nextLine();
                if(tempDate.length() != 8) {
                    System.out.print("Invalid input, retrying... \n");
                } else {
                    int day = Integer.parseInt(tempDate.substring(0, 2));
                    int month = Integer.parseInt(tempDate.substring(2, 4));
                    int year = Integer.parseInt(tempDate.substring(4, 8));
                    System.out.println("debug: "+day+" "+month+" "+year);
                    emp[i].hireDate = new Date(day, month, year);
                }
            }

            System.out.print("Enter the job position of employee: ");
            emp[i].jobPosition = input.nextLine();

            System.out.print("Enter the contact number of the employee with country code as +xxx xxxxxxxxxx : ");
            emp[i].contactNumber = input.nextLine();

            System.out.print("Enter the address of employee in format local_area,City,State,Country: ");
            String tempAddress = input.nextLine();
            String tempAddressArr[] = tempAddress.split(",\\s*");
            Address address = new Address(tempAddressArr[0],tempAddressArr[1],tempAddressArr[2],tempAddressArr[3]);
            emp[i].address = address;
        }
        
        int choice = Integer.MAX_VALUE;
        do {
            System.out.println("Menu:");
            System.out.println("1. Arrange employees by salary (descending order)");
            System.out.println("2. Display employees by job position");
            System.out.println("3. Display employees by hire date range");
            System.out.println("4. Find the number of foreign employees");
            System.out.println("5. Display employees by salary range");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    arrangeEmployeeBySalary(emp);
                    break;
                case 2:
                    input.nextLine(); // Consume newline character
                    System.out.print("Enter job position: ");
                    String jobPosition = input.nextLine();
                    getEmployeesByJobPosition(emp, jobPosition);
                    break;

                case 3:
                input.nextLine(); // Consume newline character
                System.out.println("Enter hire date range (d1 and d2 in DDMMYYYY format): ");
                System.out.print("d1: ");
                String date1 = input.nextLine();
                System.out.print("d2: ");
                String date2 = input.nextLine();
                System.out.println("\n");
                Date d1 = newDate(date1);
                Date d2 = newDate(date2);
                getEmployeesByHireDate(emp, d1, d2);
                break;
          
                case 4:
                    int foreignCount = foreignEmployeeCount(emp);
                    System.out.println("Number of foreign employees: " + foreignCount);
                    break;
                case 5:
                    System.out.println("Enter salary range:");
                    System.out.print("s1: ");
                    double s1 = input.nextDouble();
                    System.out.print("s2: ");
                    double s2 = input.nextDouble();
                    getEmployeesBySalary(emp, s1, s2);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 0);
    }   
}
