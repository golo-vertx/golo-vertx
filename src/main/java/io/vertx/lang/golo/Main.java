package io.vertx.lang.golo;

import io.vertx.core.Future;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        GoloVerticleFactory factory = new GoloVerticleFactory();
        Verticle goloVerticle = factory.createGoloVerticle((verticle) -> {
            System.out.println("Start method called!");
        }, (verticle) -> {
            System.out.println("Stop method called!");
        });

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(goloVerticle);
        vertx.close();
    }
}
