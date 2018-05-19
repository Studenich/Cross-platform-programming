package sample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test Class.
 */
public class EmployeeTest {

    /**
     * Test method for getSalary().
     */
    @Test
    public void getSalary() {
        Employee employee = new Employee("Name", 200);

        int actual = employee.getSalary();
        int expected = 200;

        assertEquals(actual, expected);
    }

    /**
     * Test method for getName().
     */
    @Test
    public void getName() {
        Employee employee = new Employee("Name", 200);

        String actual = employee.getName();
        String expected = "Name";

        assertEquals(actual, expected);
    }
}