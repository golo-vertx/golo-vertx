package io.vertx.golo.core.Shareddata;

public class LocalMap { 

private io.vertx.core.shareddata.LocalMap<K,V> originalInstance; 
// V get(K key) 
public V get(K key) {
        return originalInstance.get(key); 
}
// V put(K key, V value) 
public V put(K key, V value) {
        return originalInstance.put(key, value); 
}
// V remove(K key) 
public V remove(K key) {
        return originalInstance.remove(key); 
}
// void clear() 
public void clear() {
        return originalInstance.clear(); 
}
// int size() 
public int size() {
        return originalInstance.size(); 
}
// boolean isEmpty() 
public boolean isEmpty() {
        return originalInstance.isEmpty(); 
}
// V putIfAbsent(K key, V value) 
public V putIfAbsent(K key, V value) {
        return originalInstance.putIfAbsent(key, value); 
}
// boolean removeIfPresent(K key, V value) 
public boolean removeIfPresent(K key, V value) {
        return originalInstance.removeIfPresent(key, value); 
}
// boolean replaceIfPresent(K key, V oldValue, V newValue) 
public boolean replaceIfPresent(K key, V oldValue, V newValue) {
        return originalInstance.replaceIfPresent(key, oldValue, newValue); 
}
// V replace(K key, V value) 
public V replace(K key, V value) {
        return originalInstance.replace(key, value); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
}
