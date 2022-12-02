package ru.levelup.homework2;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Collection;

@Data
@RequiredArgsConstructor
public class Employee {
    private final String fullNAme;
    private final int workAge;

    public static void printEmployee (Collection<Employee> employees, int workAge) {

        System.out.println("Employee: " + employees + "Work experience: " + workAge);

    }
}
