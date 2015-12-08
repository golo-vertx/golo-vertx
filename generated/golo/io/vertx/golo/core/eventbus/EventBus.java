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
        return delegate.isMetricsEnabled(); 
}
// io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message) 
public EventBus send(java.lang.String address, java.lang.Object message) {
        return InternalHelper.safeCreate(this.delegate.send(address,message), io.vertx.golo.core.eventbus.EventBus.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler) 
public <T> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler) {
        return InternalHelper.safeCreate(this.delegate.send(address,message,replyHandler), io.vertx.golo.core.eventbus.EventBus.class); 
}
// io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
public EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) {
        return InternalHelper.safeCreate(this.delegate.send(address,message,options), io.vertx.golo.core.eventbus.EventBus.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler) 
public <T> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler) {
        return InternalHelper.safeCreate(this.delegate.send(address,message,options,replyHandler), io.vertx.golo.core.eventbus.EventBus.class); 
}
// io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message) 
public EventBus publish(java.lang.String address, java.lang.Object message) {
        return InternalHelper.safeCreate(this.delegate.publish(address,message), io.vertx.golo.core.eventbus.EventBus.class); 
}
// io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
public EventBus publish(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) {
        return InternalHelper.safeCreate(this.delegate.publish(address,message,options), io.vertx.golo.core.eventbus.EventBus.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address) 
public <T> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address) {
        return InternalHelper.safeCreate(this.delegate.consumer(address), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
public <T> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) {
        return InternalHelper.safeCreate(this.delegate.consumer(address,new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
                          public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
handler.handle(new io.vertx.golo.core.eventbus.Message(event));
                          }
                        }), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address) 
public <T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address) {
        return InternalHelper.safeCreate(this.delegate.localConsumer(address), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
public <T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) {
        return InternalHelper.safeCreate(this.delegate.localConsumer(address,new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
                          public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
handler.handle(new io.vertx.golo.core.eventbus.Message(event));
                          }
                        }), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address) 
public <T> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address) {
        return InternalHelper.safeCreate(this.delegate.sender(address), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options) 
public <T> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options) {
        return InternalHelper.safeCreate(this.delegate.sender(address,options), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address) 
public <T> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address) {
        return InternalHelper.safeCreate(this.delegate.publisher(address), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options) 
public <T> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options) {
        return InternalHelper.safeCreate(this.delegate.publisher(address,options), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.close(completionHandler); 
}
}
