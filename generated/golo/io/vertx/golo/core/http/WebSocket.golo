module io.vertx.golo.core.Http

import io.vertx.core.http.WebSocketBase
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.WebSocketFrame
import io.vertx.core.net.SocketAddress
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # java.lang.String binaryHandlerID() 
function binaryHandlerID ={
        return java.lang.String.binaryHandlerID()
}
    # java.lang.String textHandlerID() 
function textHandlerID ={
        return java.lang.String.textHandlerID()
}
    # void close() 
function close ={
        return void.close()
}
    # io.vertx.core.net.SocketAddress remoteAddress() 
function remoteAddress ={
        return io.vertx.core.net.SocketAddress.remoteAddress()
}
    # io.vertx.core.net.SocketAddress localAddress() 
function localAddress ={
        return io.vertx.core.net.SocketAddress.localAddress()
}
    # io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.http.WebSocket.exceptionHandler()
}
    # io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handler =| handler |{
        return io.vertx.core.http.WebSocket.handler()
}
    # io.vertx.core.http.WebSocket pause() 
function pause ={
        return io.vertx.core.http.WebSocket.pause()
}
    # io.vertx.core.http.WebSocket resume() 
function resume ={
        return io.vertx.core.http.WebSocket.resume()
}
    # io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.http.WebSocket.endHandler()
}
    # io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data) 
function write =| data |{
        return io.vertx.core.http.WebSocket.write()
}
    # io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSize =| maxSize |{
        return io.vertx.core.http.WebSocket.setWriteQueueMaxSize()
}
    # io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandler =| handler |{
        return io.vertx.core.http.WebSocket.drainHandler()
}
    # io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
function writeFrame =| frame |{
        return io.vertx.core.http.WebSocket.writeFrame()
}
    # io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text) 
function writeFinalTextFrame =| text |{
        return io.vertx.core.http.WebSocket.writeFinalTextFrame()
}
    # io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
function writeFinalBinaryFrame =| data |{
        return io.vertx.core.http.WebSocket.writeFinalBinaryFrame()
}
    # io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
function writeBinaryMessage =| data |{
        return io.vertx.core.http.WebSocket.writeBinaryMessage()
}
    # io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function closeHandler =| handler |{
        return io.vertx.core.http.WebSocket.closeHandler()
}
    # io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
function frameHandler =| handler |{
        return io.vertx.core.http.WebSocket.frameHandler()
}
