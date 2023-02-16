package com.bosonit.calculator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ResultOutputDto {

    String message;
    BigDecimal result;
    
}
