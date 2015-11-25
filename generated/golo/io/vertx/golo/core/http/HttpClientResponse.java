package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.MultiMap;
import io.vertx.core.net.NetSocket;
// io.vertx.core.http.HttpClientResponse 
public class HttpClientResponse { 

private io.vertx.core.http.HttpClientResponse delegate; 
public HttpClientResponse(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpClientResponse)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.HttpClientResponse resume() 
public io.vertx.core.http.HttpClientResponse resume() {
        return delegate.resume(); 
}
// io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.http.HttpClientResponse pause() 
public io.vertx.core.http.HttpClientResponse pause() {
        return delegate.pause(); 
}
// io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// int statusCode() 
public int statusCode() {
        return delegate.statusCode(); 
}
// java.lang.String statusMessage() 
public java.lang.String statusMessage() {
        return delegate.statusMessage(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return delegate.headers(); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public java.lang.String getHeader(java.lang.String headerName) {
        return delegate.getHeader(headerName); 
}
// java.lang.String getTrailer(java.lang.String trailerName) 
public java.lang.String getTrailer(java.lang.String trailerName) {
        return delegate.getTrailer(trailerName); 
}
// io.vertx.core.MultiMap trailers() 
public io.vertx.core.MultiMap trailers() {
        return delegate.trailers(); 
}
// java.util.List<java.lang.String> cookies() 
public java.util.List<java.lang.String> cookies() {
        return delegate.cookies(); 
}
// io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) {
        return delegate.bodyHandler(bodyHandler); 
}
// io.vertx.core.net.NetSocket netSocket() 
public io.vertx.core.net.NetSocket netSocket() {
        return delegate.netSocket(); 
}
}
