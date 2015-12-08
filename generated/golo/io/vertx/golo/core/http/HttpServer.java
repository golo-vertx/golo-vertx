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
        return delegate.isMetricsEnabled(); 
}
// io.vertx.core.http.HttpServerRequestStream requestStream() 
public HttpServerRequestStream requestStream() {
        return InternalHelper.safeCreate(this.delegate.requestStream(), io.vertx.golo.core.http.HttpServerRequestStream.class); 
}
// io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
public HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) {
        return InternalHelper.safeCreate(this.delegate.requestHandler(new Handler<io.vertx.core.http.HttpServerRequest>() {
                          public void handle(io.vertx.core.http.HttpServerRequest event) {
handler.handle(new io.vertx.golo.core.http.HttpServerRequest(event));
                          }
                        }), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.ServerWebSocketStream websocketStream() 
public ServerWebSocketStream websocketStream() {
        return InternalHelper.safeCreate(this.delegate.websocketStream(), io.vertx.golo.core.http.ServerWebSocketStream.class); 
}
// io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
public HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) {
        return InternalHelper.safeCreate(this.delegate.websocketHandler(new Handler<io.vertx.core.http.ServerWebSocket>() {
                          public void handle(io.vertx.core.http.ServerWebSocket event) {
handler.handle(new io.vertx.golo.core.http.ServerWebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.HttpServer listen() 
public HttpServer listen() {
        return InternalHelper.safeCreate(this.delegate.listen(), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.HttpServer listen(int port, java.lang.String host) 
public HttpServer listen(int port, java.lang.String host) {
        return InternalHelper.safeCreate(this.delegate.listen(port,host), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return InternalHelper.safeCreate(this.delegate.listen(port,host,listenHandler), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.HttpServer listen(int port) 
public HttpServer listen(int port) {
        return InternalHelper.safeCreate(this.delegate.listen(port), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return InternalHelper.safeCreate(this.delegate.listen(port,listenHandler), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
public HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) {
        return InternalHelper.safeCreate(this.delegate.listen(listenHandler), io.vertx.golo.core.http.HttpServer.class); 
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
