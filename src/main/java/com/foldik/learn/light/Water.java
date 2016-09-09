package com.foldik.learn.light;

import java.math.BigDecimal;

public class Water implements Material {

    @Override
    public BigDecimal deccelerationFactor() {
        return BigDecimal.valueOf(0.97);
    }
}
