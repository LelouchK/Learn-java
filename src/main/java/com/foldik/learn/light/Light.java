package com.foldik.learn.light;

import java.math.BigDecimal;

public class Light {

    private static final BigDecimal LIGHT_SPEED = BigDecimal.valueOf(299792458);

    private static final BigDecimal NUMBER_OF_SECONDS_IN_A_DAY = BigDecimal.valueOf(24 * 60 * 60);

    public BigDecimal getReachedDistanceInVacuum(BigDecimal numberOfDays) {
        return LIGHT_SPEED.multiply(NUMBER_OF_SECONDS_IN_A_DAY).multiply(numberOfDays);
    }

    public BigDecimal getReachedDistance(Material material, BigDecimal numberOfDays) {
        return LIGHT_SPEED
                .multiply(NUMBER_OF_SECONDS_IN_A_DAY)
                .multiply(numberOfDays)
                .multiply(material.deccelerationFactor());
    }
}
