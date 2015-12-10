package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.shareddata.Counter 
public class Counter {
        private io.vertx.core.shareddata.Counter delegate; 
    public Counter(Object delegate) {
            this.delegate = (io.vertx.core.shareddata.Counter) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // void get(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
    // TypeParams: [] 
        public void get(Handler<AsyncResult<Long>> resultHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        this.delegate.get(resultHandler); 
    }
        // void incrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
    // TypeParams: [] 
        public void incrementAndGet(Handler<AsyncResult<Long>> resultHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        this.delegate.incrementAndGet(resultHandler); 
    }
        // void getAndIncrement(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
    // TypeParams: [] 
        public void getAndIncrement(Handler<AsyncResult<Long>> resultHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        this.delegate.getAndIncrement(resultHandler); 
    }
        // void decrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
    // TypeParams: [] 
        public void decrementAndGet(Handler<AsyncResult<Long>> resultHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        this.delegate.decrementAndGet(resultHandler); 
    }
        // void addAndGet(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
    // TypeParams: [] 
        public void addAndGet(long value,Handler<AsyncResult<Long>> resultHandler) {
                //param classes(remove later):   PRIMITIVE   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        this.delegate.addAndGet(value,resultHandler); 
    }
        // void getAndAdd(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
    // TypeParams: [] 
        public void getAndAdd(long value,Handler<AsyncResult<Long>> resultHandler) {
                //param classes(remove later):   PRIMITIVE   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        this.delegate.getAndAdd(value,resultHandler); 
    }
        // void compareAndSet(long expected, long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
    // TypeParams: [] 
        public void compareAndSet(long expected,long value,Handler<AsyncResult<Boolean>> resultHandler) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        this.delegate.compareAndSet(expected,value,resultHandler); 
    }
        }
