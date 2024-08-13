package com.interview.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckGender {
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();
        Map<Boolean, List<Employee>> partitioned = employees.stream().
                collect(Collectors.partitioningBy(emp->Gender.MALE.equals(emp.getGender())));
        List<Employee> maleEmp =  partitioned.get(true);
        List<Employee> femaleEmp =  partitioned.get(false);
        System.out.println(maleEmp);
        System.out.println(femaleEmp);
        System.out.println(maleEmp.size());
        System.out.println(femaleEmp.size());
    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Jacky", 32, Gender.MALE),
                new Employee(2, "Johnshi", 20, Gender.FEMALE),
                new Employee(3, "Chrich", 25, Gender.FEMALE),
                new Employee(4, "Krish", 34, Gender.MALE));
    }
}
