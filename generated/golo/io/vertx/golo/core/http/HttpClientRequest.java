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
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.http.HttpClientRequest)delegate.write(data); 
}
// io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.http.HttpClientRequest)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.drainHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) 
public io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.handler(handler); 
}
// io.vertx.core.http.HttpClientRequest pause() 
public io.vertx.core.http.HttpClientRequest pause() {
        return (io.vertx.core.http.HttpClientRequest)delegate.pause(); 
}
// io.vertx.core.http.HttpClientRequest resume() 
public io.vertx.core.http.HttpClientRequest resume() {
        return (io.vertx.core.http.HttpClientRequest)delegate.resume(); 
}
// io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) 
public io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) {
        return (io.vertx.core.http.HttpClientRequest)delegate.setChunked(chunked); 
}
// boolean isChunked() 
public boolean isChunked() {
        return (boolean)delegate.isChunked(); 
}
// io.vertx.core.http.HttpMethod method() 
public io.vertx.core.http.HttpMethod method() {
        return (io.vertx.core.http.HttpMethod)delegate.method(); 
}
// java.lang.String uri() 
public java.lang.String uri() {
        return (java.lang.String)delegate.uri(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return (io.vertx.core.MultiMap)delegate.headers(); 
}
// io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) {
        return (io.vertx.core.http.HttpClientRequest)delegate.putHeader(name, value); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) 
public io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) {
        return (io.vertx.core.http.HttpClientRequest)delegate.write(chunk); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) 
public io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) {
        return (io.vertx.core.http.HttpClientRequest)delegate.write(chunk, enc); 
}
// io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.continueHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest sendHead() 
public io.vertx.core.http.HttpClientRequest sendHead() {
        return (io.vertx.core.http.HttpClientRequest)delegate.sendHead(); 
}
// void end(java.lang.String chunk) 
public void end(java.lang.String chunk) {
        delegate.end(chunk); 
}
// void end(java.lang.String chunk, java.lang.String enc) 
public void end(java.lang.String chunk, java.lang.String enc) {
        delegate.end(chunk, enc); 
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
public io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs) {
        return (io.vertx.core.http.HttpClientRequest)delegate.setTimeout(timeoutMs); 
}
}
