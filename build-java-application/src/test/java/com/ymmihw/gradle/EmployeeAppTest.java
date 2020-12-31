package com.ymmihw.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeAppTest {

    @Test
    public void testData() {

        Employee testEmp = this.getEmployeeTest();
        assertEquals(testEmp.name, "John");
        assertEquals(testEmp.emailAddress, "john@baeldung.com");
        assertEquals(testEmp.yearOfBirth, 1978);
    }

    private Employee getEmployeeTest() {

        Employee employee = new Employee();
        employee.name = "John";
        employee.emailAddress = "john@baeldung.com";
        employee.yearOfBirth = 1978;

        return employee;
    }

}