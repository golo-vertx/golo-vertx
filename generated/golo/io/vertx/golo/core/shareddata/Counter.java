package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.shareddata.Counter 
public class Counter { 

private io.vertx.core.shareddata.Counter delegate; 
public Counter(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.Counter)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// void get(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void {
        delegate.get(resultHandler); 
}
// void incrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void {
        delegate.incrementAndGet(resultHandler); 
}
// void getAndIncrement(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void {
        delegate.getAndIncrement(resultHandler); 
}
// void decrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void {
        delegate.decrementAndGet(resultHandler); 
}
// void addAndGet(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void {
        delegate.addAndGet(value, resultHandler); 
}
// void getAndAdd(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void {
        delegate.getAndAdd(value, resultHandler); 
}
// void compareAndSet(long expected, long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
public void {
        delegate.compareAndSet(expected, value, resultHandler); 
}
}
