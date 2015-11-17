module io.vertx.golo.core.Http

import io.vertx.core.streams.ReadStream
import io.vertx.core.http.WebSocket
    # io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.http.WebSocketStream.exceptionHandler()
}
    # io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler) 
function handler =| handler |{
        return io.vertx.core.http.WebSocketStream.handler()
}
    # io.vertx.core.http.WebSocketStream pause() 
function pause ={
        return io.vertx.core.http.WebSocketStream.pause()
}
    # io.vertx.core.http.WebSocketStream resume() 
function resume ={
        return io.vertx.core.http.WebSocketStream.resume()
}
    # io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.http.WebSocketStream.endHandler()
}
