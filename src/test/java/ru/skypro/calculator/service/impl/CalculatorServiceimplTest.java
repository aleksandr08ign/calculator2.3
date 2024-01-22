package ru.skypro.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.skypro.calculator.exception.DivisionByZeroException;

public class CalculatorServiceimplTest {

    private final CalculatorServiceimpl calculatorServiceimpl = new CalculatorServiceimpl();

    @Test
    public void calculatorPlusCorrect() {
        int num1 = 5, num2 = 10;
        int expectedResult = num1 + num2;

        int actualResult = calculatorServiceimpl.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculatorMinusCorrect() {
        int num1 = 5, num2 = 10;
        int expectedResult = num1 - num2;

        int actualResult = calculatorServiceimpl.minus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculatorMultiplyCorrect() {
        int num1 = 5, num2 = 10;
        int expectedResult = num1 * num2;

        int actualResult = calculatorServiceimpl.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculatorDivideCorrect() {
        int num1 = 5, num2 = 10;
        double expectedResult = (double)num1 / num2;

        double actualResult = calculatorServiceimpl.divide(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void exceptionSecondNumIsNull() {
        int num1 = 10;
        int num2 = 0;

        Assertions.assertThrows(
                DivisionByZeroException.class,
                () -> calculatorServiceimpl.divide(num1, num2)
        );

    }


}
