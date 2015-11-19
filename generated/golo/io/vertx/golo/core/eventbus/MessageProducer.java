package io.vertx.golo.core.Eventbus;

import io.vertx.core.streams.WriteStream;
public class MessageProducer { 

private io.vertx.core.eventbus.MessageProducer<T> originalInstance;// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.eventbus.MessageProducer<T> write(T data) 
public io.vertx.core.eventbus.MessageProducer<T> write(T data) {
        return originalInstance.write(); 
}
// io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(); 
}
// io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(); 
}
// io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options) 
public io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options) {
        return originalInstance.deliveryOptions(); 
}
// java.lang.String address() 
public java.lang.String address() {
        return originalInstance.address(); 
}
}
