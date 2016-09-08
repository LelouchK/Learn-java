package com.foldik.learn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    private Math math;

    @Before
    public void setUp() {
        math = new Math();
    }

    @Test
    public void shouldReturnThree_When_SumOneAndTwo() {
        //GIVEN
        int a = 1;
        int b = 2;

        //WHEN
        int result = math.sum(a, b);

        //THEN
        assertEquals(3, result);
    }

    @Test
    public void shouldReturnFive_when_subtractTwoFromSeven() {
        //GIVEN
        int a = 7;
        int b = 2;

        //WHEN
        int result = math.minus(a, b);

        //THEN
        assertEquals(5, result);
    }

    @Test
    public void shouldReturnAbsoluteValue() {
        //GIVEN
        int a = 5;

        //WHE
        int result = math.abs(a);

        //THEN
        assertEquals(5, result);
    }

    @Test
    public void shouldReturnAbsoluteValue_when_invokedWithNegativeNumber() {
        //GIVEN
        int a = -5;

        //WHE
        int result = math.abs(a);

        //THEN
        assertEquals(5, result);
    }

}