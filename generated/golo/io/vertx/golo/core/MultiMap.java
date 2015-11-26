package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.MultiMap 
public class MultiMap { 

private io.vertx.core.MultiMap delegate; 
public MultiMap(Object delegate) { 
    this.delegate = (io.vertx.core.MultiMap)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.MultiMap caseInsensitiveMultiMap() 
public static io.vertx.core.MultiMap caseInsensitiveMultiMap() {
        return (io.vertx.core.MultiMap)InternalHelper.safeCreate(io.vertx.core.MultiMap.caseInsensitiveMultiMap(), io.vertx.golo.core.MultiMap.class); 
}
// java.lang.String get(java.lang.String name) 
public java.lang.String get(java.lang.String name) {
        return (java.lang.String)delegate.get(name); 
}
// java.util.List<java.lang.String> getAll(java.lang.String name) 
public java.util.List<java.lang.String> getAll(java.lang.String name) {
        return (java.util.List<java.lang.String>)delegate.getAll(name); 
}
// boolean contains(java.lang.String name) 
public boolean contains(java.lang.String name) {
        return (boolean)delegate.contains(name); 
}
// boolean isEmpty() 
public boolean isEmpty() {
        return (boolean)delegate.isEmpty(); 
}
// java.util.Set<java.lang.String> names() 
public java.util.Set<java.lang.String> names() {
        return (java.util.Set<java.lang.String>)delegate.names(); 
}
// io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) 
public io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) {
        return (io.vertx.core.MultiMap)delegate.add(name, value); 
}
// io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) 
public io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) {
        return (io.vertx.core.MultiMap)delegate.addAll(map); 
}
// io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) 
public io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) {
        return (io.vertx.core.MultiMap)delegate.set(name, value); 
}
// io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) 
public io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) {
        return (io.vertx.core.MultiMap)delegate.setAll(map); 
}
// io.vertx.core.MultiMap remove(java.lang.String name) 
public io.vertx.core.MultiMap remove(java.lang.String name) {
        return (io.vertx.core.MultiMap)delegate.remove(name); 
}
// io.vertx.core.MultiMap clear() 
public io.vertx.core.MultiMap clear() {
        return (io.vertx.core.MultiMap)delegate.clear(); 
}
// int size() 
public int size() {
        return (int)delegate.size(); 
}
}
