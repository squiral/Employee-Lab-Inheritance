import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Francis", 23456, 50.00, 120.00);
    }

    @Test
    public void directorHasName(){
        assertEquals("Francis", director.getName());
    }

    @Test
    public void directorHasNINumber(){
        assertEquals(23456, director.getNINumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(50.00, director.getSalary(), 0.1);
    }

    @Test
    public void directorHasBudget(){
        assertEquals(120.00, director.getBudget());
    }
}
