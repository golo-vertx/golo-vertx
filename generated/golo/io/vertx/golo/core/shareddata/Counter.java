package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.shareddata.Counter 
public class Counter { 

private io.vertx.core.shareddata.Counter delegate; 
public Counter(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.Counter)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// void get(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void get(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) {
        //param classes(remove later):   HANDLER  
    delegate.get(resultHandler); 
}
// void incrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void incrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) {
        //param classes(remove later):   HANDLER  
    delegate.incrementAndGet(resultHandler); 
}
// void getAndIncrement(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void getAndIncrement(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) {
        //param classes(remove later):   HANDLER  
    delegate.getAndIncrement(resultHandler); 
}
// void decrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void decrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) {
        //param classes(remove later):   HANDLER  
    delegate.decrementAndGet(resultHandler); 
}
// void addAndGet(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void addAndGet(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) {
        //param classes(remove later):   PRIMITIVE   HANDLER  
    delegate.addAndGet(value,resultHandler); 
}
// void getAndAdd(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
public void getAndAdd(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) {
        //param classes(remove later):   PRIMITIVE   HANDLER  
    delegate.getAndAdd(value,resultHandler); 
}
// void compareAndSet(long expected, long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
public void compareAndSet(long expected, long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) {
        //param classes(remove later):   PRIMITIVE   PRIMITIVE   HANDLER  
    delegate.compareAndSet(expected,value,resultHandler); 
}
}
