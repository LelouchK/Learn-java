package com.foldik.learn.ProjectEuler;

import java.math.BigDecimal;

public class SumSquareDiff {

    public static void main(String[] args){

        double x = ((100.0 + 1.0) / 2)*100;
        double k = x*x;
        double y = (100*(100+1)*(2*100+1))/6;
        double sum  = k-y;

        System.out.println(sum);
    }
}
