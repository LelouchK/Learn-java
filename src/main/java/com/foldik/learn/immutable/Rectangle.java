package com.foldik.learn.immutable;

public final class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(final double width, final double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle setWidth(final double width) {
        return new Rectangle(width, this.height);
    }

    public Rectangle setHeight(final double height) {
        return new Rectangle(this.width, height);
    }

    public double getHeight() {
        return height;
    }

    public Rectangle scale(final double scale) {
        return new Rectangle(scale * width, scale * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
