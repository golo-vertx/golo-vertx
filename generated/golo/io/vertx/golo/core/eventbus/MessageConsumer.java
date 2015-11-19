package io.vertx.golo.core.Eventbus;

import io.vertx.core.streams.ReadStream;
import io.vertx.core.eventbus.Message;
public class MessageConsumer { 

private io.vertx.core.eventbus.MessageConsumer<T> originalInstance;// io.vertx.core.eventbus.MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.eventbus.MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
public io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> pause() 
public io.vertx.core.eventbus.MessageConsumer<T> pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> resume() 
public io.vertx.core.eventbus.MessageConsumer<T> resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
// io.vertx.core.streams.ReadStream<T> bodyStream() 
public io.vertx.core.streams.ReadStream<T> bodyStream() {
        return originalInstance.bodyStream(); 
}
// boolean isRegistered() 
public boolean isRegistered() {
        return originalInstance.isRegistered(); 
}
// java.lang.String address() 
public java.lang.String address() {
        return originalInstance.address(); 
}
// io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) 
public io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) {
        return originalInstance.setMaxBufferedMessages(); 
}
// int getMaxBufferedMessages() 
public int getMaxBufferedMessages() {
        return originalInstance.getMaxBufferedMessages(); 
}
// void completionHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void completionHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        return originalInstance.completionHandler(); 
}
// void unregister() 
public void unregister() {
        return originalInstance.unregister(); 
}
// void unregister(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void unregister(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        return originalInstance.unregister(); 
}
}
