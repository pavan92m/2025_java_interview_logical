package com.interview.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeDetailsMain {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails0 = new  EmployeeDetails(120, "PP", 10000, "IT");
        EmployeeDetails employeeDetails1 = new EmployeeDetails(121, "SS",3000,"IT");
        EmployeeDetails employeeDetails2 = new EmployeeDetails(121, "CC",4000,"Admin");
        EmployeeDetails employeeDetails3 = new EmployeeDetails(121, "TT",6000,"Admin");
        EmployeeDetails employeeDetails4 = new EmployeeDetails(121, "KK",5000,"IT");
        List<EmployeeDetails> employeeDetailsList = Arrays.asList(employeeDetails1, employeeDetails2, employeeDetails3, employeeDetails4);
        Optional<EmployeeDetails> employeeDetail = employeeDetailsList.stream()
                .filter(e->e.getDepartment().equals("IT"))
                .sorted(Comparator.comparing(e->e.getSalary())).toList().stream().skip(1).findFirst();
        if(employeeDetail.isPresent()){
            System.out.println(employeeDetail);
        }
    }
}
