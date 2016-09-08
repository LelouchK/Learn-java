package com.foldik.learn;

public class Math {

    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int abs(int a) {
        if (a > 0) {
            return a;
        } else {
            return a * ( -1 );
        }
    }
}
