package com.foldik.learn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightTest {

    private Light light;

    @Before
    public void setUp() {
        light = new Light();
    }
    @Test
    public void shouldReturnThree_When_SumOneAndTwo() {
        //GIVEN
        int lightspeed = 300;
        int days = 2;
        int seconds = 24 * 60 * 60;

        //WHEN
        int result = light.d(lightspeed, days, seconds);

        //THEN
        assertEquals(51840000,result);

    }
}