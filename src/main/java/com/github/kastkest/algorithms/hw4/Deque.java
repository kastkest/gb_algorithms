package com.github.kastkest.algorithms.hw4;

public interface Deque<E> extends Queue<E>{

    boolean insertLeft(E value);

    boolean insertRight(E value);

    E removeLeft();

    E removeRight();

    E peekFront();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();

}
