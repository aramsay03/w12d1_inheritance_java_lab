import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Alan", "NH 86 84 28 27 W", 42670, "Software Development");
    }

    @Test
    public void hasName() {
        assertEquals("Alan", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NH 86 84 28 27 W", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(42670, manager.getSalary());
    }

    @Test
    public void hasGetDeptName() {
        assertEquals("Software Development", manager.getDeptName());
    }

    @Test
    public void canSetName() {
        manager.setName("Luke");
        assertEquals("Luke", manager.getName());
    }

    @Test
    public void canSetNiNumber() {
        manager.setNiNumber("JF 68 36 72 94 G");
        assertEquals("JF 68 36 72 94 G", manager.getNiNumber());
    }

    @Test
    public void canSetSalary() {
        manager.setSalary(60230);
        assertEquals(60230, manager.getSalary());
    }

    @Test
    public void canSetDeptName() {
        manager.setDeptName("UX Design");
            assertEquals("UX Design", manager.getDeptName());
    }

    @Test
    public void canSalaryBeRaised() {
        manager.raiseSalary(1500);
        assertEquals(44170, manager.getSalary());
    }

    @Test
    public void can1PercentSalaryBePayed() {
        assertEquals(426.7, manager.payBonus(), 0.01);
    }

}
