package com.github.kastkest.algorithms.hw4;

import java.util.Arrays;
import java.util.LinkedList;

public class DequeImpl<E> implements Deque<E> {

    LinkedList<E> items = new LinkedList<>();

    @Override
    public void insertLeft(E value) {
        items.addFirst(value);
    }

    @Override
    public void insertRight(E value) {
        items.addLast(value);
    }

    @Override
    public E removeLeft() {
        if (items.size() == 0) {
            System.out.println("Size is 0");
        }

        E temp = items.getFirst();

        items.removeFirst();

        return temp;
    }

    @Override
    public E removeRight() {
        if (items.size() == 0) {
            System.out.println("Size is 0");
        }

        E temp = items.getLast();

        items.removeLast();

        return temp;
    }

    @Override
    public E peekLeft() {
        if (items.size() == 0) {
            System.out.println("Size is 0");
        }
        E temp = items.getFirst();
        return temp;
    }

    @Override
    public E peekRight() {
        if (items.size() == 0) {
            System.out.println("Size is 0");
        }
        E temp = items.getLast();
        return temp;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return (items.size() == 0);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        System.out.println(Arrays.asList(items));
    }
}
