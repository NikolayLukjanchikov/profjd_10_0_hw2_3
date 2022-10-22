package pro.sky.profjd_10_0_hw2_3.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.profjd_10_0_hw2_3.constants.CalcServiceTestConstants.*;

class CalcServiceParameterizedTest {

    private final CalcServiceImpl out = new CalcServiceImpl();

    @Test
    void shouldReturnDefaultMessage() {
        String result = out.greetings();
        assertEquals(GREETINGS_MESSAGE, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    public void shouldCalculateCorrectSum(int num1, int num2, int sum) {
        int result = out.calculateSum(num1, num2);
        assertEquals(sum, result);
    }

    public static Stream<Arguments> provideParamsForSumTests() {
        return Stream.of(
                Arguments.of(POSITIVE_NUM1, POSITIVE_NUM2, CORRECT_SUM),
                Arguments.of(NEGATIVE_NUM1, NEGATIVE_NUM2, CORRECT_SUM2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractTests")
    public void shouldCalculateCorrectSubtract(int num1, int num2, int sub) {
        int result = out.calculateSubtract(num1, num2);
        assertEquals(sub, result);
    }

    public static Stream<Arguments> provideParamsForSubtractTests() {
        return Stream.of(
                Arguments.of(POSITIVE_NUM1, POSITIVE_NUM2, CORRECT_SUBTRACT),
                Arguments.of(NEGATIVE_NUM2, NEGATIVE_NUM1, CORRECT_SUBTRACT2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForProductTests")
    public void shouldCalculateCorrectProduct(int num1, int num2, int prod) {
        int result = out.calculateProduct(num1, num2);
        assertEquals(prod, result);
    }

    public static Stream<Arguments> provideParamsForProductTests() {
        return Stream.of(
                Arguments.of(NEGATIVE_NUM1, NEGATIVE_NUM2, CORRECT_PRODUCT),
                Arguments.of(POSITIVE_NUM2, POSITIVE_NUM1, CORRECT_PRODUCT2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTests")
    public void shouldCalculateCorrectDivision(int num1, int num2, double div) {
        double result = out.calculateDivision(num1, num2);
        assertEquals(div, result);
    }

    public static Stream<Arguments> provideParamsForDivisionTests() {
        return Stream.of(
                Arguments.of(NEGATIVE_NUM1, POSITIVE_NUM2, DIVISION_RESULT2),
                Arguments.of(POSITIVE_NUM1, POSITIVE_NUM2, DIVISION_RESULT1));
    }
}