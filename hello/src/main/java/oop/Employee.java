package oop;

import static oop.EmployeeType.Fulltime;

enum EmployeeType {
    Fulltime, Contract
}

class Demo2 {
    public static void main(String[] args) {
        Employee employee = new Employee(); // Default Constructor
        employee.doSth();
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

    // Behaviors or methods
    void doSth() {

    }
}

class EmployeeFullTime extends  Employee {

}
