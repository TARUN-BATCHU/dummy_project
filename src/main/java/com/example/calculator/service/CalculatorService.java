package com.example.calculator.service;

import com.example.calculator.model.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double calculate(Operation operation) {
        double result = 0;
        switch (operation.getOperator()) {
            case "add":
                result = operation.getOperand1() + operation.getOperand2();
                break;
            case "subtract":
                result = operation.getOperand1() - operation.getOperand2();
                break;
            case "multiply":
                result = operation.getOperand1() * operation.getOperand2();
                break;
            case "divide":
                if (operation.getOperand2() != 0) {
                    result = operation.getOperand1() / operation.getOperand2();
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
        return result;
    }
}
