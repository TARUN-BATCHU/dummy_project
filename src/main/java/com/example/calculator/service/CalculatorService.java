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

    private int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    private int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    private int combination(int n, int r) {
        return permutation(n, r) / factorial(r);
    }

    // Add more methods for other advanced operations
}
