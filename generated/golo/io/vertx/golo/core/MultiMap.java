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
public static MultiMap caseInsensitiveMultiMap() {
        return InternalHelper.safeCreate(io.vertx.core.MultiMap.caseInsensitiveMultiMap(), io.vertx.golo.core.MultiMap.class); 
}
// java.lang.String get(java.lang.String name) 
public String get(java.lang.String name) {
        return delegate.get(name); 
}
// java.util.List<java.lang.String> getAll(java.lang.String name) 
public String> getAll(java.lang.String name) {
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
public String> names() {
        return delegate.names(); 
}
// io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) 
public MultiMap add(java.lang.String name, java.lang.String value) {
        return InternalHelper.safeCreate(this.delegate.add(name,value), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) 
public MultiMap addAll(io.vertx.core.MultiMap map) {
        return InternalHelper.safeCreate(this.delegate.addAll(map), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) 
public MultiMap set(java.lang.String name, java.lang.String value) {
        return InternalHelper.safeCreate(this.delegate.set(name,value), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) 
public MultiMap setAll(io.vertx.core.MultiMap map) {
        return InternalHelper.safeCreate(this.delegate.setAll(map), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap remove(java.lang.String name) 
public MultiMap remove(java.lang.String name) {
        return InternalHelper.safeCreate(this.delegate.remove(name), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap clear() 
public MultiMap clear() {
        return InternalHelper.safeCreate(this.delegate.clear(), io.vertx.golo.core.MultiMap.class); 
}
// int size() 
public int size() {
        return delegate.size(); 
}
}
