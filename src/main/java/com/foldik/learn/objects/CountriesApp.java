package com.foldik.learn.objects;

import com.spotify.apollo.Environment;
import com.spotify.apollo.httpservice.HttpService;
import com.spotify.apollo.httpservice.LoadingException;
import com.spotify.apollo.route.Route;

public class CountriesApp {

    public static void main(String[] args) throws LoadingException {
        HttpService.boot(CountriesApp::init, "countries", args);
    }

    static void init(Environment environment) {
        environment.routingEngine().registerAutoRoute(Route.sync("GET", "/countries", (c) ->  new Country("Hungary", 117.729, 9.855571, 93.030, "Forint").toString() ));
    }


}
