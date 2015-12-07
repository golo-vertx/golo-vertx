package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.MultiMap;
// io.vertx.core.eventbus.Message<T> 
public class Message<T> { 

private io.vertx.core.eventbus.Message delegate; 
public Message(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.Message)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// java.lang.String address() 
public String {
        return (java.lang.String)delegate.address(); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap {
        return (io.vertx.core.MultiMap)delegate.headers(); 
}
// T body() 
public T {
        return (T)delegate.body(); 
}
// java.lang.String replyAddress() 
public String {
        return (java.lang.String)delegate.replyAddress(); 
}
// void reply(java.lang.Object message) 
public void {
        delegate.reply(message); 
}
// <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
public <R> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) {
        delegate.reply(message, replyHandler); 
}
// void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
public void {
        delegate.reply(message, options); 
}
// <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
public <R> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) {
        delegate.reply(message, options, replyHandler); 
}
// void fail(int failureCode, java.lang.String message) 
public void {
        delegate.fail(failureCode, message); 
}
}
