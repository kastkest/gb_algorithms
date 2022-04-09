package com.github.kastkest.algorithms.hw1;


import java.util.Random;


public class Main {

    private static final int SIZE = 10;
    private static final int PRICE_STEP = 50;
    private static final int MEMORY_STEP = 4;

    public static void main(String[] args) {

        Notebook[] array = createArray();
        System.out.println();
        sort(array);
    }

    public static Notebook[] createArray() {
        int minPrice = 500;
        int maxPrice = 2000;
        int diffPrice = maxPrice - minPrice;

        int minMemory = 4;
        int maxMemory = 24;
        int diffMemory = maxMemory - minMemory;

        String[] labels = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};


        Notebook[] notebooks = new Notebook[SIZE];
        for (int i = 0; i < SIZE; i++) {
            notebooks[i] = new Notebook(new Random().nextInt(diffPrice / PRICE_STEP + 1) * PRICE_STEP + minPrice,
                    new Random().nextInt(diffMemory / MEMORY_STEP + 1) * MEMORY_STEP + minMemory,
                    labels[new Random().nextInt(labels.length)]);
            System.out.println(notebooks[i]);

        }
        return notebooks;
    }

    public static void sort(Notebook[] notebooks) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < notebooks.length; i++) {
                if (notebooks[i].getPrice() != notebooks[i - 1].getPrice()) {
                    if (notebooks[i].getPrice() < notebooks[i - 1].getPrice()) {
                        Notebook tmp = notebooks[i];
                        notebooks[i] = notebooks[i - 1];
                        notebooks[i - 1] = tmp;
                        needIteration = true;
                    }
                } else {
                    if (notebooks[i].getMemory() != notebooks[i - 1].getMemory()) {
                        if (notebooks[i].getMemory() < notebooks[i - 1].getMemory()) {
                            Notebook tmp = notebooks[i];
                            notebooks[i] = notebooks[i - 1];
                            notebooks[i - 1] = tmp;
                            needIteration = true;
                        }
                    }
                }
                System.out.println(notebooks[i]);
            }
        }
    }
}
