package io.vertx.golo.core.Http;

import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.metrics.Measured;
import io.vertx.core.http.HttpServerRequestStream;
import io.vertx.core.http.ServerWebSocketStream;
public class HttpServer { 

private io.vertx.core.http.HttpServer originalInstance;// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return originalInstance.isMetricsEnabled(); 
}
// io.vertx.core.http.HttpServerRequestStream requestStream() 
public io.vertx.core.http.HttpServerRequestStream requestStream() {
        return originalInstance.requestStream(); 
}
// io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
public io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) {
        return originalInstance.requestHandler(); 
}
// io.vertx.core.http.ServerWebSocketStream websocketStream() 
public io.vertx.core.http.ServerWebSocketStream websocketStream() {
        return originalInstance.websocketStream(); 
}
// io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
public io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) {
        return originalInstance.websocketHandler(); 
}
// io.vertx.core.http.HttpServer listen() 
public io.vertx.core.http.HttpServer listen() {
        return originalInstance.listen(); 
}
// io.vertx.core.http.HttpServer listen(int port, java.lang.String host) 
public io.vertx.core.http.HttpServer listen(int port, java.lang.String host) {
        return originalInstance.listen(); 
}
// io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return originalInstance.listen(); 
}
// io.vertx.core.http.HttpServer listen(int port) 
public io.vertx.core.http.HttpServer listen(int port) {
        return originalInstance.listen(); 
}
// io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return originalInstance.listen(); 
}
// io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return originalInstance.listen(); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        return originalInstance.close(); 
}
}
