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
public boolean {
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.file.AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.handler(handler); 
}
// io.vertx.core.file.AsyncFile pause() 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.pause(); 
}
// io.vertx.core.file.AsyncFile resume() 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.resume(); 
}
// io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.endHandler(endHandler); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.write(data); 
}
// io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.drainHandler(handler); 
}
// io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.exceptionHandler(handler); 
}
// void close() 
public void {
        delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public void {
        delegate.close(handler); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.write(buffer, position, handler); 
}
// io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.read(buffer, offset, position, length, handler); 
}
// io.vertx.core.file.AsyncFile flush() 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.flush(); 
}
// io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.flush(handler); 
}
// io.vertx.core.file.AsyncFile setReadPos(long readPos) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.setReadPos(readPos); 
}
// io.vertx.core.file.AsyncFile setWritePos(long writePos) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.setWritePos(writePos); 
}
// io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize) 
public AsyncFile {
        return (io.vertx.core.file.AsyncFile)delegate.setReadBufferSize(readBufferSize); 
}
}
