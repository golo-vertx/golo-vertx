package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
// io.vertx.core.file.AsyncFile 
public class AsyncFile { 

private io.vertx.core.file.AsyncFile delegate; 
public AsyncFile(Object delegate) { 
    this.delegate = (io.vertx.core.file.AsyncFile)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return delegate.writeQueueFull(); 
}
// io.vertx.core.file.AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.file.AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.file.AsyncFile pause() 
public io.vertx.core.file.AsyncFile pause() {
        return delegate.pause(); 
}
// io.vertx.core.file.AsyncFile resume() 
public io.vertx.core.file.AsyncFile resume() {
        return delegate.resume(); 
}
// io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data) {
        return delegate.write(data); 
}
// io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize) {
        return delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.drainHandler(handler); 
}
// io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        delegate.close(handler); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.write(buffer, position, handler); 
}
// io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) {
        return delegate.read(buffer, offset, position, length, handler); 
}
// io.vertx.core.file.AsyncFile flush() 
public io.vertx.core.file.AsyncFile flush() {
        return delegate.flush(); 
}
// io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.flush(handler); 
}
// io.vertx.core.file.AsyncFile setReadPos(long readPos) 
public io.vertx.core.file.AsyncFile setReadPos(long readPos) {
        return delegate.setReadPos(readPos); 
}
// io.vertx.core.file.AsyncFile setWritePos(long writePos) 
public io.vertx.core.file.AsyncFile setWritePos(long writePos) {
        return delegate.setWritePos(writePos); 
}
// io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize) 
public io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize) {
        return delegate.setReadBufferSize(readBufferSize); 
}
}
