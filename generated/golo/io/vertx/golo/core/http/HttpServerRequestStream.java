package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.streams.ReadStream;
// io.vertx.core.http.HttpServerRequestStream 
public class HttpServerRequestStream { 

private io.vertx.core.http.HttpServerRequestStream delegate; 
public HttpServerRequestStream(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpServerRequestStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
public io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.handler(handler); 
}
// io.vertx.core.http.HttpServerRequestStream pause() 
public io.vertx.core.http.HttpServerRequestStream pause() {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.pause(); 
}
// io.vertx.core.http.HttpServerRequestStream resume() 
public io.vertx.core.http.HttpServerRequestStream resume() {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.resume(); 
}
// io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.endHandler(endHandler); 
}
}
