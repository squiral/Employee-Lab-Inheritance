import Staff.Management.Manager;
import Staff.Employee;
import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
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

}
