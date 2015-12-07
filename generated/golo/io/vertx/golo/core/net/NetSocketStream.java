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
public NetSocketStream {
        return (io.vertx.core.net.NetSocketStream)delegate.exceptionHandler(handler); 
}
// io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
public NetSocketStream {
        return (io.vertx.core.net.NetSocketStream)delegate.handler(handler); 
}
// io.vertx.core.net.NetSocketStream pause() 
public NetSocketStream {
        return (io.vertx.core.net.NetSocketStream)delegate.pause(); 
}
// io.vertx.core.net.NetSocketStream resume() 
public NetSocketStream {
        return (io.vertx.core.net.NetSocketStream)delegate.resume(); 
}
// io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public NetSocketStream {
        return (io.vertx.core.net.NetSocketStream)delegate.endHandler(endHandler); 
}
}
