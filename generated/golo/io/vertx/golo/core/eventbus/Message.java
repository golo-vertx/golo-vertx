package io.vertx.golo.core.Eventbus;

import io.vertx.core.MultiMap;
public class Message { 

private io.vertx.core.eventbus.Message<T> originalInstance;// java.lang.String address() 
public java.lang.String address() {
        return originalInstance.address(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return originalInstance.headers(); 
}
// T body() 
public T body() {
        return originalInstance.body(); 
}
// java.lang.String replyAddress() 
public java.lang.String replyAddress() {
        return originalInstance.replyAddress(); 
}
// void reply(java.lang.Object message) 
public void reply(java.lang.Object message) {
        return originalInstance.reply(); 
}
// <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
public <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) {
        return originalInstance.reply(); 
}
// void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
public void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) {
        return originalInstance.reply(); 
}
// <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
public <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) {
        return originalInstance.reply(); 
}
// void fail(int failureCode, java.lang.String message) 
public void fail(int failureCode, java.lang.String message) {
        return originalInstance.fail(); 
}
}
