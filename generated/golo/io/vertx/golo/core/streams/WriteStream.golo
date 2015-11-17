module io.vertx.golo.core.Streams

import io.vertx.core.streams.StreamBase
    # io.vertx.core.streams.WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.streams.WriteStream<T>.exceptionHandler()
}
    # io.vertx.core.streams.WriteStream<T> write(T data) 
function write =| data |{
        return io.vertx.core.streams.WriteStream<T>.write()
}
    # io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSize =| maxSize |{
        return io.vertx.core.streams.WriteStream<T>.setWriteQueueMaxSize()
}
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandler =| handler |{
        return io.vertx.core.streams.WriteStream<T>.drainHandler()
}
