package org.example;

import org.example.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Minku", "dev");

        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Sinku");
        emp2.setDept("Testing");

        System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getDept());
        System.out.println(emp2);
    }
}