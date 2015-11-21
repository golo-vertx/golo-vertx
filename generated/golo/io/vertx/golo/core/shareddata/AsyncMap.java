package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;

public class AsyncMap { 

private io.vertx.core.shareddata.AsyncMap<K,V> delegate; 
public AsyncMap(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.AsyncMap<K,V>)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// void get(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
public void get(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) {
        delegate.get(k, resultHandler); 
}
// void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.put(k, v, completionHandler); 
}
// void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.put(k, v, ttl, completionHandler); 
}
// void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
public void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) {
        delegate.putIfAbsent(k, v, completionHandler); 
}
// void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
public void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) {
        delegate.putIfAbsent(k, v, ttl, completionHandler); 
}
// void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
public void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) {
        delegate.remove(k, resultHandler); 
}
// void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
public void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) {
        delegate.removeIfPresent(k, v, resultHandler); 
}
// void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
public void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) {
        delegate.replace(k, v, resultHandler); 
}
// void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
public void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) {
        delegate.replaceIfPresent(k, oldValue, newValue, resultHandler); 
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
