import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Steven", "JW 57 37 82 15 E", 37500);
    }

    @Test
    public void hasName() {
        assertEquals("Steven", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JW 57 37 82 15 E", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(37500, databaseAdmin.getSalary());
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Luke");
        assertEquals("Luke", databaseAdmin.getName());
    }

    @Test
    public void canSetNiNumber() {
        databaseAdmin.setNiNumber("JF 68 36 72 94 Y");
        assertEquals("JF 68 36 72 94 Y", databaseAdmin.getNiNumber());
    }

    @Test
    public void canSetSalary() {
        databaseAdmin.setSalary(50230);
        assertEquals(50230, databaseAdmin.getSalary());
    }

    @Test
    public void canSalaryBeRaised() {
        databaseAdmin.raiseSalary(1300);
        assertEquals(38800, databaseAdmin.getSalary());
    }

    @Test
    public void can1PercentSalaryBePayed() {
        assertEquals(375, databaseAdmin.payBonus(), 0.01);
    }

}
