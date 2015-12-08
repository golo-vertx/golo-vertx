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
        return delegate.writeQueueFull(); 
}
// io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// io.vertx.core.eventbus.MessageProducer<T> write(T data) 
public MessageProducer<T> write(T data) {
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize) 
public MessageProducer<T> setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options) 
public MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options) {
        return InternalHelper.safeCreate(this.delegate.deliveryOptions(options), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// java.lang.String address() 
public String address() {
        return delegate.address(); 
}
}
