import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jeff", 12345, 100.00);
    }

    @Test
    public void managerHasName() {
        assertEquals("Jeff", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals(12345, manager.getNINumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(100.00, manager.getSalary(), 0.1);
    }
}
