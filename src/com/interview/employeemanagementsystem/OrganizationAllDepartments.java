package com.interview.employeemanagementsystem;

import com.interview.employeemanagementsystem.base.Employee;
import com.interview.employeemanagementsystem.base.EmployeeList;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrganizationAllDepartments {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeList.getEmployeeList();
       // employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        Set<String> distinctDepartments = employeeList.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println("DistinctDepartments : " + distinctDepartments);
    }
}
