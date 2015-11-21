package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.MultiMap;
public class HttpServerResponse { 

private io.vertx.core.http.HttpServerResponse delegate; 
public HttpServerResponse(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpServerResponse)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return delegate.writeQueueFull(); 
}
// io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) {
        return delegate.write(data); 
}
// io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) {
        return delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.drainHandler(handler); 
}
// int getStatusCode() 
public int getStatusCode() {
        return delegate.getStatusCode(); 
}
// io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) 
public io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) {
        return delegate.setStatusCode(statusCode); 
}
// java.lang.String getStatusMessage() 
public java.lang.String getStatusMessage() {
        return delegate.getStatusMessage(); 
}
// io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) 
public io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) {
        return delegate.setStatusMessage(statusMessage); 
}
// io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) 
public io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) {
        return delegate.setChunked(chunked); 
}
// boolean isChunked() 
public boolean isChunked() {
        return delegate.isChunked(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return delegate.headers(); 
}
// io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) {
        return delegate.putHeader(name, value); 
}
// io.vertx.core.MultiMap trailers() 
public io.vertx.core.MultiMap trailers() {
        return delegate.trailers(); 
}
// io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) {
        return delegate.putTrailer(name, value); 
}
// io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.closeHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) 
public io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) {
        return delegate.write(chunk, enc); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) 
public io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) {
        return delegate.write(chunk); 
}
// io.vertx.core.http.HttpServerResponse writeContinue() 
public io.vertx.core.http.HttpServerResponse writeContinue() {
        return delegate.writeContinue(); 
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
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename) {
        return delegate.sendFile(filename); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) {
        return delegate.sendFile(filename, offset); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) {
        return delegate.sendFile(filename, offset, length); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return delegate.sendFile(filename, resultHandler); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return delegate.sendFile(filename, offset, resultHandler); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return delegate.sendFile(filename, offset, length, resultHandler); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// boolean ended() 
public boolean ended() {
        return delegate.ended(); 
}
// boolean closed() 
public boolean closed() {
        return delegate.closed(); 
}
// boolean headWritten() 
public boolean headWritten() {
        return delegate.headWritten(); 
}
// io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.headersEndHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.bodyEndHandler(handler); 
}
}
