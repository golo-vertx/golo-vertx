package io.vertx.golo.core.Http;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.MultiMap;
import io.vertx.core.net.NetSocket;
public class HttpClientResponse { 

private io.vertx.core.http.HttpClientResponse originalInstance;// io.vertx.core.http.HttpClientResponse resume() 
public io.vertx.core.http.HttpClientResponse resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.http.HttpClientResponse pause() 
public io.vertx.core.http.HttpClientResponse pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
// int statusCode() 
public int statusCode() {
        return originalInstance.statusCode(); 
}
// java.lang.String statusMessage() 
public java.lang.String statusMessage() {
        return originalInstance.statusMessage(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return originalInstance.headers(); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public java.lang.String getHeader(java.lang.String headerName) {
        return originalInstance.getHeader(); 
}
// java.lang.String getTrailer(java.lang.String trailerName) 
public java.lang.String getTrailer(java.lang.String trailerName) {
        return originalInstance.getTrailer(); 
}
// io.vertx.core.MultiMap trailers() 
public io.vertx.core.MultiMap trailers() {
        return originalInstance.trailers(); 
}
// java.util.List<java.lang.String> cookies() 
public java.util.List<java.lang.String> cookies() {
        return originalInstance.cookies(); 
}
// io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) {
        return originalInstance.bodyHandler(); 
}
// io.vertx.core.net.NetSocket netSocket() 
public io.vertx.core.net.NetSocket netSocket() {
        return originalInstance.netSocket(); 
}
}
