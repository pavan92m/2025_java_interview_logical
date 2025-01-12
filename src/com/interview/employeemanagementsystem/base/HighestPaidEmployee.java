package com.interview.employeemanagementsystem.base;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestPaidEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeList.getEmployeeList();
        Optional<Employee> collect = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Employee employee = collect.get();
        System.out.println(employee);

    }
}
