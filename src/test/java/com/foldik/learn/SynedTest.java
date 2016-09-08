package com.foldik.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class SynedTest {

    @Test
    public void shouldReturnHello(){
        //GIVEN
        Syned syned = new Syned();

        //WHEN
        String result = syned.hello();

        //THEN
        assertEquals("hello", result);

    }
}