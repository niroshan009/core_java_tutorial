package com.niroshan.stream.employee;

import com.niroshan.stream.Stream1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee[] empArr = {new Employee("e1", 12),
                new Employee("e2", 44),
                new Employee("e3", 34),
                new Employee("e4", 25),
                new Employee("e5", 32),
                new Employee("e6", 26),
                new Employee("e7", 77),
        };

        Stream<Employee> empStream = Stream.of(empArr);

        List<Employee> emps = empStream
                .filter(employee -> employee.getAge() > 26)
                .collect(Collectors.toList());

//        emps.stream().forEach(System.out::print);
//        emps.stream().forEach(employee -> System.out.println(employee));

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("ep1", 33));
        empList.add(new Employee("ep2", 23));
        empList.add(new Employee("ep3", 35));
        empList.add(new Employee("ep4", 22));
        empList.add(new Employee("ep1", 33));

        // printing using stream
        empList.stream().forEach(System.out::println);
        System.out.println("=========");
        empList.stream().forEach(employee -> System.out.println(employee));
        System.out.println("=========");

        // Filter
        List<Employee> empFiltered = empList.stream().filter(employee -> employee.getAge() > 31)
                .collect(Collectors.toList());
        empFiltered.stream().forEach(employee -> System.out.println(employee));
        System.out.println("=========");



        // max
        Optional<Employee> employee = empList.stream()
                .max(Comparator.comparing(employee1 -> employee1.getAge()));
        System.out.println(employee);
        System.out.println("=========");

        // min
        Optional<Employee> minEmployee = empList.stream()
                .min(Comparator.comparing(Employee::getAge));
        System.out.println(minEmployee);
        System.out.println("=========");

        // sorted
        List<Employee> sortedEmployees = empList.stream()
                .sorted()
                .collect(Collectors.toList());
        sortedEmployees.stream().forEach(System.out::println);
        System.out.println("=========");


        OptionalDouble average = empList.stream()
                .mapToInt(Employee::getAge)
                .average();

        System.out.println(average.getAsDouble());
        System.out.println("=========");


        int sum = empList.stream()
                .mapToInt(Employee::getAge)
                .sum();
        System.out.println(sum);
        System.out.println("=========");

        long count = empList.stream()
                .mapToInt(Employee::getAge)
                .count();
        System.out.println(count);
        System.out.println("=========");
    }
}
