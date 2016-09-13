package com.foldik.learn.intarray;

import java.util.function.Consumer;

public class Array<E> {

    private static final int DEFAULT_SIZE = 16;

    private E[] elements;
    private int index;

    public Array() {
        elements = (E[]) new Object[DEFAULT_SIZE];
        index = 0;
    }

    public Array add(E number) {
        if (index == elements.length) {
            E[] copy = (E[]) new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++) {
                copy[i] = elements[i];
            }
            elements = copy;
        }
        elements[index] = number;
        index++;
        return this;
    }

    public void forEach(Consumer<E> consumer) {
        for (int i = 0; i < index; i++) {
            consumer.accept(elements[i]);
        }
    }
}
