package com.bosonit.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.corp.calculator.TracerImpl;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    private TracerImpl tracer = new TracerImpl();

    @GetMapping("/add")
    public ResponseEntity<ResultOutputDto> getAddition(
            @RequestParam(name="first", required = true) BigDecimal firstParameter,
            @RequestParam(name="second", required = true) BigDecimal secondParameter){

        BigDecimal result = calculatorService.additionOperation(firstParameter, secondParameter);
        tracer.trace(result);

        return new ResponseEntity<ResultOutputDto>(
                new ResultOutputDto("The result for the addition operation is: ", result),
                HttpStatus.OK);
    }

    @GetMapping("/substract")
    public ResponseEntity<ResultOutputDto> getSubstraction(
            @RequestParam(name="first", required = true) BigDecimal firstParameter,
            @RequestParam(name="second", required = true) BigDecimal secondParameter){


        BigDecimal result = calculatorService.substractionOperation(firstParameter, secondParameter);
        tracer.trace(result);

        return new ResponseEntity<ResultOutputDto>(
                new ResultOutputDto("The result for the substract operation is: ", result),
                HttpStatus.OK);
    }
}
