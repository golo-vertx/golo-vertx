package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.Context 
public class Context { 

private io.vertx.core.Context delegate; 
public Context(Object delegate) { 
    this.delegate = (io.vertx.core.Context)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isOnWorkerThread() 
// TypeParams: [] 
public static boolean isOnWorkerThread() {
        //param classes(remove later):  
    return io.vertx.core.Context.isOnWorkerThread(); 
}
// boolean isOnEventLoopThread() 
// TypeParams: [] 
public static boolean isOnEventLoopThread() {
        //param classes(remove later):  
    return io.vertx.core.Context.isOnEventLoopThread(); 
}
// boolean isOnVertxThread() 
// TypeParams: [] 
public static boolean isOnVertxThread() {
        //param classes(remove later):  
    return io.vertx.core.Context.isOnVertxThread(); 
}
// void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
// TypeParams: [] 
public void runOnContext(Handler<Void> action) {
        //param classes(remove later):   HANDLER  
    delegate.runOnContext(action); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]] 
public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler,boolean ordered,Handler<AsyncResult<T>> resultHandler) {
        //param classes(remove later):   HANDLER   PRIMITIVE   HANDLER  
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
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]] 
public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler,Handler<AsyncResult<T>> resultHandler) {
        //param classes(remove later):   HANDLER   HANDLER  
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
// TypeParams: [] 
public String deploymentID() {
        //param classes(remove later):  
    return delegate.deploymentID(); 
}
// io.vertx.core.json.JsonObject config() 
// TypeParams: [] 
public JsonObject config() {
        //param classes(remove later):  
    return delegate.config(); 
}
// java.util.List<java.lang.String> processArgs() 
// TypeParams: [] 
public List<String> processArgs() {
        //param classes(remove later):  
    return delegate.processArgs(); 
}
// boolean isEventLoopContext() 
// TypeParams: [] 
public boolean isEventLoopContext() {
        //param classes(remove later):  
    return delegate.isEventLoopContext(); 
}
// boolean isWorkerContext() 
// TypeParams: [] 
public boolean isWorkerContext() {
        //param classes(remove later):  
    return delegate.isWorkerContext(); 
}
// boolean isMultiThreadedWorkerContext() 
// TypeParams: [] 
public boolean isMultiThreadedWorkerContext() {
        //param classes(remove later):  
    return delegate.isMultiThreadedWorkerContext(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]> T get(java.lang.String key) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]] 
public <T> T get(String key) {
        //param classes(remove later):   STRING  
    return delegate.get(key); 
}
// void put(java.lang.String key, java.lang.Object value) 
// TypeParams: [] 
public void put(String key,Object value) {
        //param classes(remove later):   STRING   OBJECT  
    delegate.put(key,value); 
}
// boolean remove(java.lang.String key) 
// TypeParams: [] 
public boolean remove(String key) {
        //param classes(remove later):   STRING  
    return delegate.remove(key); 
}
// io.vertx.core.Vertx owner() 
// TypeParams: [] 
public Vertx owner() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.owner(), io.vertx.golo.core.Vertx.class); 
}
// int getInstanceCount() 
// TypeParams: [] 
public int getInstanceCount() {
        //param classes(remove later):  
    return delegate.getInstanceCount(); 
}
}
