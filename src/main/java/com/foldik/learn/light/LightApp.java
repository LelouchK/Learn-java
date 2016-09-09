package com.foldik.learn.light;

import java.math.BigDecimal;

public class LightApp {

    public static void main(String[] args) {
        System.out.print(new Light().getReachedDistance(new Water(), BigDecimal.valueOf(2)));
    }
}
