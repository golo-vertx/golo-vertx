package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.file.AsyncFile 
public class AsyncFile { 

private io.vertx.core.file.AsyncFile delegate; 
public AsyncFile(Object delegate) { 
    this.delegate = (io.vertx.core.file.AsyncFile)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
// TypeParams: [] 
public boolean writeQueueFull() {
        //param classes(remove later):  
    return delegate.writeQueueFull(); 
}
// io.vertx.core.file.AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
// TypeParams: [] 
public AsyncFile handler(Handler<Buffer> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile pause() 
// TypeParams: [] 
public AsyncFile pause() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile resume() 
// TypeParams: [] 
public AsyncFile resume() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public AsyncFile endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public AsyncFile write(Buffer data) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public AsyncFile setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public AsyncFile drainHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public AsyncFile exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// void close() 
// TypeParams: [] 
public void close() {
        //param classes(remove later):  
    delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public void close(Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   HANDLER  
    delegate.close(handler); 
}
// io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public AsyncFile write(Buffer buffer,long position,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   API   PRIMITIVE   HANDLER  
    return InternalHelper.safeCreate(this.delegate.write(buffer,position,handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
// TypeParams: [] 
public AsyncFile read(Buffer buffer,int offset,long position,int length,Handler<AsyncResult<Buffer>> handler) {
        //param classes(remove later):   API   PRIMITIVE   PRIMITIVE   PRIMITIVE   HANDLER  
    return InternalHelper.safeCreate(this.delegate.read(buffer,offset,position,length,handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile flush() 
// TypeParams: [] 
public AsyncFile flush() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.flush(), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public AsyncFile flush(Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.flush(handler), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile setReadPos(long readPos) 
// TypeParams: [] 
public AsyncFile setReadPos(long readPos) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setReadPos(readPos), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile setWritePos(long writePos) 
// TypeParams: [] 
public AsyncFile setWritePos(long writePos) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setWritePos(writePos), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize) 
// TypeParams: [] 
public AsyncFile setReadBufferSize(int readBufferSize) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setReadBufferSize(readBufferSize), io.vertx.golo.core.file.AsyncFile.class); 
}
}
