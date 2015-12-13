package io.vertx.lang.golo;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Handler;
import io.vertx.core.Verticle;

public class GoloVerticle extends AbstractVerticle {

    private Handler startFunction;
    private Handler stopFunction;

    public void setStartFunction(Handler startFunction) {
        this.startFunction = startFunction;
    }

    public void setStopFunction(Handler stopFunction) {
        this.stopFunction = stopFunction;
    }

    @Override
    public void start() {
        this.startFunction.handle((Verticle)this);
    }

    @Override
    public void stop() {
        this.startFunction.handle((Verticle)this);
    }

}
