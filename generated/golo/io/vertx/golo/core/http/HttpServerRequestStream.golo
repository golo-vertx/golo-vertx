module io.vertx.golo.core.Http

import io.vertx.core.http.HttpServerRequest
import io.vertx.core.streams.ReadStream
    # io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.http.HttpServerRequestStream.exceptionHandler()
}
    # io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
function handlerByHandler =| handler |{
        return io.vertx.core.http.HttpServerRequestStream.handler()
}
    # io.vertx.core.http.HttpServerRequestStream pause() 
function pause ={
        return io.vertx.core.http.HttpServerRequestStream.pause()
}
    # io.vertx.core.http.HttpServerRequestStream resume() 
function resume ={
        return io.vertx.core.http.HttpServerRequestStream.resume()
}
    # io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.http.HttpServerRequestStream.endHandler()
}
