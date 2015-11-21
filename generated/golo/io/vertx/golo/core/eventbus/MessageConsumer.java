package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.ReadStream;
import io.vertx.core.eventbus.Message;
public class MessageConsumer { 

private io.vertx.core.eventbus.MessageConsumer<T> delegate; 
public MessageConsumer(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.MessageConsumer<T>)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.eventbus.MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.eventbus.MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
public io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.eventbus.MessageConsumer<T> pause() 
public io.vertx.core.eventbus.MessageConsumer<T> pause() {
        return delegate.pause(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> resume() 
public io.vertx.core.eventbus.MessageConsumer<T> resume() {
        return delegate.resume(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// io.vertx.core.streams.ReadStream<T> bodyStream() 
public io.vertx.core.streams.ReadStream<T> bodyStream() {
        return delegate.bodyStream(); 
}
// boolean isRegistered() 
public boolean isRegistered() {
        return delegate.isRegistered(); 
}
// java.lang.String address() 
public java.lang.String address() {
        return delegate.address(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) 
public io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) {
        return delegate.setMaxBufferedMessages(maxBufferedMessages); 
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
