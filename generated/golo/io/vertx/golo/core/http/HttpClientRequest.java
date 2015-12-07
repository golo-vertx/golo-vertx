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
public boolean {
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.write(data); 
}
// io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.drainHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.handler(handler); 
}
// io.vertx.core.http.HttpClientRequest pause() 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.pause(); 
}
// io.vertx.core.http.HttpClientRequest resume() 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.resume(); 
}
// io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.setChunked(chunked); 
}
// boolean isChunked() 
public boolean {
        return (boolean)delegate.isChunked(); 
}
// io.vertx.core.http.HttpMethod method() 
public HttpMethod {
        return (io.vertx.core.http.HttpMethod)delegate.method(); 
}
// java.lang.String uri() 
public String {
        return (java.lang.String)delegate.uri(); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap {
        return (io.vertx.core.MultiMap)delegate.headers(); 
}
// io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.putHeader(name, value); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.write(chunk); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.write(chunk, enc); 
}
// io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.continueHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest sendHead() 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.sendHead(); 
}
// void end(java.lang.String chunk) 
public void {
        delegate.end(chunk); 
}
// void end(java.lang.String chunk, java.lang.String enc) 
public void {
        delegate.end(chunk, enc); 
}
// void end(io.vertx.core.buffer.Buffer chunk) 
public void {
        delegate.end(chunk); 
}
// void end() 
public void {
        delegate.end(); 
}
// io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs) 
public HttpClientRequest {
        return (io.vertx.core.http.HttpClientRequest)delegate.setTimeout(timeoutMs); 
}
}
