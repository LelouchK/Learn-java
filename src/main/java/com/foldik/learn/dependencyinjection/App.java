package com.foldik.learn.dependencyinjection;

import com.foldik.learn.dependencyinjection.logger.Logger;
import com.foldik.learn.dependencyinjection.module.AppModule;
import com.google.inject.Guice;

public class App {

    public static void main(String[] args) {
        Logger logger = Guice
                .createInjector(new AppModule())
                .getInstance(Logger.class);

        logger.log("Hello");
        logger.log("Hello");
        logger.log("Hello");
        logger.log("Hello");
        logger.log("Hello");
    }
}
