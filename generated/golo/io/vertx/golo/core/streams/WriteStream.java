package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.StreamBase;
// io.vertx.core.streams.WriteStream<T> 
public class WriteStream<T> { 

private io.vertx.core.streams.WriteStream delegate; 
public WriteStream(Object delegate) { 
    this.delegate = (io.vertx.core.streams.WriteStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.streams.WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.streams.WriteStreamImpl.class); 
}
// io.vertx.core.streams.WriteStream<T> write(T data) 
public WriteStream<T> write(T data) {
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.streams.WriteStreamImpl.class); 
}
// io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize) 
public WriteStream<T> setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.streams.WriteStreamImpl.class); 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return delegate.writeQueueFull(); 
}
// io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.streams.WriteStreamImpl.class); 
}
}
