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
        return delegate.writeQueueFull(); 
}
// io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) 
public HttpServerResponse write(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) 
public HttpServerResponse setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// int getStatusCode() 
public int getStatusCode() {
        return delegate.getStatusCode(); 
}
// io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) 
public HttpServerResponse setStatusCode(int statusCode) {
        return InternalHelper.safeCreate(this.delegate.setStatusCode(statusCode), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// java.lang.String getStatusMessage() 
public String getStatusMessage() {
        return delegate.getStatusMessage(); 
}
// io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) 
public HttpServerResponse setStatusMessage(java.lang.String statusMessage) {
        return InternalHelper.safeCreate(this.delegate.setStatusMessage(statusMessage), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) 
public HttpServerResponse setChunked(boolean chunked) {
        return InternalHelper.safeCreate(this.delegate.setChunked(chunked), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// boolean isChunked() 
public boolean isChunked() {
        return delegate.isChunked(); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap headers() {
        return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) 
public HttpServerResponse putHeader(java.lang.String name, java.lang.String value) {
        return InternalHelper.safeCreate(this.delegate.putHeader(name,value), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.MultiMap trailers() 
public MultiMap trailers() {
        return InternalHelper.safeCreate(this.delegate.trailers(), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) 
public HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) {
        return InternalHelper.safeCreate(this.delegate.putTrailer(name,value), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) 
public HttpServerResponse write(java.lang.String chunk, java.lang.String enc) {
        return InternalHelper.safeCreate(this.delegate.write(chunk,enc), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) 
public HttpServerResponse write(java.lang.String chunk) {
        return InternalHelper.safeCreate(this.delegate.write(chunk), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse writeContinue() 
public HttpServerResponse writeContinue() {
        return InternalHelper.safeCreate(this.delegate.writeContinue(), io.vertx.golo.core.http.HttpServerResponse.class); 
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
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename) 
public HttpServerResponse sendFile(java.lang.String filename) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) 
public HttpServerResponse sendFile(java.lang.String filename, long offset) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) 
public HttpServerResponse sendFile(java.lang.String filename, long offset, long length) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,resultHandler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,resultHandler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length,resultHandler), io.vertx.golo.core.http.HttpServerResponse.class); 
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
public HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.headersEndHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.bodyEndHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
}
