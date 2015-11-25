package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.streams.ReadStream;
// io.vertx.core.http.ServerWebSocketStream 
public class ServerWebSocketStream { 

private io.vertx.core.http.ServerWebSocketStream delegate; 
public ServerWebSocketStream(Object delegate) { 
    this.delegate = (io.vertx.core.http.ServerWebSocketStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
public io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.http.ServerWebSocketStream pause() 
public io.vertx.core.http.ServerWebSocketStream pause() {
        return delegate.pause(); 
}
// io.vertx.core.http.ServerWebSocketStream resume() 
public io.vertx.core.http.ServerWebSocketStream resume() {
        return delegate.resume(); 
}
// io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
}
