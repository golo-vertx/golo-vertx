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
public AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile pause() 
public AsyncFile pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile resume() 
public AsyncFile resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data) 
public AsyncFile write(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize) 
public AsyncFile setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.file.AsyncFile.class); 
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
public AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.write(buffer,position,handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) {
        return InternalHelper.safeCreate(this.delegate.read(buffer,offset,position,length,handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile flush() 
public AsyncFile flush() {
        return InternalHelper.safeCreate(this.delegate.flush(), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.flush(handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile setReadPos(long readPos) 
public AsyncFile setReadPos(long readPos) {
        return InternalHelper.safeCreate(this.delegate.setReadPos(readPos), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile setWritePos(long writePos) 
public AsyncFile setWritePos(long writePos) {
        return InternalHelper.safeCreate(this.delegate.setWritePos(writePos), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize) 
public AsyncFile setReadBufferSize(int readBufferSize) {
        return InternalHelper.safeCreate(this.delegate.setReadBufferSize(readBufferSize), io.vertx.golo.core.file.AsyncFile.class); 
}
}
