package com.foldik.learn;

import java.math.BigInteger;

public class Light {

    private static final BigInteger LIGHT_SPEED = BigInteger.valueOf(299792458);

    private static final BigInteger NUMBER_OF_SECONDS_IN_A_DAY = BigInteger.valueOf(24 * 60 * 60);

    public BigInteger getReachedDistance(BigInteger numberOfDays) {
        return LIGHT_SPEED.multiply(NUMBER_OF_SECONDS_IN_A_DAY).multiply(numberOfDays);
    }


}
