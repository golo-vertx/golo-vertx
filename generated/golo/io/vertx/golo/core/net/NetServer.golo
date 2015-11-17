module io.vertx.golo.core.Net

import io.vertx.core.net.NetSocketStream
import io.vertx.core.metrics.Measured
import io.vertx.core.net.NetSocket
    # boolean isMetricsEnabled() 
function isMetricsEnabled ={
        return boolean.isMetricsEnabled()
}
    # io.vertx.core.net.NetSocketStream connectStream() 
function connectStream ={
        return io.vertx.core.net.NetSocketStream.connectStream()
}
    # io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
function connectHandler =| handler |{
        return io.vertx.core.net.NetServer.connectHandler()
}
    # io.vertx.core.net.NetServer listen() 
function listen ={
        return io.vertx.core.net.NetServer.listen()
}
    # io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
function listenByListenHandler =| listenHandler |{
        return io.vertx.core.net.NetServer.listen()
}
    # io.vertx.core.net.NetServer listen(int port, java.lang.String host) 
function listenByPortAndHost =| port , host |{
        return io.vertx.core.net.NetServer.listen()
}
    # io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
function listenByPortAndHostAndListenHandler =| port , host , listenHandler |{
        return io.vertx.core.net.NetServer.listen()
}
    # io.vertx.core.net.NetServer listen(int port) 
function listenByPort =| port |{
        return io.vertx.core.net.NetServer.listen()
}
    # io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
function listenByPortAndListenHandler =| port , listenHandler |{
        return io.vertx.core.net.NetServer.listen()
}
    # void close() 
function close ={
        return void.close()
}
    # void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
function closeByCompletionHandler =| completionHandler |{
        return void.close()
}
    # int actualPort() 
function actualPort ={
        return int.actualPort()
}
