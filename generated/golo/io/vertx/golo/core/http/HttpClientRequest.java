package io.vertx.golo.core.Http;

import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.MultiMap;
public class HttpClientRequest { 

private io.vertx.core.http.HttpClientRequest originalInstance; 
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) {
        return originalInstance.write(data); 
}
// io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) 
public io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) {
        return originalInstance.handler(handler); 
}
// io.vertx.core.http.HttpClientRequest pause() 
public io.vertx.core.http.HttpClientRequest pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.HttpClientRequest resume() 
public io.vertx.core.http.HttpClientRequest resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(endHandler); 
}
// io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) 
public io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) {
        return originalInstance.setChunked(chunked); 
}
// boolean isChunked() 
public boolean isChunked() {
        return originalInstance.isChunked(); 
}
// io.vertx.core.http.HttpMethod method() 
public io.vertx.core.http.HttpMethod method() {
        return originalInstance.method(); 
}
// java.lang.String uri() 
public java.lang.String uri() {
        return originalInstance.uri(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return originalInstance.headers(); 
}
// io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) {
        return originalInstance.putHeader(name, value); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) 
public io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) {
        return originalInstance.write(chunk); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) 
public io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) {
        return originalInstance.write(chunk, enc); 
}
// io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.continueHandler(handler); 
}
// io.vertx.core.http.HttpClientRequest sendHead() 
public io.vertx.core.http.HttpClientRequest sendHead() {
        return originalInstance.sendHead(); 
}
// void end(java.lang.String chunk) 
public void end(java.lang.String chunk) {
        return originalInstance.end(chunk); 
}
// void end(java.lang.String chunk, java.lang.String enc) 
public void end(java.lang.String chunk, java.lang.String enc) {
        return originalInstance.end(chunk, enc); 
}
// void end(io.vertx.core.buffer.Buffer chunk) 
public void end(io.vertx.core.buffer.Buffer chunk) {
        return originalInstance.end(chunk); 
}
// void end() 
public void end() {
        return originalInstance.end(); 
}
// io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs) 
public io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs) {
        return originalInstance.setTimeout(timeoutMs); 
}
}
