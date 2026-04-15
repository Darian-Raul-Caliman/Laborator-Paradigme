package ro.ulbs.proiectaresoftware.lab6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.ulbs.proiectaresoftware.lab6.advanced.DoubleCalculator;

public class DoubleCalculatorTest {

    private DoubleCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new DoubleCalculator();
        calculator.init();
    }

    @Test
    public void initTest() {
        calculator.add(15.0);
        calculator.init();
        Assertions.assertEquals(0.0, calculator.getState(), 0.001);
    }

    @Test
    public void addTest() {
        calculator.add(5.5);
        Assertions.assertEquals(5.5, calculator.getState(), 0.001);
    }

    @Test
    public void subtractTest() {
        calculator.add(10.0).subtract(4.0);
        Assertions.assertEquals(6.0, calculator.getState(), 0.001);
    }

    @Test
    public void multiplyTest() {
        calculator.add(2.5).multiply(4.0);
        Assertions.assertEquals(10.0, calculator.getState(), 0.001);
    }

    @Test
    public void divideTest() {
        calculator.add(10.0).divide(2.0);
        Assertions.assertEquals(5.0, calculator.getState(), 0.001);
    }

    @Test
    public void divideByZeroTest() {
        calculator.add(5.0).divide(0.0);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.getState());
    }
}