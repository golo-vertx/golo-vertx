package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.net.NetSocketStream;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetSocket;
public class NetServer { 

private io.vertx.core.net.NetServer delegate; 
public NetServer(Object delegate) { 
    this.delegate = (io.vertx.core.net.NetServer)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return delegate.isMetricsEnabled(); 
}
// io.vertx.core.net.NetSocketStream connectStream() 
public io.vertx.core.net.NetSocketStream connectStream() {
        return delegate.connectStream(); 
}
// io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
public io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) {
        return delegate.connectHandler(handler); 
}
// io.vertx.core.net.NetServer listen() 
public io.vertx.core.net.NetServer listen() {
        return delegate.listen(); 
}
// io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        return delegate.listen(listenHandler); 
}
// io.vertx.core.net.NetServer listen(int port, java.lang.String host) 
public io.vertx.core.net.NetServer listen(int port, java.lang.String host) {
        return delegate.listen(port, host); 
}
// io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        return delegate.listen(port, host, listenHandler); 
}
// io.vertx.core.net.NetServer listen(int port) 
public io.vertx.core.net.NetServer listen(int port) {
        return delegate.listen(port); 
}
// io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        return delegate.listen(port, listenHandler); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.close(completionHandler); 
}
// int actualPort() 
public int actualPort() {
        return delegate.actualPort(); 
}
}
