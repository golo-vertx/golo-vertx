package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

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
        return delegate.get(name); 
}
// java.util.List<java.lang.String> getAll(java.lang.String name) 
public java.util.List<java.lang.String> getAll(java.lang.String name) {
        return delegate.getAll(name); 
}
// boolean contains(java.lang.String name) 
public boolean contains(java.lang.String name) {
        return delegate.contains(name); 
}
// boolean isEmpty() 
public boolean isEmpty() {
        return delegate.isEmpty(); 
}
// java.util.Set<java.lang.String> names() 
public java.util.Set<java.lang.String> names() {
        return delegate.names(); 
}
// io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) 
public io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) {
        return delegate.add(name, value); 
}
// io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) 
public io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) {
        return delegate.addAll(map); 
}
// io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) 
public io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) {
        return delegate.set(name, value); 
}
// io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) 
public io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) {
        return delegate.setAll(map); 
}
// io.vertx.core.MultiMap remove(java.lang.String name) 
public io.vertx.core.MultiMap remove(java.lang.String name) {
        return delegate.remove(name); 
}
// io.vertx.core.MultiMap clear() 
public io.vertx.core.MultiMap clear() {
        return delegate.clear(); 
}
// int size() 
public int size() {
        return delegate.size(); 
}
}
