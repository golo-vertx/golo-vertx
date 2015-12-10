package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.shareddata.AsyncMap<K,V> 
public class AsyncMap<K,V> {
        private io.vertx.core.shareddata.AsyncMap delegate; 
    public AsyncMap(Object delegate) {
            this.delegate = (io.vertx.core.shareddata.AsyncMap) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // void get(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
    // TypeParams: [] 
        public void get(K k,Handler<AsyncResult<V>> resultHandler) {
                //param classes(remove later):   OBJECT   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        this.delegate.get(k,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle((AsyncResult<V>)f);
         }
       }
); 
    }
        // void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
    // TypeParams: [] 
        public void put(K k,V v,Handler<AsyncResult<Void>> completionHandler) {
                //param classes(remove later):   OBJECT   OBJECT   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        this.delegate.put(k,v,completionHandler); 
    }
        // void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
    // TypeParams: [] 
        public void put(K k,V v,long ttl,Handler<AsyncResult<Void>> completionHandler) {
                //param classes(remove later):   OBJECT   OBJECT   PRIMITIVE   HANDLER  
        //evenTypes (remove later):          ASYNC_RESULT   
        this.delegate.put(k,v,ttl,completionHandler); 
    }
        // void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
    // TypeParams: [] 
        public void putIfAbsent(K k,V v,Handler<AsyncResult<V>> completionHandler) {
                //param classes(remove later):   OBJECT   OBJECT   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        this.delegate.putIfAbsent(k,v,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
completionHandler.handle((AsyncResult<V>)f);
         }
       }
); 
    }
        // void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
    // TypeParams: [] 
        public void putIfAbsent(K k,V v,long ttl,Handler<AsyncResult<V>> completionHandler) {
                //param classes(remove later):   OBJECT   OBJECT   PRIMITIVE   HANDLER  
        //evenTypes (remove later):          ASYNC_RESULT   
        this.delegate.putIfAbsent(k,v,ttl,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
completionHandler.handle((AsyncResult<V>)f);
         }
       }
); 
    }
        // void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
    // TypeParams: [] 
        public void remove(K k,Handler<AsyncResult<V>> resultHandler) {
                //param classes(remove later):   OBJECT   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        this.delegate.remove(k,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle((AsyncResult<V>)f);
         }
       }
); 
    }
        // void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
    // TypeParams: [] 
        public void removeIfPresent(K k,V v,Handler<AsyncResult<Boolean>> resultHandler) {
                //param classes(remove later):   OBJECT   OBJECT   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        this.delegate.removeIfPresent(k,v,resultHandler); 
    }
        // void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
    // TypeParams: [] 
        public void replace(K k,V v,Handler<AsyncResult<V>> resultHandler) {
                //param classes(remove later):   OBJECT   OBJECT   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        this.delegate.replace(k,v,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle((AsyncResult<V>)f);
         }
       }
); 
    }
        // void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
    // TypeParams: [] 
        public void replaceIfPresent(K k,V oldValue,V newValue,Handler<AsyncResult<Boolean>> resultHandler) {
                //param classes(remove later):   OBJECT   OBJECT   OBJECT   HANDLER  
        //evenTypes (remove later):          ASYNC_RESULT   
        this.delegate.replaceIfPresent(k,oldValue,newValue,resultHandler); 
    }
        // void clear(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
    // TypeParams: [] 
        public void clear(Handler<AsyncResult<Void>> resultHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        this.delegate.clear(resultHandler); 
    }
        // void size(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> resultHandler) 
    // TypeParams: [] 
        public void size(Handler<AsyncResult<Integer>> resultHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        this.delegate.size(resultHandler); 
    }
        }
