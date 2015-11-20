package io.vertx.golo.core.Http;

import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.streams.ReadStream;
public class ServerWebSocketStream { 

private io.vertx.core.http.ServerWebSocketStream originalInstance; 
// io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(handler); 
}
// io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
public io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) {
        return originalInstance.handler(handler); 
}
// io.vertx.core.http.ServerWebSocketStream pause() 
public io.vertx.core.http.ServerWebSocketStream pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.ServerWebSocketStream resume() 
public io.vertx.core.http.ServerWebSocketStream resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(endHandler); 
}
}
