package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.http.HttpMethod;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpClientRequest 
public class HttpClientRequest { 

private io.vertx.core.http.HttpClientRequest delegate; 
public HttpClientRequest(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpClientRequest)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        //param classes(remove later):  
    return delegate.writeQueueFull(); 
}
// io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) 
public HttpClientRequest write(io.vertx.core.buffer.Buffer data) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) 
public HttpClientRequest setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) 
public HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
handler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest pause() 
public HttpClientRequest pause() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest resume() 
public HttpClientRequest resume() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) 
public HttpClientRequest setChunked(boolean chunked) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setChunked(chunked), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// boolean isChunked() 
public boolean isChunked() {
        //param classes(remove later):  
    return delegate.isChunked(); 
}
// io.vertx.core.http.HttpMethod method() 
public HttpMethod method() {
        //param classes(remove later):  
    return delegate.method(); 
}
// java.lang.String uri() 
public String uri() {
        //param classes(remove later):  
    return delegate.uri(); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap headers() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) 
public HttpClientRequest putHeader(java.lang.String name, java.lang.String value) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.putHeader(name,value), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) 
public HttpClientRequest write(java.lang.String chunk) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.write(chunk), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) 
public HttpClientRequest write(java.lang.String chunk, java.lang.String enc) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.write(chunk,enc), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.continueHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest sendHead() 
public HttpClientRequest sendHead() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.sendHead(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// void end(java.lang.String chunk) 
public void end(java.lang.String chunk) {
        //param classes(remove later):   STRING  
    delegate.end(chunk); 
}
// void end(java.lang.String chunk, java.lang.String enc) 
public void end(java.lang.String chunk, java.lang.String enc) {
        //param classes(remove later):   STRING   STRING  
    delegate.end(chunk,enc); 
}
// void end(io.vertx.core.buffer.Buffer chunk) 
public void end(io.vertx.core.buffer.Buffer chunk) {
        //param classes(remove later):   API  
    delegate.end(chunk); 
}
// void end() 
public void end() {
        //param classes(remove later):  
    delegate.end(); 
}
// io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs) 
public HttpClientRequest setTimeout(long timeoutMs) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setTimeout(timeoutMs), io.vertx.golo.core.http.HttpClientRequest.class); 
}
}
