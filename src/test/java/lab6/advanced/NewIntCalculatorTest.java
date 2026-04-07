package lab6.advanced;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class NewIntCalculatorTest {
    private NewIntCalculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new NewIntCalculator();
    }

    @Test
    public void testAddPositive() {
        calculator.init();

        calculator.add(7).add(9);

        Integer result = calculator.result();
        assertEquals(16, result);
    }

    @Test
    public void testAddNegatives() {
        calculator.init();

        calculator.add(-4).add(-3);

        Integer result = calculator.result();
        assertEquals(-7, result);
    }

    @Test
    public void testSubtractPositives() {
        calculator.init();
        
        calculator.subtract(9).subtract(9);

        Integer result = calculator.result();
        assertEquals(-18, result);
    }

    @Test
    public void testSubtractNegatives() {
        calculator.init();
        
        calculator.subtract(-30).subtract(-7);

        Integer result = calculator.result();
        assertEquals(37, result);
    }

    @Test
    public void testMultiplyPositives() {
        calculator.init().add(1);

        calculator.multiply(7).multiply(9);

        Integer result = calculator.result();
        assertEquals(63, result);
    }

    @Test
    public void testMultiplyNegatives() {
        calculator.init().add(1);

        calculator.multiply(-7).multiply(-2);

        Integer result = calculator.result();
        assertEquals(14, result);
    }

    @Test
    public void testMultiplyBy0() {
        calculator.init().add(1);

        calculator.multiply(-7).multiply(0);

        Integer result = calculator.result();
        assertEquals(0, result);
    }

    @Test
    public void testDividePositives() {
        calculator.init().add(9);

        calculator.divide(3);

        Integer result = calculator.result();
        assertEquals(3, result);
    }

    @Test
    public void testDivideNegatives() {
        calculator.init().add(-30);

        calculator.divide(-5);

        Integer result = calculator.result();
        assertEquals(6, result);
    }

    @Test
    public void testDivideBy0(){
        calculator.init().add(20);
        try {
            calculator.divide(0);
            fail("Nu arunca exceptia");
        }catch(ArithmeticException e){
//            System.out.println("Este exceptie");
            assertEquals("/ by zero", e.getMessage());
        }

    }

    @AfterEach
    public void tearDown(){
        calculator = null;
    }
}
