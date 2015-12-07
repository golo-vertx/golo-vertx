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
public V {
        return (V)delegate.get(key); 
}
// V put(K key, V value) 
public V {
        return (V)delegate.put(key, value); 
}
// V remove(K key) 
public V {
        return (V)delegate.remove(key); 
}
// void clear() 
public void {
        delegate.clear(); 
}
// int size() 
public int {
        return (int)delegate.size(); 
}
// boolean isEmpty() 
public boolean {
        return (boolean)delegate.isEmpty(); 
}
// V putIfAbsent(K key, V value) 
public V {
        return (V)delegate.putIfAbsent(key, value); 
}
// boolean removeIfPresent(K key, V value) 
public boolean {
        return (boolean)delegate.removeIfPresent(key, value); 
}
// boolean replaceIfPresent(K key, V oldValue, V newValue) 
public boolean {
        return (boolean)delegate.replaceIfPresent(key, oldValue, newValue); 
}
// V replace(K key, V value) 
public V {
        return (V)delegate.replace(key, value); 
}
// void close() 
public void {
        delegate.close(); 
}
}
