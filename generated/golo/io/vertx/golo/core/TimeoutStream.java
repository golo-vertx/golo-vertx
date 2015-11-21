package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.ReadStream;
public class TimeoutStream { 

private io.vertx.core.TimeoutStream delegate; 
public TimeoutStream(Object delegate) { 
    this.delegate = (io.vertx.core.TimeoutStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) 
public io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.TimeoutStream pause() 
public io.vertx.core.TimeoutStream pause() {
        return delegate.pause(); 
}
// io.vertx.core.TimeoutStream resume() 
public io.vertx.core.TimeoutStream resume() {
        return delegate.resume(); 
}
// io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// void cancel() 
public void cancel() {
        delegate.cancel(); 
}
}
