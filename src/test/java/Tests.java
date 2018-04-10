package calc.junit;
import org.junit.*;

import static org.junit.Assert.*;

public class Tests {

    private calc.junit.Calc calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("");
        System.out.println("Before Calc.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("");
        System.out.println("After Calc.class");
    }

    @Before
    public void initTest() {
        System.out.println("");
        System.out.println("initTest()");
        calculator = new calc.junit.Calc();
    }

    @After
    public void afterTest() {
        System.out.println("afterTest()");
        calculator = null;
    }

    @Test
    public void testPlus() throws Exception {
        System.out.println("testPlus()");
        assertEquals(15, calculator.plus(7,8));
    }

    @Test
    public void testDelit() throws Exception {
        System.out.println("testDelit()");
        assertEquals(20, calculator.delit(100,5));
    }
    @Test
    public void testYmnodit() throws Exception {
        System.out.println("testYmnodit()");
        assertEquals(50, calculator.ymnodit(10,5));
    }

    @Test
    public void testMinus() throws Exception {
        System.out.println("testMinus()");
        assertEquals(5, calculator.minus(10,5));
    }

    @Test (expected = Exception.class)
    public void divisionWithException() {
        System.out.println("divisionWithException()");
        calculator.delit(15,0);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(timeout = 100)
    public void timeStampTest() {
        System.out.println("timeStampTest()");
        while (true);
    }
}
