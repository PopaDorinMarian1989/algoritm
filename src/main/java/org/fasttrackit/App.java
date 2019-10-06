package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(3, 23);
        calculator.decreases(5, 7);
        calculator.multiplication(10, 35);

        calculator.addition(2.5, 6.166);
        calculator.decrease(6.67, 77.88);
        calculator.multiplication(6.75, 1.799);

        calculator.addition(12.32, 7);
        calculator.decrease(3.68, 1);
        calculator.multiplication(6.8, 7);

        calculator.addition(112, 45.76);
        calculator.decrease(67, 34.345);
        calculator.multiplication(10, 14.77);
    }
}