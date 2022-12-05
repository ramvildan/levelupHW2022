package ru.levelup.homework2;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

@Data
@RequiredArgsConstructor
public class Employee {
    private final String fullNAme;
    private final int workAge;

    public static void printEmployee (Collection<Employee> employees) {

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static void listIterator (List<Employee> employees) {

        int counter = 0;
        for (ListIterator<Employee> iterator = employees.listIterator(employees.size() - 1); iterator.hasPrevious(); ){
            iterator.previous();
            if (counter % 2 != 0) {
                iterator.remove();
            }
            counter++;
        }
        System.out.println("Sorted list: " + employees);
    }
}
