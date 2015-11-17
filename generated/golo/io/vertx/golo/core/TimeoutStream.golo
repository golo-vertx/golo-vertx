module io.vertx.golo.Core

import io.vertx.core.streams.ReadStream
    # io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.TimeoutStream.exceptionHandler()
}
    # io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) 
function handler =| handler |{
        return io.vertx.core.TimeoutStream.handler()
}
    # io.vertx.core.TimeoutStream pause() 
function pause ={
        return io.vertx.core.TimeoutStream.pause()
}
    # io.vertx.core.TimeoutStream resume() 
function resume ={
        return io.vertx.core.TimeoutStream.resume()
}
    # io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.TimeoutStream.endHandler()
}
    # void cancel() 
function cancel ={
        return void.cancel()
}
