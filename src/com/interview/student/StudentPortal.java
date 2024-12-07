package com.interview.student;

import java.util.Arrays;
import java.util.List;

public class StudentPortal {
    public static void main(String[] args) {
        Student student1 = new Student("P","p","s");
        Student student2 = new Student("Q","p","s");
        Student student3 = new Student("R","p","s");
        Student student4 = new Student("S","p","s");
        List<Student> studentList = Arrays.asList(student1,student2,student3,student4);
        List<String> studentNames = studentList.stream().map(s->s.getFirstName()+s.getMiddleName()+s.getLastName()).toList();
        System.out.println(studentNames);
    }
}
