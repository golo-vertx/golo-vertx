module io.vertx.golo.core.Eventbus

import io.vertx.core.streams.ReadStream
import io.vertx.core.eventbus.Message
    # io.vertx.core.eventbus.MessageConsumer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.eventbus.MessageConsumer<T>.exceptionHandler()
}
    # io.vertx.core.eventbus.MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
function handlerByHandler =| handler |{
        return io.vertx.core.eventbus.MessageConsumer<T>.handler()
}
    # io.vertx.core.eventbus.MessageConsumer<T> pause() 
function pause ={
        return io.vertx.core.eventbus.MessageConsumer<T>.pause()
}
    # io.vertx.core.eventbus.MessageConsumer<T> resume() 
function resume ={
        return io.vertx.core.eventbus.MessageConsumer<T>.resume()
}
    # io.vertx.core.eventbus.MessageConsumer<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.eventbus.MessageConsumer<T>.endHandler()
}
    # io.vertx.core.streams.ReadStream<T> bodyStream() 
function bodyStream ={
        return io.vertx.core.streams.ReadStream<T>.bodyStream()
}
    # boolean isRegistered() 
function isRegistered ={
        return boolean.isRegistered()
}
    # java.lang.String address() 
function address ={
        return java.lang.String.address()
}
    # io.vertx.core.eventbus.MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) 
function setMaxBufferedMessagesByMaxBufferedMessages =| maxBufferedMessages |{
        return io.vertx.core.eventbus.MessageConsumer<T>.setMaxBufferedMessages()
}
    # int getMaxBufferedMessages() 
function getMaxBufferedMessages ={
        return int.getMaxBufferedMessages()
}
    # void completionHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
function completionHandlerByCompletionHandler =| completionHandler |{
        return void.completionHandler()
}
    # void unregister() 
function unregister ={
        return void.unregister()
}
    # void unregister(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
function unregisterByCompletionHandler =| completionHandler |{
        return void.unregister()
}
