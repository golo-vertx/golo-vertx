package io.vertx.golo.core.Shareddata;

public class LocalMap { 

private io.vertx.core.shareddata.LocalMap<K,V> originalInstance;// V get(K key) 
public V get(K key) {
        return originalInstance.get(); 
}
// V put(K key, V value) 
public V put(K key, V value) {
        return originalInstance.put(); 
}
// V remove(K key) 
public V remove(K key) {
        return originalInstance.remove(); 
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
        return originalInstance.putIfAbsent(); 
}
// boolean removeIfPresent(K key, V value) 
public boolean removeIfPresent(K key, V value) {
        return originalInstance.removeIfPresent(); 
}
// boolean replaceIfPresent(K key, V oldValue, V newValue) 
public boolean replaceIfPresent(K key, V oldValue, V newValue) {
        return originalInstance.replaceIfPresent(); 
}
// V replace(K key, V value) 
public V replace(K key, V value) {
        return originalInstance.replace(); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
}
