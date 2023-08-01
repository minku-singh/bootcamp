import com.telstra.Calculation;
import org.junit.*;

import static org.junit.Assert.*;
public class CalculationTest {
    Calculation calculation = new Calculation();

    @Before
    public void test1(){
        System.out.println("Before");
        calculation = new Calculation();
    }

    @After
    public void test2(){
        System.out.println("After");
        calculation = null;
    }

    @BeforeClass
    public static void test3(){
        System.out.println("Before all");
    }

    @AfterClass
    public static void test4(){
        System.out.println("After all");
    }

    @Test
    public void testAdd(){
        Calculation c1 = new Calculation();
        assertEquals(58, c1.add(54,4));
        System.out.println("add");
    }

    @Test
    public void testSubtract(){
        Calculation c1 = new Calculation();
        assertEquals(50, c1.subtract(57,7));
        System.out.println("subtract");
    }

    @Test
    public void checkEligibilityTrue(){
        Calculation c1 = new Calculation();
        assertTrue(c1.checkEligibility(22));
        System.out.println("eligibility true");
    }

    @Test
    public void checkEligibilityFalse(){
        Calculation c1 = new Calculation();
        assertFalse(c1.checkEligibility(2));
        System.out.println("eligibility false");
    }

}
