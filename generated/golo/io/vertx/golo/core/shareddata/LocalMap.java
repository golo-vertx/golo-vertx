package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.shareddata.LocalMap<K,V> 
public class LocalMap<K,V> { 

private io.vertx.core.shareddata.LocalMap delegate; 
public LocalMap(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.LocalMap)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// V get(K key) 
// TypeParams: [] 
public V get(K key) {
        //param classes(remove later):   OBJECT  
    return delegate.get(key); 
}
// V put(K key, V value) 
// TypeParams: [] 
public V put(K key,V value) {
        //param classes(remove later):   OBJECT   OBJECT  
    return delegate.put(key,value); 
}
// V remove(K key) 
// TypeParams: [] 
public V remove(K key) {
        //param classes(remove later):   OBJECT  
    return delegate.remove(key); 
}
// void clear() 
// TypeParams: [] 
public void clear() {
        //param classes(remove later):  
    delegate.clear(); 
}
// int size() 
// TypeParams: [] 
public int size() {
        //param classes(remove later):  
    return delegate.size(); 
}
// boolean isEmpty() 
// TypeParams: [] 
public boolean isEmpty() {
        //param classes(remove later):  
    return delegate.isEmpty(); 
}
// V putIfAbsent(K key, V value) 
// TypeParams: [] 
public V putIfAbsent(K key,V value) {
        //param classes(remove later):   OBJECT   OBJECT  
    return delegate.putIfAbsent(key,value); 
}
// boolean removeIfPresent(K key, V value) 
// TypeParams: [] 
public boolean removeIfPresent(K key,V value) {
        //param classes(remove later):   OBJECT   OBJECT  
    return delegate.removeIfPresent(key,value); 
}
// boolean replaceIfPresent(K key, V oldValue, V newValue) 
// TypeParams: [] 
public boolean replaceIfPresent(K key,V oldValue,V newValue) {
        //param classes(remove later):   OBJECT   OBJECT   OBJECT  
    return delegate.replaceIfPresent(key,oldValue,newValue); 
}
// V replace(K key, V value) 
// TypeParams: [] 
public V replace(K key,V value) {
        //param classes(remove later):   OBJECT   OBJECT  
    return delegate.replace(key,value); 
}
// void close() 
// TypeParams: [] 
public void close() {
        //param classes(remove later):  
    delegate.close(); 
}
}
