package com.example.calculator.controller;

import com.example.calculator.model.Operation;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/add")
    public double add(@RequestBody Operation operation) {
        operation.setOperator("add");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/subtract")
    public double subtract(@RequestBody Operation operation) {
        operation.setOperator("subtract");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/multiply")
    public double multiply(@RequestBody Operation operation) {
        operation.setOperator("multiply");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/divide")
    public double divide(@RequestBody Operation operation) {
        operation.setOperator("divide");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/factorial")
    public double factorial(@RequestBody Operation operation) {
        operation.setOperator("factorial");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/permutation")
    public double permutation(@RequestBody Operation operation) {
        operation.setOperator("permutation");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/combination")
    public double combination(@RequestBody Operation operation) {
        operation.setOperator("combination");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/solveQuadratic")
    public double solveQuadratic(@RequestBody Operation operation) {
        operation.setOperator("solveQuadratic");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/areaCircle")
    public double areaCircle(@RequestBody Operation operation) {
        operation.setOperator("areaCircle");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/differentiate")
    public double differentiate(@RequestBody Operation operation) {
        operation.setOperator("differentiate");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/integrate")
    public double integrate(@RequestBody Operation operation) {
        operation.setOperator("integrate");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/solveDifferential")
    public double solveDifferential(@RequestBody Operation operation) {
        operation.setOperator("solveDifferential");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/sin")
    public double sin(@RequestBody Operation operation) {
        operation.setOperator("sin");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/cos")
    public double cos(@RequestBody Operation operation) {
        operation.setOperator("cos");
        return calculatorService.calculate(operation);
    }

    @PostMapping("/tan")
    public double tan(@RequestBody Operation operation) {
        operation.setOperator("tan");
        return calculatorService.calculate(operation);
    }
}
