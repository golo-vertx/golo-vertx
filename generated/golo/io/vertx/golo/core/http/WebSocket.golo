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
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.http.WebSocket.exceptionHandler()
}
    # io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handlerByHandler =| handler |{
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
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.http.WebSocket.endHandler()
}
    # io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data) 
function writeByData =| data |{
        return io.vertx.core.http.WebSocket.write()
}
    # io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSizeByMaxSize =| maxSize |{
        return io.vertx.core.http.WebSocket.setWriteQueueMaxSize()
}
    # io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandlerByHandler =| handler |{
        return io.vertx.core.http.WebSocket.drainHandler()
}
    # io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
function writeFrameByFrame =| frame |{
        return io.vertx.core.http.WebSocket.writeFrame()
}
    # io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text) 
function writeFinalTextFrameByText =| text |{
        return io.vertx.core.http.WebSocket.writeFinalTextFrame()
}
    # io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
function writeFinalBinaryFrameByData =| data |{
        return io.vertx.core.http.WebSocket.writeFinalBinaryFrame()
}
    # io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
function writeBinaryMessageByData =| data |{
        return io.vertx.core.http.WebSocket.writeBinaryMessage()
}
    # io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function closeHandlerByHandler =| handler |{
        return io.vertx.core.http.WebSocket.closeHandler()
}
    # io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
function frameHandlerByHandler =| handler |{
        return io.vertx.core.http.WebSocket.frameHandler()
}
