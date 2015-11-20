package io.vertx.golo.core.Http;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.MultiMap;
public class HttpServerResponse { 

private io.vertx.core.http.HttpServerResponse originalInstance; 
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) {
        return originalInstance.write(data); 
}
// io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(handler); 
}
// int getStatusCode() 
public int getStatusCode() {
        return originalInstance.getStatusCode(); 
}
// io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) 
public io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) {
        return originalInstance.setStatusCode(statusCode); 
}
// java.lang.String getStatusMessage() 
public java.lang.String getStatusMessage() {
        return originalInstance.getStatusMessage(); 
}
// io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) 
public io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) {
        return originalInstance.setStatusMessage(statusMessage); 
}
// io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) 
public io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) {
        return originalInstance.setChunked(chunked); 
}
// boolean isChunked() 
public boolean isChunked() {
        return originalInstance.isChunked(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return originalInstance.headers(); 
}
// io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) {
        return originalInstance.putHeader(name, value); 
}
// io.vertx.core.MultiMap trailers() 
public io.vertx.core.MultiMap trailers() {
        return originalInstance.trailers(); 
}
// io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) 
public io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) {
        return originalInstance.putTrailer(name, value); 
}
// io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.closeHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) 
public io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) {
        return originalInstance.write(chunk, enc); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) 
public io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) {
        return originalInstance.write(chunk); 
}
// io.vertx.core.http.HttpServerResponse writeContinue() 
public io.vertx.core.http.HttpServerResponse writeContinue() {
        return originalInstance.writeContinue(); 
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
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename) {
        return originalInstance.sendFile(filename); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) {
        return originalInstance.sendFile(filename, offset); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) {
        return originalInstance.sendFile(filename, offset, length); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return originalInstance.sendFile(filename, resultHandler); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return originalInstance.sendFile(filename, offset, resultHandler); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return originalInstance.sendFile(filename, offset, length, resultHandler); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
// boolean ended() 
public boolean ended() {
        return originalInstance.ended(); 
}
// boolean closed() 
public boolean closed() {
        return originalInstance.closed(); 
}
// boolean headWritten() 
public boolean headWritten() {
        return originalInstance.headWritten(); 
}
// io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.headersEndHandler(handler); 
}
// io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.bodyEndHandler(handler); 
}
}