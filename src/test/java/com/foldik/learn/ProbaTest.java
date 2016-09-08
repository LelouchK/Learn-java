package com.foldik.learn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProbaTest {

    private Proba proba;

    @Before
    public void setUp() {
        proba = new Proba();
    }

    @Test
    public void shouldReturnProba() {
        //GIVEN

        //WHEN
        String result = proba.proba();

        //THEN
        assertEquals("Proba", result);
    }

    @Test
    public void shouldReturnProba2() {
        //GIVEN

        //WHEN
        String result = proba.proba2();

        //THEN
        assertEquals("Proba2", result);
    }

}