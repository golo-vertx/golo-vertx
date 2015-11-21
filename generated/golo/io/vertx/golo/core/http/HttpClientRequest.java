package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.MultiMap;
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
public io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) {
        return delegate.write(data); 
}
// io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) {
        return delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.drainHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) 
public io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.http.HttpClientRequest pause() 
public io.vertx.core.http.HttpClientRequest pause() {
        return delegate.pause(); 
}
// io.vertx.core.http.HttpClientRequest resume() 
public io.vertx.core.http.HttpClientRequest resume() {
        return delegate.resume(); 
}
// io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) 
public io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) {
        return delegate.setChunked(chunked); 
}
// boolean isChunked() 
public boolean isChunked() {
        return delegate.isChunked(); 
}
// io.vertx.core.http.HttpMethod method() 
public io.vertx.core.http.HttpMethod method() {
        return delegate.method(); 
}
// java.lang.String uri() 
public java.lang.String uri() {
        return delegate.uri(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return delegate.headers(); 
}
// io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) {
        return delegate.putHeader(name, value); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) 
public io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) {
        return delegate.write(chunk); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) 
public io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) {
        return delegate.write(chunk, enc); 
}
// io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.continueHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest sendHead() 
public io.vertx.core.http.HttpClientRequest sendHead() {
        return delegate.sendHead(); 
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
        return delegate.setTimeout(timeoutMs); 
}
}
