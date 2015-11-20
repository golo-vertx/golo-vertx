package io.vertx.golo.Core;

import io.vertx.core.Vertx;
import io.vertx.core.Future;
public class Context { 

private io.vertx.core.Context originalInstance; 
// boolean isOnWorkerThread() 
public boolean isOnWorkerThread() {
        return originalInstance.isOnWorkerThread(); 
}
// boolean isOnEventLoopThread() 
public boolean isOnEventLoopThread() {
        return originalInstance.isOnEventLoopThread(); 
}
// boolean isOnVertxThread() 
public boolean isOnVertxThread() {
        return originalInstance.isOnVertxThread(); 
}
// void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
public void runOnContext(io.vertx.core.Handler<java.lang.Void> action) {
        return originalInstance.runOnContext(action); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) {
        return originalInstance.executeBlocking(blockingCodeHandler, ordered, resultHandler); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) {
        return originalInstance.executeBlocking(blockingCodeHandler, resultHandler); 
}
// java.lang.String deploymentID() 
public java.lang.String deploymentID() {
        return originalInstance.deploymentID(); 
}
// io.vertx.core.json.JsonObject config() 
public io.vertx.core.json.JsonObject config() {
        return originalInstance.config(); 
}
// java.util.List<java.lang.String> processArgs() 
public java.util.List<java.lang.String> processArgs() {
        return originalInstance.processArgs(); 
}
// boolean isEventLoopContext() 
public boolean isEventLoopContext() {
        return originalInstance.isEventLoopContext(); 
}
// boolean isWorkerContext() 
public boolean isWorkerContext() {
        return originalInstance.isWorkerContext(); 
}
// boolean isMultiThreadedWorkerContext() 
public boolean isMultiThreadedWorkerContext() {
        return originalInstance.isMultiThreadedWorkerContext(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]> T get(java.lang.String key) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]> T get(java.lang.String key) {
        return originalInstance.get(key); 
}
// void put(java.lang.String key, java.lang.Object value) 
public void put(java.lang.String key, java.lang.Object value) {
        return originalInstance.put(key, value); 
}
// boolean remove(java.lang.String key) 
public boolean remove(java.lang.String key) {
        return originalInstance.remove(key); 
}
// io.vertx.core.Vertx owner() 
public io.vertx.core.Vertx owner() {
        return originalInstance.owner(); 
}
// int getInstanceCount() 
public int getInstanceCount() {
        return originalInstance.getInstanceCount(); 
}
}
