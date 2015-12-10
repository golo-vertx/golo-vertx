package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.Future<T> 
public class Future<T> {
        private io.vertx.core.Future delegate; 
    public Future(Object delegate) {
            this.delegate = (io.vertx.core.Future) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future() 
    // TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]] 
        public static <T> io.vertx.core.Future<T> future() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(io.vertx.core.Future.future(), io.vertx.golo.core.Future.class); 
    }
        // <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() 
    // TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]] 
        public static <T> io.vertx.core.Future<T> succeededFuture() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(), io.vertx.golo.core.Future.class); 
    }
        // <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) 
    // TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]] 
        public static <T> io.vertx.core.Future<T> succeededFuture(T result) {
                //param classes(remove later):   OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(result), io.vertx.golo.core.Future.class); 
    }
        // <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) 
    // TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]] 
        public static <T> io.vertx.core.Future<T> failedFuture(String failureMessage) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(io.vertx.core.Future.failedFuture(failureMessage), io.vertx.golo.core.Future.class); 
    }
        // boolean isComplete() 
    // TypeParams: [] 
        public boolean isComplete() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isComplete(); 
    }
        // void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) 
    // TypeParams: [] 
        public void setHandler(Handler<AsyncResult<T>> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        this.delegate.setHandler(new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
handler.handle((AsyncResult<T>)f);
         }
       }
); 
    }
        // void complete(T result) 
    // TypeParams: [] 
        public void complete(T result) {
                //param classes(remove later):   OBJECT  
        //evenTypes (remove later):    
        this.delegate.complete(result); 
    }
        // void complete() 
    // TypeParams: [] 
        public void complete() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        this.delegate.complete(); 
    }
        // void fail(java.lang.String failureMessage) 
    // TypeParams: [] 
        public void fail(String failureMessage) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        this.delegate.fail(failureMessage); 
    }
        }
