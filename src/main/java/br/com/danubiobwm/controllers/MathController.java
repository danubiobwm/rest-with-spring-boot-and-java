package br.com.danubiobwm.controllers;

import br.com.danubiobwm.exception.UnsupportedMathOperationException;
import br.com.danubiobwm.math.SimpleMath;
import br.com.danubiobwm.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    private final SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{num1}/{num2}")
    public Double sum(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        if(!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sum(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
    }

    @RequestMapping("/sub/{num1}/{num2}")
    public Double sub(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        if(!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.subtraction(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
    }

    @RequestMapping("/mult/{num1}/{num2}")
    public Double mult(@PathVariable("num1") String num1, @PathVariable("num2") String num2){
        if(!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.multiplication(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));

    }

    @RequestMapping("/div/{num1}/{num2}")
    public Double div(@PathVariable("num1") String num1, @PathVariable("num2") String num2){
        if(!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.division(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
    }

    @RequestMapping("/mean/{num1}/{num2}")
    public Double mean(@PathVariable("num1") String num1, @PathVariable("num2") String num2){
        if(!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.mean(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));
    }

    @RequestMapping("/square/{num1}/{num2}")
    public Double square(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.squareRoot(NumberConverter.convertToDouble(num1));

    }






}
