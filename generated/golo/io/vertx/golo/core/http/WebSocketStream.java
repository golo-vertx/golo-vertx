package io.vertx.golo.core.Http;

import io.vertx.core.streams.ReadStream;
import io.vertx.core.http.WebSocket;
public class WebSocketStream { 

private io.vertx.core.http.WebSocketStream originalInstance;// io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler) 
public io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.http.WebSocketStream pause() 
public io.vertx.core.http.WebSocketStream pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.WebSocketStream resume() 
public io.vertx.core.http.WebSocketStream resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
}
