module io.vertx.golo.core.Streams

import io.vertx.core.streams.StreamBase
    # io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.streams.ReadStream<T>.exceptionHandler()
}
    # io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler) 
function handlerByHandler =| handler |{
        return io.vertx.core.streams.ReadStream<T>.handler()
}
    # io.vertx.core.streams.ReadStream<T> pause() 
function pause ={
        return io.vertx.core.streams.ReadStream<T>.pause()
}
    # io.vertx.core.streams.ReadStream<T> resume() 
function resume ={
        return io.vertx.core.streams.ReadStream<T>.resume()
}
    # io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.streams.ReadStream<T>.endHandler()
}
