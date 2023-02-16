package com.bosonit.calculator;

import java.math.BigDecimal;

public interface ICalculatorService {
    BigDecimal additionOperation(BigDecimal firstParameter, BigDecimal secondParameter);
    BigDecimal substractionOperation(BigDecimal firstParameter, BigDecimal secondParameter);
}
