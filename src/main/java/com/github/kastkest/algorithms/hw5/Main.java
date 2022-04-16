package com.github.kastkest.algorithms.hw5;

public class Main {

    public static void main(String[] args) {
        System.out.println(calc(2, 4));
    }

    private static int calc(int number, int degree) {
        if (degree == 0) {
            return 1;
        } else {
            return number * calc(number, degree - 1);
        }
    }
}
