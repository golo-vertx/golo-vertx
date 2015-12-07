package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.Future<T> 
public class Future<T> { 

private io.vertx.core.Future delegate; 
public Future(Object delegate) { 
    this.delegate = (io.vertx.core.Future)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future() 
public static <T> io.vertx.core.Future<T> future() {
        return (io.vertx.core.Future<T>)InternalHelper.safeCreate(io.vertx.core.Future.future(), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() 
public static <T> io.vertx.core.Future<T> succeededFuture() {
        return (io.vertx.core.Future<T>)InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) 
public static <T> io.vertx.core.Future<T> succeededFuture(T result) {
        return (io.vertx.core.Future<T>)InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(result), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) 
public static <T> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) {
        return (io.vertx.core.Future<T>)InternalHelper.safeCreate(io.vertx.core.Future.failedFuture(failureMessage), io.vertx.golo.core.Future.class); 
}
// boolean isComplete() 
public boolean {
        return (boolean)delegate.isComplete(); 
}
// void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) 
public void {
        delegate.setHandler(handler); 
}
// void complete(T result) 
public void {
        delegate.complete(result); 
}
// void complete() 
public void {
        delegate.complete(); 
}
// void fail(java.lang.String failureMessage) 
public void {
        delegate.fail(failureMessage); 
}
}
