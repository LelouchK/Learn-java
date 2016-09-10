package com.foldik.learn.dependencyinjection.logger;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ConsoleLogger implements Logger {

    private MessageFormatter messageFormatter;

    @Inject
    public ConsoleLogger(MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    @Override
    public void log(Object message) {
        System.out.println(messageFormatter.format(message));
    }
}
