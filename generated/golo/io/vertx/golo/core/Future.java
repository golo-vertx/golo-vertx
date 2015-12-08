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
        return InternalHelper.safeCreate(io.vertx.core.Future.future(), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() 
public static <T> io.vertx.core.Future<T> succeededFuture() {
        return InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) 
public static <T> io.vertx.core.Future<T> succeededFuture(T result) {
        return InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(result), io.vertx.golo.core.Future.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) 
public static <T> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) {
        return InternalHelper.safeCreate(io.vertx.core.Future.failedFuture(failureMessage), io.vertx.golo.core.Future.class); 
}
// boolean isComplete() 
public boolean isComplete() {
        return delegate.isComplete(); 
}
// void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) 
public void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) {
        delegate.setHandler(new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
handler.handle(f);
         }
       }); 
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
