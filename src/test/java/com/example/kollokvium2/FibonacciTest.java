package com.example.kollokvium2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciTest {
    @Test
    public void FibonacciFirstTestGetNNumber() {
        int expectedAnswer = 0;
        Fibonacci fibonacci = new Fibonacci();
        Integer FibonacciAnswer = fibonacci.getNNumberFib(0);
        Assertions.assertEquals(expectedAnswer, FibonacciAnswer);
    }

    @Test
    public void FibonacciSecondTestGetNNumber() {
        int expectedAnswer = 17711;
        Fibonacci fibonacci = new Fibonacci();
        Integer FibonacciAnswer = fibonacci.getNNumberFib(22);
        Assertions.assertEquals(expectedAnswer, FibonacciAnswer);
    }

    @Test
    public void FibonacciFirstTestGetFirstNNumbers() {
        List<Integer> expectedList = new ArrayList<>();
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> FibonacciList = fibonacci.getFirstNNumbersFib(0);
        Assertions.assertEquals(expectedList, FibonacciList);
    }

    @Test
    public void FibonacciSecondTestGetFirstNNumbers() {
        List<Integer> expectedList = new ArrayList<>(List.of(1, 1, 2, 3, 5, 8));
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> FibonacciList = fibonacci.getFirstNNumbersFib(6);
        Assertions.assertEquals(expectedList, FibonacciList);
    }
}
