import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Francis", 23456, 50.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Francis", developer.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals(23456, developer.getNINumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(50.00, developer.getSalary(), 0.1);
    }
}
