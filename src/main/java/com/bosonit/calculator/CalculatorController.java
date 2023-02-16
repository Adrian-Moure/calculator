package com.bosonit.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public ResponseEntity<BigDecimal> getAddition(
            @RequestParam(name="first", required = true) BigDecimal firstParameter,
            @RequestParam(name="second", required = true) BigDecimal secondParameter){
        return new ResponseEntity<BigDecimal>(
                calculatorService.additionOperation(firstParameter, secondParameter),
                HttpStatus.OK);
    }

    @GetMapping("/substract")
    public ResponseEntity<BigDecimal> getSubstraction(
            @RequestParam(name="first", required = true) BigDecimal firstParameter,
            @RequestParam(name="second", required = true) BigDecimal secondParameter){
        return new ResponseEntity<BigDecimal>(
                calculatorService.substractionOperation(firstParameter, secondParameter),
                HttpStatus.OK);
    }
}
