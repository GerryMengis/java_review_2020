package OOP.Encapsulation;


import java.util.Date;
import java.util.GregorianCalendar;


class Employee {
    //instance fields
    private String name;
    private double salary;
    private Date hireDay;
    private int id;
    private static int nextId = 101;

    public Employee(String n, double s, int year, int month, int day) {
        // constractor accesing private variable
        this.name = n;
        this.salary = s;
        GregorianCalendar clander = new GregorianCalendar(year, month - 1, day);
        this.hireDay = clander.getTime();
        this.id = 0;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDay;

    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

}
    
public class EmployeeTest {

    public static void main(String[] args) {
        // main calss

        // Single use
        Employee emp = new Employee("Gerry", 25, 2020, 01, 01);
        System.out.println("Employee name: " + emp.getName() + 
                             ", Salery : " + emp.getSalary() +
                             ", Hired date : " + emp.getHireDate());

        // Using Array
        Employee staff[] = new Employee[4];
        staff[0] = new Employee("Noah", 27, 2010, 05, 05);
        staff[1] = new Employee("Joe", 30, 2005, 04, 04);
        staff[2] = new Employee("Sam", 35, 2000, 03, 03);

        /* Add salary raise */  

        for(Employee e : staff){
            e.setId();
            System.out.println("Employee name: " + e.getName() + 
        ", Salery : " + e.getSalary() +
        ", Hired date : " + e.getHireDate() + "Id: " + e.getId());

        // Accessing static Eployee instance 
        System.out.println("Next id will be: " + Employee.getNextId());
        }
        
    }
    
}
