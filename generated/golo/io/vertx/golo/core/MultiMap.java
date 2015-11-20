package io.vertx.golo.Core;

public class MultiMap { 

private io.vertx.core.MultiMap originalInstance; 
// io.vertx.core.MultiMap caseInsensitiveMultiMap() 
public io.vertx.core.MultiMap caseInsensitiveMultiMap() {
        return originalInstance.caseInsensitiveMultiMap(); 
}
// java.lang.String get(java.lang.String name) 
public java.lang.String get(java.lang.String name) {
        return originalInstance.get(name); 
}
// java.util.List<java.lang.String> getAll(java.lang.String name) 
public java.util.List<java.lang.String> getAll(java.lang.String name) {
        return originalInstance.getAll(name); 
}
// boolean contains(java.lang.String name) 
public boolean contains(java.lang.String name) {
        return originalInstance.contains(name); 
}
// boolean isEmpty() 
public boolean isEmpty() {
        return originalInstance.isEmpty(); 
}
// java.util.Set<java.lang.String> names() 
public java.util.Set<java.lang.String> names() {
        return originalInstance.names(); 
}
// io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) 
public io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) {
        return originalInstance.add(name, value); 
}
// io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) 
public io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) {
        return originalInstance.addAll(map); 
}
// io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) 
public io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) {
        return originalInstance.set(name, value); 
}
// io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) 
public io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) {
        return originalInstance.setAll(map); 
}
// io.vertx.core.MultiMap remove(java.lang.String name) 
public io.vertx.core.MultiMap remove(java.lang.String name) {
        return originalInstance.remove(name); 
}
// io.vertx.core.MultiMap clear() 
public io.vertx.core.MultiMap clear() {
        return originalInstance.clear(); 
}
// int size() 
public int size() {
        return originalInstance.size(); 
}
}