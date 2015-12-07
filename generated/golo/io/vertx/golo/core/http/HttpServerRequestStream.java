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
public HttpServerRequestStream {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
public HttpServerRequestStream {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.handler(handler); 
}
// io.vertx.core.http.HttpServerRequestStream pause() 
public HttpServerRequestStream {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.pause(); 
}
// io.vertx.core.http.HttpServerRequestStream resume() 
public HttpServerRequestStream {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.resume(); 
}
// io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpServerRequestStream {
        return (io.vertx.core.http.HttpServerRequestStream)delegate.endHandler(endHandler); 
}
}
