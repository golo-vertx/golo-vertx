module io.vertx.golo.core.Eventbus

import io.vertx.core.MultiMap
    # java.lang.String address() 
function address ={
        return java.lang.String.address()
}
    # io.vertx.core.MultiMap headers() 
function headers ={
        return io.vertx.core.MultiMap.headers()
}
    # T body() 
function body ={
        return T.body()
}
    # java.lang.String replyAddress() 
function replyAddress ={
        return java.lang.String.replyAddress()
}
    # void reply(java.lang.Object message) 
function reply =| message |{
        return void.reply()
}
    # <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
function replyByMessageAndReplyHandler =| message , replyHandler |{
        return <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]>.reply()
}
    # void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
function replyByMessageAndOptions =| message , options |{
        return void.reply()
}
    # <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
function replyByMessageAndOptionsAndReplyHandler =| message , options , replyHandler |{
        return <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]>.reply()
}
    # void fail(int failureCode, java.lang.String message) 
function fail =| failureCode , message |{
        return void.fail()
}
