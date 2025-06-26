package test;

import main.java.com.semicolon.africa.model.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void testThatAddNumber() {
    int actual = Calculator.sumNumber(3, 2);
    int expected = 5;
    assertEquals(expected, actual);


}
}
