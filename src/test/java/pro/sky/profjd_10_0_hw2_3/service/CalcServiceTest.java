package pro.sky.profjd_10_0_hw2_3.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.profjd_10_0_hw2_3.constants.CalcServiceTestConstants.*;

class CalcServiceTest {
    private final CalcServiceImpl out = new CalcServiceImpl();

    @Test
    void shouldReturnDefaultMessage() {
        String result = out.greetings();
        assertEquals(GREETINGS_MESSAGE, result);
    }

    @Test
    void shouldReturnCorrectSumWhenNumsPositive() {
        Integer result = out.calculateSum(POSITIVE_NUM1, POSITIVE_NUM2);
        assertEquals(CORRECT_SUM, result);
    }

    @Test
    void shouldReturnCorrectSumWhenNumsNegative() {
        Integer result = out.calculateSum(NEGATIVE_NUM1, NEGATIVE_NUM2);
        assertEquals(CORRECT_SUM2, result);
    }

    @Test
    void shouldReturnCorrectSubtractWhenNumbsPositive() {
        Integer result = out.calculateSubtract(POSITIVE_NUM1, POSITIVE_NUM2);
        assertEquals(CORRECT_SUBTRACT, result);
    }

    @Test
    void shouldReturnCorrectSubtractWhenNumbsNegative() {
        Integer result = out.calculateSubtract(NEGATIVE_NUM2, NEGATIVE_NUM1);
        assertEquals(CORRECT_SUBTRACT2, result);
    }

    @Test
    void shouldReturnCorrectProductWhenNumbsNegative() {
        Integer result = out.calculateProduct(NEGATIVE_NUM1, NEGATIVE_NUM2);
        assertEquals(CORRECT_PRODUCT, result);
    }

    @Test
    void shouldReturnCorrectProductWhenNumbsPositive() {
        Integer result = out.calculateProduct(POSITIVE_NUM2, POSITIVE_NUM1);
        assertEquals(CORRECT_PRODUCT2, result);
    }

    @Test
    void shouldReturnCorrectDivisionWhenNumbsPositive() {
        Double result = out.calculateDivision(POSITIVE_NUM1, POSITIVE_NUM2);
        assertEquals(DIVISION_RESULT1, result);
    }

    @Test
    void shouldReturnCorrectDivisionWhenNumbsNegative() {
        Double result = out.calculateDivision(NEGATIVE_NUM1, POSITIVE_NUM2);
        assertEquals(DIVISION_RESULT2, result);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNum2Is0InDivision() {
        assertThrows(IllegalArgumentException.class,
                () -> out.calculateDivision(NEGATIVE_NUM1, NULL_NUM));
    }
}