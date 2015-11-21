package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.MultiMap;
public class Message { 

private io.vertx.core.eventbus.Message<T> delegate; 
public Message(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.Message<T>)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// java.lang.String address() 
public java.lang.String address() {
        return delegate.address(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return delegate.headers(); 
}
// T body() 
public T body() {
        return delegate.body(); 
}
// java.lang.String replyAddress() 
public java.lang.String replyAddress() {
        return delegate.replyAddress(); 
}
// void reply(java.lang.Object message) 
public void reply(java.lang.Object message) {
        delegate.reply(message); 
}
// <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
public <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) {
        return delegate.reply(message, replyHandler); 
}
// void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
public void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) {
        delegate.reply(message, options); 
}
// <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
public <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) {
        return delegate.reply(message, options, replyHandler); 
}
// void fail(int failureCode, java.lang.String message) 
public void fail(int failureCode, java.lang.String message) {
        delegate.fail(failureCode, message); 
}
}
