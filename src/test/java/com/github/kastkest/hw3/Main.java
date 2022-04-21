package com.github.kastkest.hw3;

public class
Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 11, 10, 12, 13, 14, 15, 16};

        findMissed(array);

    }

    public static void findMissed(int[] array) {
        int missed = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != (i + 1)) {
                missed = i + 1;
                break;
            }
        }
        System.out.println(missed);
    }
}
