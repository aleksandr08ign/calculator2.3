package ru.skypro.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.skypro.calculator.exception.DivisionByZeroException;

import java.util.stream.Stream;

public class CalculatorServiceimplParameterizedTest {

    private final CalculatorServiceimpl calculatorServiceimpl = new CalculatorServiceimpl();

    private static Stream<Arguments> provideNumbersForCalculator() {
        return Stream.of(
                Arguments.of(5,10),
                Arguments.of(20,3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void calculatorPlusCorrect(int num1, int num2) {

        int expectedResult = num1 + num2;

        int actualResult = calculatorServiceimpl.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void calculatorMinusCorrect(int num1, int num2) {

        int expectedResult = num1 - num2;

        int actualResult = calculatorServiceimpl.minus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void calculatorMultiplyCorrect(int num1, int num2) {

        int expectedResult = num1 * num2;

        int actualResult = calculatorServiceimpl.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForCalculator")
    public void calculatorDivideCorrect(int num1, int num2) {

        double expectedResult = (double)num1 / num2;

        Double actualResult = calculatorServiceimpl.divide(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);


        }



}
