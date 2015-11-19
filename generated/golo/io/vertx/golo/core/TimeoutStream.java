package io.vertx.golo.Core;

import io.vertx.core.streams.ReadStream;
public class TimeoutStream { 

private io.vertx.core.TimeoutStream originalInstance;// io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) 
public io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.TimeoutStream pause() 
public io.vertx.core.TimeoutStream pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.TimeoutStream resume() 
public io.vertx.core.TimeoutStream resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
// void cancel() 
public void cancel() {
        return originalInstance.cancel(); 
}
}
