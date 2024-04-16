package application.app.tests;

import application.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

class SumCalculatorTest {

    SumCalculator calculator;

    @BeforeEach
    public void calcInitialise() {
        calculator = new SumCalculator();
    }

    @Test
    void testThatSumMethodCalculatesCorrectly() {
        HashMap<Integer, Integer> testingSamples = new HashMap<>();
        testingSamples.put(1,1);
        testingSamples.put(6,3);
        testingSamples.forEach((expected, calcCase) ->
                Assertions.assertEquals(expected, calculator.sum(calcCase)));
    }

    @Test
    void testThatSumMethodHandlesExceptionsCorrectly() {
        int illegalInput = 0;
        Assertions.assertThrows(IllegalArgumentException.class,() ->
                calculator.sum(illegalInput));
    }
}