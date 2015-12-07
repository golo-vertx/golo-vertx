package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.StreamBase;
// io.vertx.core.streams.ReadStream<T> 
public class ReadStream<T> { 

private io.vertx.core.streams.ReadStream delegate; 
public ReadStream(Object delegate) { 
    this.delegate = (io.vertx.core.streams.ReadStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public ReadStream<T> {
        return (io.vertx.core.streams.ReadStream<T>)delegate.exceptionHandler(handler); 
}
// io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler) 
public ReadStream<T> {
        return (io.vertx.core.streams.ReadStream<T>)delegate.handler(handler); 
}
// io.vertx.core.streams.ReadStream<T> pause() 
public ReadStream<T> {
        return (io.vertx.core.streams.ReadStream<T>)delegate.pause(); 
}
// io.vertx.core.streams.ReadStream<T> resume() 
public ReadStream<T> {
        return (io.vertx.core.streams.ReadStream<T>)delegate.resume(); 
}
// io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public ReadStream<T> {
        return (io.vertx.core.streams.ReadStream<T>)delegate.endHandler(endHandler); 
}
}
