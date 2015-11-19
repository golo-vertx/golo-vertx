package io.vertx.golo.core.Streams;

import io.vertx.core.streams.StreamBase;
public class ReadStream { 

private io.vertx.core.streams.ReadStream<T> originalInstance;// io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler) 
public io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.streams.ReadStream<T> pause() 
public io.vertx.core.streams.ReadStream<T> pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.streams.ReadStream<T> resume() 
public io.vertx.core.streams.ReadStream<T> resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
}
