package io.vertx.lang.golo;

import io.vertx.core.Handler;

public class GoloVerticleFactory {

    public GoloVerticle createGoloVerticle(Handler start, Handler stop) {
        GoloVerticle verticle = new GoloVerticle();
        verticle.setStartFunction(start);
        verticle.setStopFunction(stop);
        return verticle;
    }
}
