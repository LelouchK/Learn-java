package com.foldik.learn.generics;

import com.foldik.learn.dependencyinjection.logger.Logger;
import com.foldik.learn.dependencyinjection.module.AppModule;
import com.google.inject.Guice;

public class GenericsApp {

    public static void main(String[] args) {
        Logger logger = Guice
                .createInjector(new AppModule())
                .getInstance(Logger.class);


        new StringList()
                .base("Macska #")
                .to(100)
                .forEach(logger::log);

    }
}
