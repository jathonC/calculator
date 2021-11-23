package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = 1;
        int secondArgument = 2;
        //when
        int result = calculator.add(firstArgument, secondArgument);

        //then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = -2;
        int secondArgument = -2;

        //when
        int result = calculator.add(firstArgument, secondArgument);

        //then
        Assert.assertEquals(-4, result);
    }

    @Test
    public void testSubtractShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = 1;
        int secondArgument = 2;

        //when
        int result = calculator.subtract(firstArgument, secondArgument);

        //then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSubtractShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = calculator.subtract(firstArgument, secondArgument);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMultiplyShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = 3;
        int secondArgument = 4;

        //when
        int result = calculator.multiply(firstArgument, secondArgument);

        //then
        Assert.assertEquals(12, result);
    }

    @Test
    public void testMultiplyShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = -3;
        int secondArgument = -4;

        //when
        int result = calculator.multiply(firstArgument, secondArgument);

        //then
        Assert.assertEquals(12, result);
    }

    @Test
    public void testDivideShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = -8;
        int secondArgument = -2;

        //when
        int result = calculator.divide(firstArgument, secondArgument);

        //then
        Assert.assertEquals(4, result);
    }

    @Test
    public void testDivideShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = 8;
        int secondArgument = 2;

        //when
        int result = calculator.divide(firstArgument, secondArgument);

        //then
        Assert.assertEquals(4, result);
    }
    @Test
    public void testPowShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = 2;
        int secondArgument = 5;

        //when
        int result = calculator.pow(firstArgument, secondArgument);

        //then
        Assert.assertEquals(32, result);
    }

}
