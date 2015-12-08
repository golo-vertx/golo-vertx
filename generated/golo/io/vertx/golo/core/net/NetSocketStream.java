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
public NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
public NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.net.NetSocket>() {
                          public void handle(io.vertx.core.net.NetSocket event) {
handler.handle(new io.vertx.golo.core.net.NetSocket(event));
                          }
                        }), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetSocketStream pause() 
public NetSocketStream pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetSocketStream resume() 
public NetSocketStream resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.net.NetSocketStream.class); 
}
}
