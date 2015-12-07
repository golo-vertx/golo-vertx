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
public ServerWebSocketStream {
        return (io.vertx.core.http.ServerWebSocketStream)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
public ServerWebSocketStream {
        return (io.vertx.core.http.ServerWebSocketStream)delegate.handler(handler); 
}
// io.vertx.core.http.ServerWebSocketStream pause() 
public ServerWebSocketStream {
        return (io.vertx.core.http.ServerWebSocketStream)delegate.pause(); 
}
// io.vertx.core.http.ServerWebSocketStream resume() 
public ServerWebSocketStream {
        return (io.vertx.core.http.ServerWebSocketStream)delegate.resume(); 
}
// io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public ServerWebSocketStream {
        return (io.vertx.core.http.ServerWebSocketStream)delegate.endHandler(endHandler); 
}
}
