module io.vertx.golo.core.Http

import io.vertx.core.http.ServerWebSocket
import io.vertx.core.streams.ReadStream
    # io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.http.ServerWebSocketStream.exceptionHandler()
}
    # io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
function handlerByHandler =| handler |{
        return io.vertx.core.http.ServerWebSocketStream.handler()
}
    # io.vertx.core.http.ServerWebSocketStream pause() 
function pause ={
        return io.vertx.core.http.ServerWebSocketStream.pause()
}
    # io.vertx.core.http.ServerWebSocketStream resume() 
function resume ={
        return io.vertx.core.http.ServerWebSocketStream.resume()
}
    # io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.http.ServerWebSocketStream.endHandler()
}
