package io.vertx.golo.core.Net;

import io.vertx.core.streams.ReadStream;
import io.vertx.core.net.NetSocket;
public class NetSocketStream { 

private io.vertx.core.net.NetSocketStream originalInstance; 
// io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(handler); 
}
// io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
public io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) {
        return originalInstance.handler(handler); 
}
// io.vertx.core.net.NetSocketStream pause() 
public io.vertx.core.net.NetSocketStream pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.net.NetSocketStream resume() 
public io.vertx.core.net.NetSocketStream resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(endHandler); 
}
}
