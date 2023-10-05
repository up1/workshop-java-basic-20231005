package oop;

import lombok.Data;

import java.util.Objects;

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

        EmployeeV2 e3 = new EmployeeV2(null, Fulltime);
    }
}

record EmployeeV2 (Integer id, EmployeeType type){}

@Data
public class Employee {
    // Properties
    private Integer id;
    private EmployeeType type; // 1. Full time, 2. Contract
    // Behaviors or methods
    void doSth() {
    }
}

class EmployeeFullTime extends  Employee {

}
