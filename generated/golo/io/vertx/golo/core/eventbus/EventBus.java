package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.metrics.Measured;
import io.vertx.core.eventbus.Message;
import io.vertx.core.eventbus.MessageConsumer;
import io.vertx.core.eventbus.MessageProducer;
// io.vertx.core.eventbus.EventBus 
public class EventBus { 

private io.vertx.core.eventbus.EventBus delegate; 
public EventBus(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.EventBus)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return (boolean)delegate.isMetricsEnabled(); 
}
// io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message) 
public io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message) {
        return (io.vertx.core.eventbus.EventBus)delegate.send(address, message); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler) 
public <T>io.vertx.core.eventbus.EventBus {
        return (io.vertx.core.eventbus.EventBus)delegate.send(address, message, replyHandler); 
}
// io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
public io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) {
        return (io.vertx.core.eventbus.EventBus)delegate.send(address, message, options); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler) 
public <T>io.vertx.core.eventbus.EventBus {
        return (io.vertx.core.eventbus.EventBus)delegate.send(address, message, options, replyHandler); 
}
// io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message) 
public io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message) {
        return (io.vertx.core.eventbus.EventBus)delegate.publish(address, message); 
}
// io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
public io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) {
        return (io.vertx.core.eventbus.EventBus)delegate.publish(address, message, options); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address) 
public <T>io.vertx.core.eventbus.MessageConsumer<T> {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.consumer(address); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
public <T>io.vertx.core.eventbus.MessageConsumer<T> {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.consumer(address, handler); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address) 
public <T>io.vertx.core.eventbus.MessageConsumer<T> {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.localConsumer(address); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
public <T>io.vertx.core.eventbus.MessageConsumer<T> {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.localConsumer(address, handler); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address) 
public <T>io.vertx.core.eventbus.MessageProducer<T> {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.sender(address); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options) 
public <T>io.vertx.core.eventbus.MessageProducer<T> {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.sender(address, options); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address) 
public <T>io.vertx.core.eventbus.MessageProducer<T> {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.publisher(address); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options) 
public <T>io.vertx.core.eventbus.MessageProducer<T> {
        return (io.vertx.core.eventbus.MessageProducer<T>)delegate.publisher(address, options); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.close(completionHandler); 
}
}
