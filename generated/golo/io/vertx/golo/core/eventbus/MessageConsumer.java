package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.ReadStream;
import io.vertx.core.eventbus.Message;
// io.vertx.core.eventbus.MessageConsumer<T> 
public class MessageConsumer<T> { 

private io.vertx.core.eventbus.MessageConsumer delegate; 
public MessageConsumer(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.MessageConsumer)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.eventbus.MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
public MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
                          public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
handler.handle(new io.vertx.golo.core.eventbus.Message(event));
                          }
                        }), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.eventbus.MessageConsumer<T> pause() 
public MessageConsumer<T> pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.eventbus.MessageConsumer<T> resume() 
public MessageConsumer<T> resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// io.vertx.core.streams.ReadStream<T> bodyStream() 
public ReadStream<T> bodyStream() {
        return InternalHelper.safeCreate(this.delegate.bodyStream(), io.vertx.golo.core.streams.ReadStreamImpl.class); 
}
// boolean isRegistered() 
public boolean isRegistered() {
        return delegate.isRegistered(); 
}
// java.lang.String address() 
public String address() {
        return delegate.address(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) 
public MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) {
        return InternalHelper.safeCreate(this.delegate.setMaxBufferedMessages(maxBufferedMessages), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// int getMaxBufferedMessages() 
public int getMaxBufferedMessages() {
        return delegate.getMaxBufferedMessages(); 
}
// void completionHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void completionHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.completionHandler(completionHandler); 
}
// void unregister() 
public void unregister() {
        delegate.unregister(); 
}
// void unregister(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void unregister(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.unregister(completionHandler); 
}
}
