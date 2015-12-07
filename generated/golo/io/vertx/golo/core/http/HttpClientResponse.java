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
public HttpClientResponse {
        return (io.vertx.core.http.HttpClientResponse)delegate.resume(); 
}
// io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpClientResponse {
        return (io.vertx.core.http.HttpClientResponse)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public HttpClientResponse {
        return (io.vertx.core.http.HttpClientResponse)delegate.handler(handler); 
}
// io.vertx.core.http.HttpClientResponse pause() 
public HttpClientResponse {
        return (io.vertx.core.http.HttpClientResponse)delegate.pause(); 
}
// io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpClientResponse {
        return (io.vertx.core.http.HttpClientResponse)delegate.endHandler(endHandler); 
}
// int statusCode() 
public int {
        return (int)delegate.statusCode(); 
}
// java.lang.String statusMessage() 
public String {
        return (java.lang.String)delegate.statusMessage(); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap {
        return (io.vertx.core.MultiMap)delegate.headers(); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public String {
        return (java.lang.String)delegate.getHeader(headerName); 
}
// java.lang.String getTrailer(java.lang.String trailerName) 
public String {
        return (java.lang.String)delegate.getTrailer(trailerName); 
}
// io.vertx.core.MultiMap trailers() 
public MultiMap {
        return (io.vertx.core.MultiMap)delegate.trailers(); 
}
// java.util.List<java.lang.String> cookies() 
public String> {
        return (java.util.List<java.lang.String>)delegate.cookies(); 
}
// io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public HttpClientResponse {
        return (io.vertx.core.http.HttpClientResponse)delegate.bodyHandler(bodyHandler); 
}
// io.vertx.core.net.NetSocket netSocket() 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.netSocket(); 
}
}
