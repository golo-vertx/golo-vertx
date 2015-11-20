package io.vertx.golo.core.Streams;

public class StreamBase { 

private io.vertx.core.streams.StreamBase originalInstance; 
// io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(handler); 
}
}
