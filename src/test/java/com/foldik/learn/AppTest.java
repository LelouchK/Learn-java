package com.foldik.learn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void shouldReturnHi() {
        //GIVEN
        App app = new App();

        //WHEN
        String result = app.sayHi();

        //THEN
        assertEquals("Hi", result);
    }
}