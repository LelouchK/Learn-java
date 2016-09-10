package com.foldik.learn.dependencyinjection.logger;

import org.joda.time.DateTimeUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static org.junit.Assert.assertEquals;

public class BasicMessageFormatterTest {

    private MessageFormatter messageFormatter;

    @Before
    public void setUp() {
        DateTimeUtils.setCurrentMillisFixed(LocalDateTime.of(2016, 9, 10, 11, 55, 22).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        messageFormatter = new BasicMessageFormatter();
    }

    @After
    public void tearDown() {
        DateTimeUtils.setCurrentMillisSystem();
    }

    @Test
    public void shouldReturnMessageWithTimeAndClass() {
        //GIVEN

        //WHEN
        String result = messageFormatter.format("hello");

        //THAN
        assertEquals("[11:55:22]: hello", result);
    }
}