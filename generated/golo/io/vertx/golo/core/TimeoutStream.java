package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.ReadStream;
// io.vertx.core.TimeoutStream 
public class TimeoutStream { 

private io.vertx.core.TimeoutStream delegate; 
public TimeoutStream(Object delegate) { 
    this.delegate = (io.vertx.core.TimeoutStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public TimeoutStream {
        return (io.vertx.core.TimeoutStream)delegate.exceptionHandler(handler); 
}
// io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) 
public TimeoutStream {
        return (io.vertx.core.TimeoutStream)delegate.handler(handler); 
}
// io.vertx.core.TimeoutStream pause() 
public TimeoutStream {
        return (io.vertx.core.TimeoutStream)delegate.pause(); 
}
// io.vertx.core.TimeoutStream resume() 
public TimeoutStream {
        return (io.vertx.core.TimeoutStream)delegate.resume(); 
}
// io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public TimeoutStream {
        return (io.vertx.core.TimeoutStream)delegate.endHandler(endHandler); 
}
// void cancel() 
public void {
        delegate.cancel(); 
}
}
