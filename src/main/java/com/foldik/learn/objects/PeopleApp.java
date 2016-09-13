package com.foldik.learn.objects;

import com.spotify.apollo.Environment;
import com.spotify.apollo.httpservice.HttpService;
import com.spotify.apollo.httpservice.LoadingException;
import com.spotify.apollo.route.Route;

public class PeopleApp {

    public static void main(String[] args) throws LoadingException {
            HttpService.boot(PeopleApp::init, "people", args);
    }

    static void init(Environment environment) {
        environment.routingEngine().registerAutoRoute(Route.sync("GET", "/people", (c) ->  new Person("Kristóf", 24, "Fiú").toString() ));
    }
}
