package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.ReadStream;
import io.vertx.core.http.WebSocket;
// io.vertx.core.http.WebSocketStream 
public class WebSocketStream { 

private io.vertx.core.http.WebSocketStream delegate; 
public WebSocketStream(Object delegate) { 
    this.delegate = (io.vertx.core.http.WebSocketStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.http.WebSocketStream)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler) 
public io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler) {
        return (io.vertx.core.http.WebSocketStream)delegate.handler(handler); 
}
// io.vertx.core.http.WebSocketStream pause() 
public io.vertx.core.http.WebSocketStream pause() {
        return (io.vertx.core.http.WebSocketStream)delegate.pause(); 
}
// io.vertx.core.http.WebSocketStream resume() 
public io.vertx.core.http.WebSocketStream resume() {
        return (io.vertx.core.http.WebSocketStream)delegate.resume(); 
}
// io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.http.WebSocketStream)delegate.endHandler(endHandler); 
}
}
