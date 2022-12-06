package ru.levelup.homework2;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.*;
import java.util.function.Function;
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

//    public static void listIterator (List<Employee> employees) {
//
//        for (ListIterator<Employee> iterator = employees.listIterator(employees.size()); iterator.hasPrevious(); ){
//            iterator.next();
//            int previous = iterator.previousIndex();
//
//            if (previous % 2 != 0) {
//                iterator.remove();
//            }
//        }
//        System.out.println("Sorted list: " + employees);
//
////        new LinkedList<>(employees)
////                .descendingIterator()
////                .forEachRemaining(System.out::println);
//    }
}
