module io.vertx.golo.core.Http

import io.vertx.core.http.HttpServerRequest
import io.vertx.core.http.ServerWebSocket
import io.vertx.core.metrics.Measured
import io.vertx.core.http.HttpServerRequestStream
import io.vertx.core.http.ServerWebSocketStream
    # boolean isMetricsEnabled() 
function isMetricsEnabled ={
        return boolean.isMetricsEnabled()
}
    # io.vertx.core.http.HttpServerRequestStream requestStream() 
function requestStream ={
        return io.vertx.core.http.HttpServerRequestStream.requestStream()
}
    # io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
function requestHandler =| handler |{
        return io.vertx.core.http.HttpServer.requestHandler()
}
    # io.vertx.core.http.ServerWebSocketStream websocketStream() 
function websocketStream ={
        return io.vertx.core.http.ServerWebSocketStream.websocketStream()
}
    # io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
function websocketHandler =| handler |{
        return io.vertx.core.http.HttpServer.websocketHandler()
}
    # io.vertx.core.http.HttpServer listen() 
function listen ={
        return io.vertx.core.http.HttpServer.listen()
}
    # io.vertx.core.http.HttpServer listen(int port, java.lang.String host) 
function listenByPortAndHost =| port , host |{
        return io.vertx.core.http.HttpServer.listen()
}
    # io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
function listenByPortAndHostAndListenHandler =| port , host , listenHandler |{
        return io.vertx.core.http.HttpServer.listen()
}
    # io.vertx.core.http.HttpServer listen(int port) 
function listenByPort =| port |{
        return io.vertx.core.http.HttpServer.listen()
}
    # io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
function listenByPortAndListenHandler =| port , listenHandler |{
        return io.vertx.core.http.HttpServer.listen()
}
    # io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler) 
function listenByListenHandler =| listenHandler |{
        return io.vertx.core.http.HttpServer.listen()
}
    # void close() 
function close ={
        return void.close()
}
    # void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
function closeByCompletionHandler =| completionHandler |{
        return void.close()
}
