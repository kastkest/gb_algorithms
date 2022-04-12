package com.github.kastkest.algorithms.hw2;

public class Notebook {
    private int price;
    private int memory;
    private String label;

    public Notebook(int price, int memory, String label) {
        this.price = price;
        this.memory = memory;
        this.label = label;
    }

    public int getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", memory=" + memory +
                ", label='" + label + '\'' +
                '}';
    }
}
