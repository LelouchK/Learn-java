package com.foldik.learn.immutable;

public class ImmutableApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 200);
        System.out.println(rectangle);

        Rectangle rectangle2 = rectangle.setWidth(3000)
                .setHeight(2000)
                .setHeight(13013)
                .setHeight(13013)
                .setWidth(3214324)
                .setHeight(73123213)
                .setHeight(13013)
                .setWidth(3214324)
                .setHeight(73123213)
                .setWidth(3214324)
                .setHeight(73123213)
                .scale(0.6)
                .setWidth(3214324)
                .setHeight(73123213)
                .scale(0.7)
                .setHeight(13013)
                .setWidth(3214324)
                .setHeight(73123213)
                .setWidth(3214324)
                .setHeight(73123213)
                .scale(0.6);
        System.out.println(rectangle2);
    }
}
