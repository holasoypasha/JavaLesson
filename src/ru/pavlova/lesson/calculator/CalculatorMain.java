package ru.pavlova.lesson.calculator;

public class CalculatorMain {
    public static void main(String[] args) {

        System.out.println("5 + 9 = " + Calculator.sum(5, 9));
        System.out.println("5 - 9 = " + Calculator.subtraction(5, 9));
        System.out.println("5 * 9 = " + Calculator.multiplication(5, 9));
        System.out.println("5 / 0 = " + Calculator.division(5, 0));
        System.out.println("5 ^ 9 = " + Calculator.power(5, 9));
        System.out.println("5! = " + Calculator.factorial(5));

        Calculator.printOperationCounter();
    }
}
