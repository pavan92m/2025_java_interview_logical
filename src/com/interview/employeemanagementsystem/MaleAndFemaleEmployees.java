package com.interview.employeemanagementsystem;

import com.interview.employeemanagementsystem.base.Employee;
import com.interview.employeemanagementsystem.base.EmployeeList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//How many male and female employees are there in the organization?
public class MaleAndFemaleEmployees {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeList.getEmployeeList();
        Map<String, Long> totalCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(totalCount);
    }
}
