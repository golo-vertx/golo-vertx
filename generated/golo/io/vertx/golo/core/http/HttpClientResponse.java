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
public HttpClientResponse resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.http.HttpClientResponse pause() 
public HttpClientResponse pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// int statusCode() 
public int statusCode() {
        return delegate.statusCode(); 
}
// java.lang.String statusMessage() 
public String statusMessage() {
        return delegate.statusMessage(); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap headers() {
        return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public String getHeader(java.lang.String headerName) {
        return delegate.getHeader(headerName); 
}
// java.lang.String getTrailer(java.lang.String trailerName) 
public String getTrailer(java.lang.String trailerName) {
        return delegate.getTrailer(trailerName); 
}
// io.vertx.core.MultiMap trailers() 
public MultiMap trailers() {
        return InternalHelper.safeCreate(this.delegate.trailers(), io.vertx.golo.core.MultiMap.class); 
}
// java.util.List<java.lang.String> cookies() 
public String> cookies() {
        return delegate.cookies(); 
}
// io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) {
        return InternalHelper.safeCreate(this.delegate.bodyHandler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
bodyHandler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.net.NetSocket netSocket() 
public NetSocket netSocket() {
        return InternalHelper.safeCreate(this.delegate.netSocket(), io.vertx.golo.core.net.NetSocket.class); 
}
}
