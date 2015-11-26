package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.metrics.Measured;
import io.vertx.core.http.HttpServerRequestStream;
import io.vertx.core.http.ServerWebSocketStream;
// io.vertx.core.http.HttpServer 
public class HttpServer { 

private io.vertx.core.http.HttpServer delegate; 
public HttpServer(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpServer)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return (boolean)delegate.isMetricsEnabled(); 
}
// io.vertx.core.http.HttpServerRequestStream requestStream() 
public io.vertx.core.http.HttpServerRequestStream requestStream() {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.requestStream(); 
}
// io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
public io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) {
        return (io.vertx.core.http.HttpServer)delegate.requestHandler(handler); 
}
// io.vertx.core.http.ServerWebSocketStream websocketStream() 
public io.vertx.core.http.ServerWebSocketStream websocketStream() {
        return (io.vertx.core.http.ServerWebSocketStream)delegate.websocketStream(); 
}
// io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
public io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) {
        return (io.vertx.core.http.HttpServer)delegate.websocketHandler(handler); 
}
// io.vertx.core.http.HttpServer listen() 
public io.vertx.core.http.HttpServer listen() {
        return (io.vertx.core.http.HttpServer)delegate.listen(); 
}
// io.vertx.core.http.HttpServer listen(int port, java.lang.String host) 
public io.vertx.core.http.HttpServer listen(int port, java.lang.String host) {
        return (io.vertx.core.http.HttpServer)delegate.listen(port, host); 
}
// io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return (io.vertx.core.http.HttpServer)delegate.listen(port, host, listenHandler); 
}
// io.vertx.core.http.HttpServer listen(int port) 
public io.vertx.core.http.HttpServer listen(int port) {
        return (io.vertx.core.http.HttpServer)delegate.listen(port); 
}
// io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return (io.vertx.core.http.HttpServer)delegate.listen(port, listenHandler); 
}
// io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return (io.vertx.core.http.HttpServer)delegate.listen(listenHandler); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.close(completionHandler); 
}
}
