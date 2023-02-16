package com.bosonit.calculator;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorService implements ICalculatorService{

    @Override
    public BigDecimal additionOperation(BigDecimal firstParameter, BigDecimal secondParameter){
        return firstParameter.add(secondParameter);
    }

    @Override
    public BigDecimal substractionOperation(BigDecimal firstParameter, BigDecimal secondParameter){
        return firstParameter.subtract(secondParameter);
    }
}
