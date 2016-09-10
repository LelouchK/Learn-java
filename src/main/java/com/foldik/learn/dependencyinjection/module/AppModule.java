package com.foldik.learn.dependencyinjection.module;

import com.foldik.learn.dependencyinjection.logger.BasicMessageFormatter;
import com.foldik.learn.dependencyinjection.logger.ConsoleLogger;
import com.foldik.learn.dependencyinjection.logger.Logger;
import com.foldik.learn.dependencyinjection.logger.MessageFormatter;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Logger.class).to(ConsoleLogger.class);
        bind(MessageFormatter.class).to(BasicMessageFormatter.class);
    }
}
