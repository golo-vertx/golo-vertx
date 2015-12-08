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
        return io.vertx.core.Context.isOnWorkerThread(); 
}
// boolean isOnEventLoopThread() 
public static boolean isOnEventLoopThread() {
        return io.vertx.core.Context.isOnEventLoopThread(); 
}
// boolean isOnVertxThread() 
public static boolean isOnVertxThread() {
        return io.vertx.core.Context.isOnVertxThread(); 
}
// void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
public void runOnContext(io.vertx.core.Handler<java.lang.Void> action) {
        delegate.runOnContext(action); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) {
        delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
                          public void handle(io.vertx.core.Future<java.lang.Object> event) {
blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
                          }
                        },ordered,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle(f);
         }
       }); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) {
        delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
                          public void handle(io.vertx.core.Future<java.lang.Object> event) {
blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
                          }
                        },new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle(f);
         }
       }); 
}
// java.lang.String deploymentID() 
public String deploymentID() {
        return delegate.deploymentID(); 
}
// io.vertx.core.json.JsonObject config() 
public JsonObject config() {
        return delegate.config(); 
}
// java.util.List<java.lang.String> processArgs() 
public String> processArgs() {
        return delegate.processArgs(); 
}
// boolean isEventLoopContext() 
public boolean isEventLoopContext() {
        return delegate.isEventLoopContext(); 
}
// boolean isWorkerContext() 
public boolean isWorkerContext() {
        return delegate.isWorkerContext(); 
}
// boolean isMultiThreadedWorkerContext() 
public boolean isMultiThreadedWorkerContext() {
        return delegate.isMultiThreadedWorkerContext(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]> T get(java.lang.String key) 
public <T> T get(java.lang.String key) {
        return delegate.get(key); 
}
// void put(java.lang.String key, java.lang.Object value) 
public void put(java.lang.String key, java.lang.Object value) {
        delegate.put(key,value); 
}
// boolean remove(java.lang.String key) 
public boolean remove(java.lang.String key) {
        return delegate.remove(key); 
}
// io.vertx.core.Vertx owner() 
public Vertx owner() {
        return InternalHelper.safeCreate(this.delegate.owner(), io.vertx.golo.core.Vertx.class); 
}
// int getInstanceCount() 
public int getInstanceCount() {
        return delegate.getInstanceCount(); 
}
}
