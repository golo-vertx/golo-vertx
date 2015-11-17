module io.vertx.golo.core.Net

import io.vertx.core.streams.ReadStream
import io.vertx.core.net.NetSocket
    # io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.net.NetSocketStream.exceptionHandler()
}
    # io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
function handler =| handler |{
        return io.vertx.core.net.NetSocketStream.handler()
}
    # io.vertx.core.net.NetSocketStream pause() 
function pause ={
        return io.vertx.core.net.NetSocketStream.pause()
}
    # io.vertx.core.net.NetSocketStream resume() 
function resume ={
        return io.vertx.core.net.NetSocketStream.resume()
}
    # io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.net.NetSocketStream.endHandler()
}
