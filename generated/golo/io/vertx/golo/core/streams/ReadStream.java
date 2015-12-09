package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.Handler;
// Type: io.vertx.core.streams.ReadStream<T> 
public class ReadStream<T> { 

private io.vertx.core.streams.ReadStream delegate; 
public ReadStream(Object delegate) { 
    this.delegate = (io.vertx.core.streams.ReadStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.streams.ReadStreamImpl.class); 
}
// io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler) 
public ReadStream<T> handler(io.vertx.core.Handler<T> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.handler(handler), io.vertx.golo.core.streams.ReadStreamImpl.class); 
}
// io.vertx.core.streams.ReadStream<T> pause() 
public ReadStream<T> pause() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.streams.ReadStreamImpl.class); 
}
// io.vertx.core.streams.ReadStream<T> resume() 
public ReadStream<T> resume() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.streams.ReadStreamImpl.class); 
}
// io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.streams.ReadStreamImpl.class); 
}
}
