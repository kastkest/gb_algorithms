package com.github.kastkest.algorithms.hw4;

public interface Deque<E>{

    void insertLeft(E value);

    void insertRight(E value);

    E removeLeft();

    E removeRight();

    E peekLeft();

    E peekRight();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();

}
