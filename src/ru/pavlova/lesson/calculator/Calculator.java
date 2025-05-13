package ru.pavlova.lesson.calculator;

/**
 * Калькулятор с реализацией нескольких операций
 */
public class Calculator {

    /**
     * Счетчик успешно выполненных операций
     */
    static int operationCounter = 0;

    /**
     * Суммирование
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма двух чисел
     */
    static double sum(double a, double b) {
        operationCounter++;
        return a + b;
    }

    /**
     * Вычитание
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность двух чисел
     */
    static double subtraction(double a, double b) {
        operationCounter++;
        return a - b;
    }

    /**
     * Умножение
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение двух чисел
     */
    static double multiplication(double a, double b) {
        operationCounter++;
        return 0;
    }

    /**
     * Деление
     *
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    static double division(double a, double b) {
        if (b != 0) {
            operationCounter++;
            return a / b;
        }
        else {
            System.out.println("Деление на 0 невозможно");
            return 0;
        }
    }

    /**
     * Возведение в степень
     *
     * @param a основание степени
     * @param n показатель степени
     * @return степень
     */
    static double power(double a, double n) {
        operationCounter++;
        return Math.pow(a, n);
    }

    /**
     * Факториал
     *
     * @param n число, возводимое в факториал
     * @return факториал числа n
     */
    static int factorial(int n) {
        int result = 1;
        if (n > 0) {
            operationCounter++;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        else {
            System.out.println("Нельзя посчитать факториал отрицвтельного числа");
        }

        return result;
    }

    /**
     * Вывод выполненных операций
     */
    static void printOperationCounter(){
        System.out.println("Количество успешно выполненных операций: " + operationCounter);
    }
}
