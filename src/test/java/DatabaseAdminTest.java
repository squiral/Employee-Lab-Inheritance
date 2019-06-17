import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Francis", 23456, 50.00);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Francis", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNINumber(){
        assertEquals(23456, databaseAdmin.getNINumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(50.00, databaseAdmin.getSalary(), 0.1);
    }
}
