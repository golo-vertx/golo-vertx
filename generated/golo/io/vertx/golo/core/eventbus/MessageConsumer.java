package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.eventbus.MessageConsumer<T> 
public class MessageConsumer<T> { 

private io.vertx.core.eventbus.MessageConsumer delegate; 
public MessageConsumer(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.MessageConsumer)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.eventbus.MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public MessageConsumer<T> exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    THROWABLE   
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
// TypeParams: [] 
public MessageConsumer<T> handler(Handler<Message<T>> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
                          public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
handler.handle(new io.vertx.golo.core.eventbus.Message(event));
                          }
                        }), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.eventbus.MessageConsumer<T> pause() 
// TypeParams: [] 
public MessageConsumer<T> pause() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.eventbus.MessageConsumer<T> resume() 
// TypeParams: [] 
public MessageConsumer<T> resume() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public MessageConsumer<T> endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.streams.ReadStream<T> bodyStream() 
// TypeParams: [] 
public ReadStream<T> bodyStream() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.bodyStream(), io.vertx.golo.core.streams.ReadStreamImpl.class); 
}
// boolean isRegistered() 
// TypeParams: [] 
public boolean isRegistered() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.isRegistered(); 
}
// java.lang.String address() 
// TypeParams: [] 
public String address() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.address(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) 
// TypeParams: [] 
public MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setMaxBufferedMessages(maxBufferedMessages), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// int getMaxBufferedMessages() 
// TypeParams: [] 
public int getMaxBufferedMessages() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.getMaxBufferedMessages(); 
}
// void completionHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
// TypeParams: [] 
public void completionHandler(Handler<AsyncResult<Void>> completionHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    ASYNC_RESULT   
    this.delegate.completionHandler(completionHandler); 
}
// void unregister() 
// TypeParams: [] 
public void unregister() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    this.delegate.unregister(); 
}
// void unregister(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
// TypeParams: [] 
public void unregister(Handler<AsyncResult<Void>> completionHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    ASYNC_RESULT   
    this.delegate.unregister(completionHandler); 
}
}
