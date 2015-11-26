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
public io.vertx.core.streams.WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.streams.WriteStream<T>)delegate.exceptionHandler(handler); 
}
// io.vertx.core.streams.WriteStream<T> write(T data) 
public io.vertx.core.streams.WriteStream<T> write(T data) {
        return (io.vertx.core.streams.WriteStream<T>)delegate.write(data); 
}
// io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.streams.WriteStream<T>)delegate.setWriteQueueMaxSize(maxSize); 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.streams.WriteStream<T>)delegate.drainHandler(handler); 
}
}
