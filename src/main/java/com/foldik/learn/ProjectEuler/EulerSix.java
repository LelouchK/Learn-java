package com.foldik.learn.ProjectEuler;

import java.math.BigDecimal;

public class EulerSix {

    private static final BigDecimal SQUARE_OF_THE_SUM = BigDecimal.valueOf((((100.0 + 1.0) / 2)*100) * (((100.0 + 1.0) / 2)*100));

    private static final BigDecimal SUM_OF_THE_SQUARES = BigDecimal.valueOf((100*(100+1)*(2*100+1))/6);

    public BigDecimal getTheDifferenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(){
        return SQUARE_OF_THE_SUM
        .subtract(SUM_OF_THE_SQUARES);
    }

}
