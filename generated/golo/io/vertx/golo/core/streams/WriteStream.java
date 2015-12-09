package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.Handler;
// Type: io.vertx.core.streams.WriteStream<T> 
public class WriteStream<T> { 

private io.vertx.core.streams.WriteStream delegate; 
public WriteStream(Object delegate) { 
    this.delegate = (io.vertx.core.streams.WriteStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.streams.WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public WriteStream<T> exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.streams.WriteStreamImpl.class); 
}
// io.vertx.core.streams.WriteStream<T> write(T data) 
// TypeParams: [] 
public WriteStream<T> write(T data) {
        //param classes(remove later):   OBJECT  
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.streams.WriteStreamImpl.class); 
}
// io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public WriteStream<T> setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.streams.WriteStreamImpl.class); 
}
// boolean writeQueueFull() 
// TypeParams: [] 
public boolean writeQueueFull() {
        //param classes(remove later):  
    return delegate.writeQueueFull(); 
}
// io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public WriteStream<T> drainHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.streams.WriteStreamImpl.class); 
}
}
