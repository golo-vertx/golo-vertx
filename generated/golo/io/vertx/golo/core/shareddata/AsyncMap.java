package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.shareddata.AsyncMap<K,V> 
public class AsyncMap<K,V> { 

private io.vertx.core.shareddata.AsyncMap delegate; 
public AsyncMap(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.AsyncMap)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// void get(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
public void get(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) {
        delegate.get(k,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle(f);
         }
       }); 
}
// void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.put(k,v,completionHandler); 
}
// void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.put(k,v,ttl,completionHandler); 
}
// void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
public void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) {
        delegate.putIfAbsent(k,v,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
completionHandler.handle(f);
         }
       }); 
}
// void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
public void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) {
        delegate.putIfAbsent(k,v,ttl,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
completionHandler.handle(f);
         }
       }); 
}
// void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
public void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) {
        delegate.remove(k,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle(f);
         }
       }); 
}
// void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
public void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) {
        delegate.removeIfPresent(k,v,resultHandler); 
}
// void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
public void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) {
        delegate.replace(k,v,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle(f);
         }
       }); 
}
// void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
public void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) {
        delegate.replaceIfPresent(k,oldValue,newValue,resultHandler); 
}
// void clear(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public void clear(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        delegate.clear(resultHandler); 
}
// void size(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> resultHandler) 
public void size(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> resultHandler) {
        delegate.size(resultHandler); 
}
}
