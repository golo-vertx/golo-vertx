package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.MultiMap;
// io.vertx.core.http.HttpClientRequest 
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
        return delegate.writeQueueFull(); 
}
// io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) 
public HttpClientRequest write(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) 
public HttpClientRequest setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) 
public HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
handler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest pause() 
public HttpClientRequest pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest resume() 
public HttpClientRequest resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) 
public HttpClientRequest setChunked(boolean chunked) {
        return InternalHelper.safeCreate(this.delegate.setChunked(chunked), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// boolean isChunked() 
public boolean isChunked() {
        return delegate.isChunked(); 
}
// io.vertx.core.http.HttpMethod method() 
public HttpMethod method() {
        return delegate.method(); 
}
// java.lang.String uri() 
public String uri() {
        return delegate.uri(); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap headers() {
        return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) 
public HttpClientRequest putHeader(java.lang.String name, java.lang.String value) {
        return InternalHelper.safeCreate(this.delegate.putHeader(name,value), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) 
public HttpClientRequest write(java.lang.String chunk) {
        return InternalHelper.safeCreate(this.delegate.write(chunk), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) 
public HttpClientRequest write(java.lang.String chunk, java.lang.String enc) {
        return InternalHelper.safeCreate(this.delegate.write(chunk,enc), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.continueHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest sendHead() 
public HttpClientRequest sendHead() {
        return InternalHelper.safeCreate(this.delegate.sendHead(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// void end(java.lang.String chunk) 
public void end(java.lang.String chunk) {
        delegate.end(chunk); 
}
// void end(java.lang.String chunk, java.lang.String enc) 
public void end(java.lang.String chunk, java.lang.String enc) {
        delegate.end(chunk,enc); 
}
// void end(io.vertx.core.buffer.Buffer chunk) 
public void end(io.vertx.core.buffer.Buffer chunk) {
        delegate.end(chunk); 
}
// void end() 
public void end() {
        delegate.end(); 
}
// io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs) 
public HttpClientRequest setTimeout(long timeoutMs) {
        return InternalHelper.safeCreate(this.delegate.setTimeout(timeoutMs), io.vertx.golo.core.http.HttpClientRequest.class); 
}
}
