import Staff.Management.*;
import Staff.Employee;
import Staff.TechStaff.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void managerAsEmployee(){
        employee = new Manager("Jeff", 12345, 100.00, "Kittens");
        assertEquals("Jeff", employee.getName());
    }

    @Test
    public void developerAsEmployee(){
        employee = new Developer("Michelle", 54321, 30.00);
        assertEquals(54321, employee.getNINumber());
    }

    @Test
    public void databaseAdminAsEmployee(){
        employee = new DatabaseAdmin("Iona", 67890, 8000.00);
        assertEquals(8000.00, employee.getSalary(), 0.1);
    }

    @Test
    public void directorAsEmployee(){
        employee = new Director("Philip", 12345, 10.00, 5.00);
        assertEquals("Philip", employee.getName());
    }

    @Test
    public void developerRaiseSalary() {
        employee = new Developer("Tim Cook", 12345, 5000.00);
        employee.raiseSalary(10);
        assertEquals(50000.00, employee.getSalary(), 0.1);
    }

    @Test
    public void databaseAdmin() {
        employee = new DatabaseAdmin("Leslie", 12345, 6000.00);
        assertEquals(60.00, employee.payBonus(), 0.1);
    }

    @Test
    public void wontAcceptNegativePayRaise(){
        employee = new Developer("Timpithy", 12345, 6000.00);
        employee.raiseSalary(-10);
        assertEquals(6000.00, employee.getSalary(), 0.1);
    }

    @Test
    public void cantEnterNullToSetName(){
        employee = new Developer("Timpithy", 12345, 6000.00);
        employee.setName(null);
        assertEquals("Timpithy", employee.getName());
    }

}
