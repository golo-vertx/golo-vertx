package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
// Type: io.vertx.core.MultiMap 
public class MultiMap { 

private io.vertx.core.MultiMap delegate; 
public MultiMap(Object delegate) { 
    this.delegate = (io.vertx.core.MultiMap)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.MultiMap caseInsensitiveMultiMap() 
// TypeParams: [] 
public static MultiMap caseInsensitiveMultiMap() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(io.vertx.core.MultiMap.caseInsensitiveMultiMap(), io.vertx.golo.core.MultiMap.class); 
}
// java.lang.String get(java.lang.String name) 
// TypeParams: [] 
public String get(String name) {
        //param classes(remove later):   STRING  
    return delegate.get(name); 
}
// java.util.List<java.lang.String> getAll(java.lang.String name) 
// TypeParams: [] 
public List<String> getAll(String name) {
        //param classes(remove later):   STRING  
    return delegate.getAll(name); 
}
// boolean contains(java.lang.String name) 
// TypeParams: [] 
public boolean contains(String name) {
        //param classes(remove later):   STRING  
    return delegate.contains(name); 
}
// boolean isEmpty() 
// TypeParams: [] 
public boolean isEmpty() {
        //param classes(remove later):  
    return delegate.isEmpty(); 
}
// java.util.Set<java.lang.String> names() 
// TypeParams: [] 
public Set<String> names() {
        //param classes(remove later):  
    return delegate.names(); 
}
// io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) 
// TypeParams: [] 
public MultiMap add(String name,String value) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.add(name,value), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) 
// TypeParams: [] 
public MultiMap addAll(MultiMap map) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.addAll(map), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) 
// TypeParams: [] 
public MultiMap set(String name,String value) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.set(name,value), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) 
// TypeParams: [] 
public MultiMap setAll(MultiMap map) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.setAll(map), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap remove(java.lang.String name) 
// TypeParams: [] 
public MultiMap remove(String name) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.remove(name), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.MultiMap clear() 
// TypeParams: [] 
public MultiMap clear() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.clear(), io.vertx.golo.core.MultiMap.class); 
}
// int size() 
// TypeParams: [] 
public int size() {
        //param classes(remove later):  
    return delegate.size(); 
}
}
