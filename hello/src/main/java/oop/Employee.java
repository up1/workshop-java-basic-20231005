package oop;

import static oop.EmployeeType.Fulltime;

enum EmployeeType {
    Fulltime, Contract
}

class Demo2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // Default Constructor
        Employee e2 = new Employee();
        if(e1.equals(e2)) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }
        System.out.println(e1);
        System.out.println(e2);
    }
}
public class Employee {
    // Properties
    private Integer id;
    private EmployeeType type; // 1. Full time, 2. Contract

    public Employee() {
        this(null);
    }

    public Employee(Integer id) {
        this(id, Fulltime);
    }

    public Employee(Integer id, EmployeeType type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", type=" + type +
                '}';
    }

    // Behaviors or methods
    void doSth() {

    }
}

class EmployeeFullTime extends  Employee {

}
