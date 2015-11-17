module io.vertx.golo.Core

    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future() 
function future ={
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]>.future()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture() 
function succeededFuture ={
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]>.succeededFuture()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result) 
function succeededFutureByResult =| result |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]>.succeededFuture()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage) 
function failedFutureByFailureMessage =| failureMessage |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]>.failedFuture()
}
    # boolean isComplete() 
function isComplete ={
        return boolean.isComplete()
}
    # void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) 
function setHandlerByHandler =| handler |{
        return void.setHandler()
}
    # void complete(T result) 
function completeByResult =| result |{
        return void.complete()
}
    # void complete() 
function complete ={
        return void.complete()
}
    # void fail(java.lang.String failureMessage) 
function failByFailureMessage =| failureMessage |{
        return void.fail()
}
