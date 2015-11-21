package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

public class Future { 

private io.vertx.core.Future<T> delegate; 
public Future(Object delegate) { 
    this.delegate = (io.vertx.core.Future<T>)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future() 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future() {
        return InternalHelper.safeCreate(<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]>.future(), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() {
        return InternalHelper.safeCreate(<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]>.succeededFuture(), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) {
        return InternalHelper.safeCreate(<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]>.succeededFuture(result), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) {
        return InternalHelper.safeCreate(<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]>.failedFuture(failureMessage), io.vertx.golo.core.Future.class); 
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
