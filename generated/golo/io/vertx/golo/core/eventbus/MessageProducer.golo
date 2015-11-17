module io.vertx.golo.core.Eventbus

import io.vertx.core.streams.WriteStream
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.eventbus.MessageProducer<T>.exceptionHandler()
}
    # io.vertx.core.eventbus.MessageProducer<T> write(T data) 
function writeByData =| data |{
        return io.vertx.core.eventbus.MessageProducer<T>.write()
}
    # io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSizeByMaxSize =| maxSize |{
        return io.vertx.core.eventbus.MessageProducer<T>.setWriteQueueMaxSize()
}
    # io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandlerByHandler =| handler |{
        return io.vertx.core.eventbus.MessageProducer<T>.drainHandler()
}
    # io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options) 
function deliveryOptionsByOptions =| options |{
        return io.vertx.core.eventbus.MessageProducer<T>.deliveryOptions()
}
    # java.lang.String address() 
function address ={
        return java.lang.String.address()
}
