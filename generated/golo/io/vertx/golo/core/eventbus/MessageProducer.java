package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.WriteStream;
// io.vertx.core.eventbus.MessageProducer<T> 
public class MessageProducer<T> { 

private io.vertx.core.eventbus.MessageProducer delegate; 
public MessageProducer(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.MessageProducer)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.exceptionHandler(handler); 
}
// io.vertx.core.eventbus.MessageProducer<T> write(T data) 
public io.vertx.core.eventbus.MessageProducer<T> write(T data) {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.write(data); 
}
// io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.drainHandler(handler); 
}
// io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options) 
public io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options) {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.deliveryOptions(options); 
}
// java.lang.String address() 
public java.lang.String address() {
        return (java.lang.String)delegate.address(); 
}
}
