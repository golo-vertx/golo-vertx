package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.shareddata.LocalMap<K,V> 
public class LocalMap<K,V> { 

private io.vertx.core.shareddata.LocalMap delegate; 
public LocalMap(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.LocalMap)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// V get(K key) 
public V get(K key) {
        return (V)delegate.get(key); 
}
// V put(K key, V value) 
public V put(K key, V value) {
        return (V)delegate.put(key, value); 
}
// V remove(K key) 
public V remove(K key) {
        return (V)delegate.remove(key); 
}
// void clear() 
public void clear() {
        delegate.clear(); 
}
// int size() 
public int size() {
        return (int)delegate.size(); 
}
// boolean isEmpty() 
public boolean isEmpty() {
        return (boolean)delegate.isEmpty(); 
}
// V putIfAbsent(K key, V value) 
public V putIfAbsent(K key, V value) {
        return (V)delegate.putIfAbsent(key, value); 
}
// boolean removeIfPresent(K key, V value) 
public boolean removeIfPresent(K key, V value) {
        return (boolean)delegate.removeIfPresent(key, value); 
}
// boolean replaceIfPresent(K key, V oldValue, V newValue) 
public boolean replaceIfPresent(K key, V oldValue, V newValue) {
        return (boolean)delegate.replaceIfPresent(key, oldValue, newValue); 
}
// V replace(K key, V value) 
public V replace(K key, V value) {
        return (V)delegate.replace(key, value); 
}
// void close() 
public void close() {
        delegate.close(); 
}
}
