package ru.levelup.homework2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListVerify {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Ramen Supov", 1),
                new Employee("Ivan Khan", 3),
                new Employee("Gnom Gnomov", 6),
                new Employee("Raz Razputin", 9),
                new Employee("Gloria Jeans", 15)));

        Employee.printEmployee(employees);
        Employee.listIterator(employees);
    }
}
