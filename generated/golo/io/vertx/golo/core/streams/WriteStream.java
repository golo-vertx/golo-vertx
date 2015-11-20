package io.vertx.golo.core.Streams;

import io.vertx.core.streams.StreamBase;
public class WriteStream { 

private io.vertx.core.streams.WriteStream<T> originalInstance; 
// io.vertx.core.streams.WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.streams.WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(handler); 
}
// io.vertx.core.streams.WriteStream<T> write(T data) 
public io.vertx.core.streams.WriteStream<T> write(T data) {
        return originalInstance.write(data); 
}
// io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(maxSize); 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(handler); 
}
}
