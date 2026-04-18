package ro.ulbs.proiectaresoftware.lab6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.ulbs.proiectaresoftware.lab6.advanced.DoubleCalculator;

public class DoubleCalculatorTest {

    private DoubleCalculator calculator;
    private final double DELTA = 0.001;

    @BeforeEach
    public void setup() {
        calculator = new DoubleCalculator();
        calculator.init();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testInit() {

        calculator.add(15.5).init();

        // Assert
        Assertions.assertEquals(0.0, calculator.getState(), DELTA);
    }

    // --- TESTE ADUNARE ---
    @Test
    public void testAddPositives() {

        calculator.add(5.5);


        Assertions.assertEquals(5.5, calculator.getState(), DELTA);
    }

    @Test
    public void testAddNegatives() {

        calculator.add(-3.2);

        Assertions.assertEquals(-3.2, calculator.getState(), DELTA);
    }

    // --- TESTE SCADERE ---
    @Test
    public void testSubtractPositives() {

        calculator.add(10.5);


        calculator.subtract(4.2);


        Assertions.assertEquals(6.3, calculator.getState(), DELTA);
    }

    @Test
    public void testSubtractNegatives() {

        calculator.add(10.0);


        calculator.subtract(-4.5);


        Assertions.assertEquals(14.5, calculator.getState(), DELTA);
    }

    // --- TESTE INMULTIRE ---
    @Test
    public void testMultiplyPositives() {

        calculator.add(2.5);

        calculator.multiply(4.0);

        Assertions.assertEquals(10.0, calculator.getState(), DELTA);
    }

    @Test
    public void testMultiplyNegatives() {

        calculator.add(2.5);


        calculator.multiply(-4.0);


        Assertions.assertEquals(-10.0, calculator.getState(), DELTA);
    }

    @Test
    public void testMultiplyBy0() {

        calculator.add(15.75);


        calculator.multiply(0.0);

        Assertions.assertEquals(0.0, calculator.getState(), DELTA);
    }

    // --- TESTE IMPARTIRE ---
    @Test
    public void testDividePositives() {

        calculator.add(10.0);


        calculator.divide(2.0);


        Assertions.assertEquals(5.0, calculator.getState(), DELTA);
    }

    @Test
    public void testDivideNegatives() {

        calculator.add(10.0);


        calculator.divide(-2.0);


        Assertions.assertEquals(-5.0, calculator.getState(), DELTA);
    }



    @Test
    public void testDivideByZero() {

        calculator.add(5.0);


        calculator.divide(0.0);


        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.getState());
    }

    @Test
    public void testDivideNegativeByZero() {

        calculator.add(-5.0);


        calculator.divide(0.0);


        Assertions.assertEquals(Double.NEGATIVE_INFINITY, calculator.getState());
    }

    @Test
    public void testAddNullThrowsException() {

        Double nullValue = null;

        Assertions.assertThrows(NullPointerException.class, () -> {
            calculator.add(nullValue);
        });
    }
}