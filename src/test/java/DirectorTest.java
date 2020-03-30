import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Noel", "NY 64 73 82 93 D", 94500,"Executive Management", 1250000);
    }

    @Test
    public void hasName() {
        assertEquals("Noel", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NY 64 73 82 93 D", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(94500, director.getSalary());
    }

    @Test
    public void hasGetDeptName() {
        assertEquals("Executive Management", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1250000, director.getBudget(), 0.01);
    }

    @Test
    public void canSetName() {
        director.setName("Malcolm");
        assertEquals("Malcolm", director.getName());
    }

    @Test
    public void canSetNiNumber() {
        director.setNiNumber("JF 68 36 72 94 G");
        assertEquals("JF 68 36 72 94 G", director.getNiNumber());
    }

    @Test
    public void canSetSalary() {
        director.setSalary(160230);
        assertEquals(160230, director.getSalary());
    }

    @Test
    public void canSetDeptName() {
        director.setDeptName("Senior Management");
        assertEquals("Senior Management", director.getDeptName());
    }

    @Test
    public void canSalaryBeRaised() {
        director.raiseSalary(30500);
        assertEquals(125000, director.getSalary());
    }

    @Test
    public void can1PercentSalaryBePayed() {
        assertEquals(945, director.payBonus(), 0.01);
    }
}
