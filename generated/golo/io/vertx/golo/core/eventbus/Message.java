package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.eventbus.Message<T> 
public class Message<T> { 

private io.vertx.core.eventbus.Message delegate; 
public Message(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.Message)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// java.lang.String address() 
// TypeParams: [] 
public String address() {
        //param classes(remove later):  
    return delegate.address(); 
}
// io.vertx.core.MultiMap headers() 
// TypeParams: [] 
public MultiMap headers() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// T body() 
// TypeParams: [] 
public T body() {
        //param classes(remove later):  
    return delegate.body(); 
}
// java.lang.String replyAddress() 
// TypeParams: [] 
public String replyAddress() {
        //param classes(remove later):  
    return delegate.replyAddress(); 
}
// void reply(java.lang.Object message) 
// TypeParams: [] 
public void reply(Object message) {
        //param classes(remove later):   OBJECT  
    delegate.reply(message); 
}
// <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
// TypeParams: [TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]] 
public <R> void reply(Object message,Handler<AsyncResult<Message<R>>> replyHandler) {
        //param classes(remove later):   OBJECT   HANDLER  
    delegate.reply(message,replyHandler); 
}
// void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
// TypeParams: [] 
public void reply(Object message,DeliveryOptions options) {
        //param classes(remove later):   OBJECT   DATA_OBJECT  
    delegate.reply(message,options); 
}
// <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
// TypeParams: [TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]] 
public <R> void reply(Object message,DeliveryOptions options,Handler<AsyncResult<Message<R>>> replyHandler) {
        //param classes(remove later):   OBJECT   DATA_OBJECT   HANDLER  
    delegate.reply(message,options,replyHandler); 
}
// void fail(int failureCode, java.lang.String message) 
// TypeParams: [] 
public void fail(int failureCode,String message) {
        //param classes(remove later):   PRIMITIVE   STRING  
    delegate.fail(failureCode,message); 
}
}
