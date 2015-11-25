package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.ReadStream;
import io.vertx.core.net.NetSocket;
// io.vertx.core.net.NetSocketStream 
public class NetSocketStream { 

private io.vertx.core.net.NetSocketStream delegate; 
public NetSocketStream(Object delegate) { 
    this.delegate = (io.vertx.core.net.NetSocketStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
public io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.net.NetSocketStream pause() 
public io.vertx.core.net.NetSocketStream pause() {
        return delegate.pause(); 
}
// io.vertx.core.net.NetSocketStream resume() 
public io.vertx.core.net.NetSocketStream resume() {
        return delegate.resume(); 
}
// io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
}
