package ru.levelup.homework2;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@Data
@RequiredArgsConstructor
public class Employee {
    private final String fullName;
    private final int workAge;

    public static void printEmployee (Collection<Employee> employees, int necessaryWorkAge) {

        System.out.println("Suitable employees: ");

//        for (Employee employee : employees) {
//            if (employee.workAge >= necessaryWorkAge) {
//                System.out.println(employee);
//            }
//        }
//        без StreamAPI

//        employees.removeIf(employee -> employee.workAge < necessaryWorkAge);
//        System.out.println(employees);
//        без StreamAPI при помощи Iterator

        employees.stream()
                .filter(employee -> employee.getWorkAge() >= necessaryWorkAge)
                .forEach(System.out::println);
    }

    public static void reverseListIterator(List<Employee> employees) {

//        int counter = 0;
//        for (ListIterator<Employee> iterator = employees.listIterator(employees.size()); iterator.hasPrevious(); ){
//            iterator.previous();
//
//            if (counter % 2 == 0) {
//                iterator.remove();
//            }
//            counter++;
//        }
//        System.out.println("Sorted list by Iterator: " + employees);
//        System.out.println("-----");
        System.out.println("Sorted list by Stream API: ");
        employees.stream()
                .sorted(Comparator.comparingInt(employees::indexOf).reversed())
                .filter(employee -> employees.indexOf(employee) % 2 == 0)
                .forEach(System.out::println);

//        new LinkedList<>(employees)
//                .descendingIterator()
//                .forEachRemaining(System.out::println);
    }
}
