package com.example.dev.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InheritanceDemo {

    public static void main(String[] args) {

        Student student = new Student("Brogrammer", "BCA");
        /*Student student = new Student();
        student.setName("Brogrammer");
        student.setCourse("BCA");*/
        student.setPhoneNumber("123456789");

        LOGGER.info(student.toString());

        Employee employee = new Employee("Doraemon", "Parental Robot");
        /*Employee employee = new Employee();
        employee.setName("Doraemon");
        employee.setTitle("Parental Robot");*/
        LOGGER.info(employee.toString());
    }
}
