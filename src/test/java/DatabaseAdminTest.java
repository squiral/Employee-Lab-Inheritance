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
    public void developerHasName(){
        assertEquals("Francis", databaseAdmin.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals(23456, databaseAdmin.getNINumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(50.00, databaseAdmin.getSalary(), 0.1);
    }
}
