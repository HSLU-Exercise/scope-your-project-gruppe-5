import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for SimpleCalculator
public class SimpleCalculatorTest {

    // Tests the add method
    @Test
    void testAdd() {
        assertEquals(5.0, SimpleCalculator.add(2.0, 3.0), "2 + 3 should equal 5");
    }

    // Tests the subtract method
    @Test
    void testSubtract() {
        assertEquals(2.0, SimpleCalculator.subtract(5.0, 3.0), "5 - 3 should equal 2");
    }

    // Tests the multiply method
    @Test
    void testMultiply() {
        assertEquals(6.0, SimpleCalculator.multiply(2.0, 3.0), "2 * 3 should equal 6");
    }

    // Tests the divide method, including division by zero
    @Test
    void testDivide() {
        assertEquals("2.0", SimpleCalculator.divide(6.0, 3.0), "6 / 3 should equal 2");
        assertEquals("Error: Cannot divide by zero!", SimpleCalculator.divide(5.0, 0.0), "Division by zero should return error");
    }
}