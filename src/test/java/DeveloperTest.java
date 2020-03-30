import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Steven", "JW 57 37 82 15 E", 37500);
    }

    @Test
    public void hasName() {
        assertEquals("Steven", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JW 57 37 82 15 E", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(37500, developer.getSalary());
    }

    @Test
    public void canSetName() {
        developer.setName("Luke");
        assertEquals("Luke", developer.getName());
    }

    @Test
    public void canSetNiNumber() {
        developer.setNiNumber("JF 68 36 72 94 Y");
        assertEquals("JF 68 36 72 94 Y", developer.getNiNumber());
    }

    @Test
    public void canSetSalary() {
        developer.setSalary(50230);
        assertEquals(50230, developer.getSalary());
    }

    @Test
    public void canSalaryBeRaised() {
        developer.raiseSalary(1300);
        assertEquals(38800, developer.getSalary());
    }

    @Test
    public void can1PercentSalaryBePayed() {
        assertEquals(375, developer.payBonus(), 0.01);
    }

}
