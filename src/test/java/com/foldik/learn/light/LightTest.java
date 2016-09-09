package com.foldik.learn.light;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LightTest {

    @Mock
    private Material material;

    private Light light;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        light = new Light();
    }

    @Test
    public void shouldReturnCorrectValue() {
        //GIVEN
        BigDecimal days = BigDecimal.valueOf(2);

        //WHEN
        BigDecimal result = light.getReachedDistanceInVacuum(days);

        //THEN
        assertEquals(new BigDecimal("51804136742400"), result);

    }

    @Test
    public void shouldUseMaterialDeccelerationFactor() {
        //GIVEN
        BigDecimal days = BigDecimal.valueOf(2);
        when(material.deccelerationFactor()).thenReturn(BigDecimal.valueOf(0.5));

        //WHEN
        BigDecimal result = light.getReachedDistance(material, days);

        //THEN
        assertEquals(new BigDecimal("25902068371200.0"), result);
    }
}