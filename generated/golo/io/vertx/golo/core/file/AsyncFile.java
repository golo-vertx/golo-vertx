package io.vertx.golo.core.File;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
public class AsyncFile { 

private io.vertx.core.file.AsyncFile originalInstance; 
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// io.vertx.core.file.AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.file.AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return originalInstance.handler(handler); 
}
// io.vertx.core.file.AsyncFile pause() 
public io.vertx.core.file.AsyncFile pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.file.AsyncFile resume() 
public io.vertx.core.file.AsyncFile resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(endHandler); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data) {
        return originalInstance.write(data); 
}
// io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(handler); 
}
// io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(handler); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.close(handler); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.write(buffer, position, handler); 
}
// io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) {
        return originalInstance.read(buffer, offset, position, length, handler); 
}
// io.vertx.core.file.AsyncFile flush() 
public io.vertx.core.file.AsyncFile flush() {
        return originalInstance.flush(); 
}
// io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.flush(handler); 
}
// io.vertx.core.file.AsyncFile setReadPos(long readPos) 
public io.vertx.core.file.AsyncFile setReadPos(long readPos) {
        return originalInstance.setReadPos(readPos); 
}
// io.vertx.core.file.AsyncFile setWritePos(long writePos) 
public io.vertx.core.file.AsyncFile setWritePos(long writePos) {
        return originalInstance.setWritePos(writePos); 
}
// io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize) 
public io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize) {
        return originalInstance.setReadBufferSize(readBufferSize); 
}
}
