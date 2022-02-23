import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialGeneratorTest {
    @Test
    void TestWhenTheInputIsFloat() {
        Factorial factorialObject = new Factorial(10.5);
        try {
            int generatedFactorial = factorialObject.generateFactorial();
        } catch (IllegalArgumentException error) {
            assertEquals("Input should be of type integer.", error.getMessage() );
        }
    }

    @Test
    void TestWhenTheInputIsString() {
        Factorial factorialObject = new Factorial("Some text");
        try {
            int generatedFactorial = factorialObject.generateFactorial();
        } catch (IllegalArgumentException error) {
            assertEquals("Input should be of type integer.", error.getMessage());
        }
    }

    @Test
    void TestWhenTheInputIs0() {
        Factorial factorialObject = new Factorial(0);
        int generatedFactorial = factorialObject.generateFactorial();
        assertEquals(1,generatedFactorial);
    }

    @Test
    void TestWhenTheInputIsGreaterThan0() {
        Factorial factorialObject = new Factorial(6);
        int generatedFactorial = factorialObject.generateFactorial();
        assertEquals(720,generatedFactorial);
    }

    @Test
    void TestWhenTheInputIsNegative() {
        Factorial factorialObject = new Factorial(-2);
        try {
            int generatedFactorial = factorialObject.generateFactorial();
        } catch (IllegalArgumentException error) {
            assertEquals("Input value should not be negative.", error.getMessage() );
        }
    }
}
