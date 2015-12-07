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
public void {
        delegate.get(k, resultHandler); 
}
// void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void {
        delegate.put(k, v, completionHandler); 
}
// void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void {
        delegate.put(k, v, ttl, completionHandler); 
}
// void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
public void {
        delegate.putIfAbsent(k, v, completionHandler); 
}
// void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
public void {
        delegate.putIfAbsent(k, v, ttl, completionHandler); 
}
// void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
public void {
        delegate.remove(k, resultHandler); 
}
// void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
public void {
        delegate.removeIfPresent(k, v, resultHandler); 
}
// void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
public void {
        delegate.replace(k, v, resultHandler); 
}
// void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
public void {
        delegate.replaceIfPresent(k, oldValue, newValue, resultHandler); 
}
// void clear(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public void {
        delegate.clear(resultHandler); 
}
// void size(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> resultHandler) 
public void {
        delegate.size(resultHandler); 
}
}
