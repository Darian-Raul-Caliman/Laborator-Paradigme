package ro.ulbs.proiectaresoftware.lab6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.ulbs.proiectaresoftware.lab6.advanced.NewIntCalculator;

public class NewIntCalculatorTest {

    private NewIntCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new NewIntCalculator();
        calculator.init();
    }


    @AfterEach
    public void tearDown() {
        calculator.clear();
        calculator = null;
    }

    // --- TESTE PENTRU ADUNARE ---

    @Test
    public void testAddPositive() {

        Integer valueToAdd = 15;


        calculator.add(valueToAdd);

        Assertions.assertEquals(15, calculator.result());
    }

    @Test
    public void testAddNegatives() {

        Integer valueToAdd = -5;

        calculator.add(valueToAdd);

        Assertions.assertEquals(-5, calculator.result());
    }

    // --- TESTE PENTRU SCADERE ---

    @Test
    public void testSubtractPositives() {

        Integer valueToSubtract = 10;


        calculator.subtract(valueToSubtract);


        Assertions.assertEquals(-10, calculator.result());
    }

    @Test
    public void testSubtractNegatives() {

        Integer valueToSubtract = -8;

        // Act [cite: 98]
        calculator.subtract(valueToSubtract);

        Assertions.assertEquals(8, calculator.result());
    }

    // --- TESTE PENTRU INMULTIRE ---

    @Test
    public void testMultiplyPositives() {

        calculator.add(5);
        Integer valueToMultiply = 4;


        calculator.multiply(valueToMultiply);

        Assertions.assertEquals(20, calculator.result());
    }

    @Test
    public void testMultiplyNegatives() {

        calculator.add(5);
        Integer valueToMultiply = -3;


        calculator.multiply(valueToMultiply);


        Assertions.assertEquals(-15, calculator.result());
    }

    @Test
    public void testMultiplyBy0() {

        calculator.add(25);
        Integer valueToMultiply = 0;


        calculator.multiply(valueToMultiply);


        Assertions.assertEquals(0, calculator.result());
    }



    @Test
    public void testDividePositives() {

        calculator.add(20);
        Integer valueToDivide = 4;

        // Act [cite: 98]
        calculator.divide(valueToDivide);

        // Assert [cite: 99]
        Assertions.assertEquals(5, calculator.result());
    }

    @Test
    public void testDivideNegatives() {

        calculator.add(20);
        Integer valueToDivide = -5;


        calculator.divide(valueToDivide);

        Assertions.assertEquals(-4, calculator.result());
    }



    @Test
    public void testDivideBy0() {
        // Arrange [cite: 97]
        calculator.add(10);
        Integer zero = 0;

        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(zero);
        });


        Assertions.assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void testAddNullThrowsException() {
        Integer nullValue = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            calculator.add(nullValue);
        });
    }
}
