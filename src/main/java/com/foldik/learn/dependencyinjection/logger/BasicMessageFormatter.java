package com.foldik.learn.dependencyinjection.logger;


import com.google.inject.Singleton;
import org.joda.time.LocalTime;

@Singleton
public class BasicMessageFormatter implements MessageFormatter {

    @Override
    public String format(Object message) {
        return new StringBuilder()
                .append("[")
                .append(LocalTime.now().toString("HH:mm:ss"))
                .append("]: ")
                .append(message.toString())
                .toString();
    }
}
