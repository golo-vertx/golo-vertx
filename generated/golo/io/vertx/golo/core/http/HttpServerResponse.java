package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.MultiMap;
// io.vertx.core.http.HttpServerResponse 
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
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.http.HttpServerResponse)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.http.HttpServerResponse)delegate.write(data); 
}
// io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.http.HttpServerResponse)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.HttpServerResponse)delegate.drainHandler(handler); 
}
// int getStatusCode() 
public int getStatusCode() {
        return (int)delegate.getStatusCode(); 
}
// io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) 
public io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) {
        return (io.vertx.core.http.HttpServerResponse)delegate.setStatusCode(statusCode); 
}
// java.lang.String getStatusMessage() 
public java.lang.String getStatusMessage() {
        return (java.lang.String)delegate.getStatusMessage(); 
}
// io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) 
public io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) {
        return (io.vertx.core.http.HttpServerResponse)delegate.setStatusMessage(statusMessage); 
}
// io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) 
public io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) {
        return (io.vertx.core.http.HttpServerResponse)delegate.setChunked(chunked); 
}
// boolean isChunked() 
public boolean isChunked() {
        return (boolean)delegate.isChunked(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return (io.vertx.core.MultiMap)delegate.headers(); 
}
// io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) {
        return (io.vertx.core.http.HttpServerResponse)delegate.putHeader(name, value); 
}
// io.vertx.core.MultiMap trailers() 
public io.vertx.core.MultiMap trailers() {
        return (io.vertx.core.MultiMap)delegate.trailers(); 
}
// io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) {
        return (io.vertx.core.http.HttpServerResponse)delegate.putTrailer(name, value); 
}
// io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.HttpServerResponse)delegate.closeHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) 
public io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) {
        return (io.vertx.core.http.HttpServerResponse)delegate.write(chunk, enc); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) 
public io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) {
        return (io.vertx.core.http.HttpServerResponse)delegate.write(chunk); 
}
// io.vertx.core.http.HttpServerResponse writeContinue() 
public io.vertx.core.http.HttpServerResponse writeContinue() {
        return (io.vertx.core.http.HttpServerResponse)delegate.writeContinue(); 
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
        return (io.vertx.core.http.HttpServerResponse)delegate.sendFile(filename); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) {
        return (io.vertx.core.http.HttpServerResponse)delegate.sendFile(filename, offset); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) {
        return (io.vertx.core.http.HttpServerResponse)delegate.sendFile(filename, offset, length); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return (io.vertx.core.http.HttpServerResponse)delegate.sendFile(filename, resultHandler); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return (io.vertx.core.http.HttpServerResponse)delegate.sendFile(filename, offset, resultHandler); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return (io.vertx.core.http.HttpServerResponse)delegate.sendFile(filename, offset, length, resultHandler); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// boolean ended() 
public boolean ended() {
        return (boolean)delegate.ended(); 
}
// boolean closed() 
public boolean closed() {
        return (boolean)delegate.closed(); 
}
// boolean headWritten() 
public boolean headWritten() {
        return (boolean)delegate.headWritten(); 
}
// io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.HttpServerResponse)delegate.headersEndHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.HttpServerResponse)delegate.bodyEndHandler(handler); 
}
}
