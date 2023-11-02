package ru.skypro.calculator.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.calculator.service.CalculatorService;

@Service
public class CalculatorServiceimpl implements CalculatorService {

    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return String.valueOf(result);
    }


    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return String.valueOf(result);
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return String.valueOf(result);
    }

    @Override
    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return String.valueOf(result);
    }


}
