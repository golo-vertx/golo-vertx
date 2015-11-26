package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.Vertx;
import io.vertx.core.Future;
// io.vertx.core.Context 
public class Context { 

private io.vertx.core.Context delegate; 
public Context(Object delegate) { 
    this.delegate = (io.vertx.core.Context)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isOnWorkerThread() 
public static boolean isOnWorkerThread() {
        return (boolean)io.vertx.core.Context.isOnWorkerThread(); 
}
// boolean isOnEventLoopThread() 
public static boolean isOnEventLoopThread() {
        return (boolean)io.vertx.core.Context.isOnEventLoopThread(); 
}
// boolean isOnVertxThread() 
public static boolean isOnVertxThread() {
        return (boolean)io.vertx.core.Context.isOnVertxThread(); 
}
// void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
public void runOnContext(io.vertx.core.Handler<java.lang.Void> action) {
        delegate.runOnContext(action); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <T>void {
        delegate.executeBlocking(blockingCodeHandler, ordered, resultHandler); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <T>void {
        delegate.executeBlocking(blockingCodeHandler, resultHandler); 
}
// java.lang.String deploymentID() 
public java.lang.String deploymentID() {
        return (java.lang.String)delegate.deploymentID(); 
}
// io.vertx.core.json.JsonObject config() 
public io.vertx.core.json.JsonObject config() {
        return (io.vertx.core.json.JsonObject)delegate.config(); 
}
// java.util.List<java.lang.String> processArgs() 
public java.util.List<java.lang.String> processArgs() {
        return (java.util.List<java.lang.String>)delegate.processArgs(); 
}
// boolean isEventLoopContext() 
public boolean isEventLoopContext() {
        return (boolean)delegate.isEventLoopContext(); 
}
// boolean isWorkerContext() 
public boolean isWorkerContext() {
        return (boolean)delegate.isWorkerContext(); 
}
// boolean isMultiThreadedWorkerContext() 
public boolean isMultiThreadedWorkerContext() {
        return (boolean)delegate.isMultiThreadedWorkerContext(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]> T get(java.lang.String key) 
public <T>T {
        return (T)delegate.get(key); 
}
// void put(java.lang.String key, java.lang.Object value) 
public void put(java.lang.String key, java.lang.Object value) {
        delegate.put(key, value); 
}
// boolean remove(java.lang.String key) 
public boolean remove(java.lang.String key) {
        return (boolean)delegate.remove(key); 
}
// io.vertx.core.Vertx owner() 
public io.vertx.core.Vertx owner() {
        return (io.vertx.core.Vertx)delegate.owner(); 
}
// int getInstanceCount() 
public int getInstanceCount() {
        return (int)delegate.getInstanceCount(); 
}
}
