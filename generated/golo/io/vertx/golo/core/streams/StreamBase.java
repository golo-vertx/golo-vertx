package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.streams.StreamBase 
public class StreamBase { 

private io.vertx.core.streams.StreamBase delegate; 
public StreamBase(Object delegate) { 
    this.delegate = (io.vertx.core.streams.StreamBase)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
}
