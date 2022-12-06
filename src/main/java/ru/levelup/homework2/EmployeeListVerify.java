package ru.levelup.homework2;

import java.util.*;

public class EmployeeListVerify {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>((List.of(
                new Employee("Ramen Supov", 1),
                new Employee("Ivan Khan", 3),
                new Employee("Gnom Gnomov", 6),
                new Employee("Raz Razputin", 9),
                new Employee("Gloria Jeans", 2))));

        Employee.printEmployee(employees,3);
    }
}
