package com.foldik.learn.generics;

import java.util.function.Consumer;

public class StringList {

    private static final int DEFAULT_SIZE = 16;

    private String[] elements;

    private String base;

    public StringList() {
    }

    public StringList base(String base) {
        this.base = base;
        return this;
    }

    public StringList to(int maxIndex) {
        elements = new String[maxIndex];
        for (int i = 0; i < maxIndex; i++) {
            elements[i] = base + i;
        }
        return this;
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < elements.length; i++) {
            consumer.accept(elements[i]);
        }
    }
}
