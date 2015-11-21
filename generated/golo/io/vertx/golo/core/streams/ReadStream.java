package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.StreamBase;
public class ReadStream { 

private io.vertx.core.streams.ReadStream<T> delegate; 
public ReadStream(Object delegate) { 
    this.delegate = (io.vertx.core.streams.ReadStream<T>)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler) 
public io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.streams.ReadStream<T> pause() 
public io.vertx.core.streams.ReadStream<T> pause() {
        return delegate.pause(); 
}
// io.vertx.core.streams.ReadStream<T> resume() 
public io.vertx.core.streams.ReadStream<T> resume() {
        return delegate.resume(); 
}
// io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
}
