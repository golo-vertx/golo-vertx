package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import java.util.List;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.NetSocket;
// Type: io.vertx.core.http.HttpClientResponse 
public class HttpClientResponse { 

private io.vertx.core.http.HttpClientResponse delegate; 
public HttpClientResponse(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpClientResponse)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.HttpClientResponse resume() 
// TypeParams: [] 
public HttpClientResponse resume() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public HttpClientResponse exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
// TypeParams: [] 
public HttpClientResponse handler(Handler<Buffer> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.http.HttpClientResponse pause() 
// TypeParams: [] 
public HttpClientResponse pause() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public HttpClientResponse endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// int statusCode() 
// TypeParams: [] 
public int statusCode() {
        //param classes(remove later):  
    return delegate.statusCode(); 
}
// java.lang.String statusMessage() 
// TypeParams: [] 
public String statusMessage() {
        //param classes(remove later):  
    return delegate.statusMessage(); 
}
// io.vertx.core.MultiMap headers() 
// TypeParams: [] 
public MultiMap headers() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// java.lang.String getHeader(java.lang.String headerName) 
// TypeParams: [] 
public String getHeader(String headerName) {
        //param classes(remove later):   STRING  
    return delegate.getHeader(headerName); 
}
// java.lang.String getTrailer(java.lang.String trailerName) 
// TypeParams: [] 
public String getTrailer(String trailerName) {
        //param classes(remove later):   STRING  
    return delegate.getTrailer(trailerName); 
}
// io.vertx.core.MultiMap trailers() 
// TypeParams: [] 
public MultiMap trailers() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.trailers(), io.vertx.golo.core.MultiMap.class); 
}
// java.util.List<java.lang.String> cookies() 
// TypeParams: [] 
public List<String> cookies() {
        //param classes(remove later):  
    return delegate.cookies(); 
}
// io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
// TypeParams: [] 
public HttpClientResponse bodyHandler(Handler<Buffer> bodyHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.bodyHandler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
bodyHandler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientResponse.class); 
}
// io.vertx.core.net.NetSocket netSocket() 
// TypeParams: [] 
public NetSocket netSocket() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.netSocket(), io.vertx.golo.core.net.NetSocket.class); 
}
}
