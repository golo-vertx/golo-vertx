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
public WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler) 
public WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
handler.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream pause() 
public WebSocketStream pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream resume() 
public WebSocketStream resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.WebSocketStream.class); 
}
}
