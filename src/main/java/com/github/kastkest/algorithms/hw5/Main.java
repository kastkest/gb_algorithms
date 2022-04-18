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

    private static int richBag(int[] w, int[] v, int numberOfGoods, int maxWeight) {
        if (numberOfGoods <= 0) {
            return 0;
        } else if (w[numberOfGoods - 1] > maxWeight) {
            return richBag(w, v, numberOfGoods - 1, maxWeight);
        } else {
            return Math.max(richBag(w, v, numberOfGoods - 1, maxWeight), v[numberOfGoods - 1] + richBag(w, v, numberOfGoods - 1, maxWeight - w[numberOfGoods - 1]));
        }
    }
}
