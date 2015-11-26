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
public io.vertx.core.eventbus.MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.exceptionHandler(handler); 
}
// io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
public io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.handler(handler); 
}
// io.vertx.core.eventbus.MessageConsumer<T> pause() 
public io.vertx.core.eventbus.MessageConsumer<T> pause() {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.pause(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> resume() 
public io.vertx.core.eventbus.MessageConsumer<T> resume() {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.resume(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.endHandler(endHandler); 
}
// io.vertx.core.streams.ReadStream<T> bodyStream() 
public io.vertx.core.streams.ReadStream<T> bodyStream() {
        return (io.vertx.core.streams.ReadStream<T>)delegate.bodyStream(); 
}
// boolean isRegistered() 
public boolean isRegistered() {
        return (boolean)delegate.isRegistered(); 
}
// java.lang.String address() 
public java.lang.String address() {
        return (java.lang.String)delegate.address(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) 
public io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) {
        return (io.vertx.core.eventbus.MessageConsumer<T>)delegate.setMaxBufferedMessages(maxBufferedMessages); 
}
// int getMaxBufferedMessages() 
public int getMaxBufferedMessages() {
        return (int)delegate.getMaxBufferedMessages(); 
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
