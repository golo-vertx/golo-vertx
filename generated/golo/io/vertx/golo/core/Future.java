package io.vertx.golo.Core;

public class Future { 

private io.vertx.core.Future<T> originalInstance; 
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future() 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future() {
        return originalInstance.future(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() {
        return originalInstance.succeededFuture(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) {
        return originalInstance.succeededFuture(result); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) {
        return originalInstance.failedFuture(failureMessage); 
}
// boolean isComplete() 
public boolean isComplete() {
        return originalInstance.isComplete(); 
}
// void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) 
public void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) {
        return originalInstance.setHandler(handler); 
}
// void complete(T result) 
public void complete(T result) {
        return originalInstance.complete(result); 
}
// void complete() 
public void complete() {
        return originalInstance.complete(); 
}
// void fail(java.lang.String failureMessage) 
public void fail(java.lang.String failureMessage) {
        return originalInstance.fail(failureMessage); 
}
}
