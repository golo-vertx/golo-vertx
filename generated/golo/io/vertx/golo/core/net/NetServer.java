package io.vertx.golo.core.Net;

import io.vertx.core.net.NetSocketStream;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetSocket;
public class NetServer { 

private io.vertx.core.net.NetServer originalInstance; 
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return originalInstance.isMetricsEnabled(); 
}
// io.vertx.core.net.NetSocketStream connectStream() 
public io.vertx.core.net.NetSocketStream connectStream() {
        return originalInstance.connectStream(); 
}
// io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
public io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) {
        return originalInstance.connectHandler(handler); 
}
// io.vertx.core.net.NetServer listen() 
public io.vertx.core.net.NetServer listen() {
        return originalInstance.listen(); 
}
// io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        return originalInstance.listen(listenHandler); 
}
// io.vertx.core.net.NetServer listen(int port, java.lang.String host) 
public io.vertx.core.net.NetServer listen(int port, java.lang.String host) {
        return originalInstance.listen(port, host); 
}
// io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        return originalInstance.listen(port, host, listenHandler); 
}
// io.vertx.core.net.NetServer listen(int port) 
public io.vertx.core.net.NetServer listen(int port) {
        return originalInstance.listen(port); 
}
// io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        return originalInstance.listen(port, listenHandler); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        return originalInstance.close(completionHandler); 
}
// int actualPort() 
public int actualPort() {
        return originalInstance.actualPort(); 
}
}
