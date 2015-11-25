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
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future() {
        return io.vertx.core.Future<T>.future(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() {
        return io.vertx.core.Future<T>.succeededFuture(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) {
        return io.vertx.core.Future<T>.succeededFuture(result); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) {
        return io.vertx.core.Future<T>.failedFuture(failureMessage); 
}
// boolean isComplete() 
public boolean isComplete() {
        return delegate.isComplete(); 
}
// void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) 
public void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) {
        delegate.setHandler(handler); 
}
// void complete(T result) 
public void complete(T result) {
        delegate.complete(result); 
}
// void complete() 
public void complete() {
        delegate.complete(); 
}
// void fail(java.lang.String failureMessage) 
public void fail(java.lang.String failureMessage) {
        delegate.fail(failureMessage); 
}
}
