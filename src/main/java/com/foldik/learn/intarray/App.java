package com.foldik.learn.intarray;

import com.foldik.learn.dependencyinjection.logger.Logger;
import com.foldik.learn.dependencyinjection.module.AppModule;
import com.google.inject.Guice;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Logger logger = getLogger();

        List<String> names = new ArrayList<>();
        names.add("Macska");
        names.add("Kutya");

        names.forEach(logger::log);
    }

    public static Logger getLogger() {
        return Guice.createInjector(new AppModule()).getInstance(Logger.class);
    }

}
