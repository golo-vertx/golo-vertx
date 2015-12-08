package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.ReadStream;
// io.vertx.core.TimeoutStream 
public class TimeoutStream { 

private io.vertx.core.TimeoutStream delegate; 
public TimeoutStream(Object delegate) { 
    this.delegate = (io.vertx.core.TimeoutStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.TimeoutStream.class); 
}
// io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) 
public TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(handler), io.vertx.golo.core.TimeoutStream.class); 
}
// io.vertx.core.TimeoutStream pause() 
public TimeoutStream pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.TimeoutStream.class); 
}
// io.vertx.core.TimeoutStream resume() 
public TimeoutStream resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.TimeoutStream.class); 
}
// io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.TimeoutStream.class); 
}
// void cancel() 
public void cancel() {
        delegate.cancel(); 
}
}
