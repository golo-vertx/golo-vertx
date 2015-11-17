module io.vertx.golo.Core

import io.vertx.core.Vertx
import io.vertx.core.Future
    # boolean isOnWorkerThread() 
function isOnWorkerThread ={
        return boolean.isOnWorkerThread()
}
    # boolean isOnEventLoopThread() 
function isOnEventLoopThread ={
        return boolean.isOnEventLoopThread()
}
    # boolean isOnVertxThread() 
function isOnVertxThread ={
        return boolean.isOnVertxThread()
}
    # void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
function runOnContext =| action |{
        return void.runOnContext()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
function executeBlocking =| blockingCodeHandler , ordered , resultHandler |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]>.executeBlocking()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
function executeBlockingByBlockingCodeHandlerAndResultHandler =| blockingCodeHandler , resultHandler |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]>.executeBlocking()
}
    # java.lang.String deploymentID() 
function deploymentID ={
        return java.lang.String.deploymentID()
}
    # io.vertx.core.json.JsonObject config() 
function config ={
        return io.vertx.core.json.JsonObject.config()
}
    # java.util.List<java.lang.String> processArgs() 
function processArgs ={
        return java.util.List<java.lang.String>.processArgs()
}
    # boolean isEventLoopContext() 
function isEventLoopContext ={
        return boolean.isEventLoopContext()
}
    # boolean isWorkerContext() 
function isWorkerContext ={
        return boolean.isWorkerContext()
}
    # boolean isMultiThreadedWorkerContext() 
function isMultiThreadedWorkerContext ={
        return boolean.isMultiThreadedWorkerContext()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]> T get(java.lang.String key) 
function get =| key |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]>.get()
}
    # void put(java.lang.String key, java.lang.Object value) 
function put =| key , value |{
        return void.put()
}
    # boolean remove(java.lang.String key) 
function remove =| key |{
        return boolean.remove()
}
    # io.vertx.core.Vertx owner() 
function owner ={
        return io.vertx.core.Vertx.owner()
}
    # int getInstanceCount() 
function getInstanceCount ={
        return int.getInstanceCount()
}
