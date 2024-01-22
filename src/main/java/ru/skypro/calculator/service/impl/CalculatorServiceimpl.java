package ru.skypro.calculator.service.impl;

import org.springframework.stereotype.Service;

import ru.skypro.calculator.exception.DivisionByZeroException;
import ru.skypro.calculator.service.CalculatorService;

@Service
public class CalculatorServiceimpl implements CalculatorService {

    private Object Integer;

    @Override
    public Integer plus(Integer num1, Integer num2) {
                   return num1 + num2;
        }

        public Integer minus (Integer num1, Integer num2){

            return num1 - num2;
        }

           @Override
        public Integer multiply (Integer num1, Integer num2){

            return num1 * num2;
        }

        @Override
        public Double divide (Integer num1, Integer num2){
            if (num2 == 0) {
                throw new DivisionByZeroException("Делить на ноль нельзя!");
            }
            return (double) num1 / num2;
        }


    }
