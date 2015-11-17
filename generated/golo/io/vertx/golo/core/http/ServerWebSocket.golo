module io.vertx.golo.core.Http

import io.vertx.core.http.WebSocketBase
import io.vertx.core.buffer.Buffer
import io.vertx.core.MultiMap
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
    # io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.http.ServerWebSocket.exceptionHandler()
}
    # io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handler =| handler |{
        return io.vertx.core.http.ServerWebSocket.handler()
}
    # io.vertx.core.http.ServerWebSocket pause() 
function pause ={
        return io.vertx.core.http.ServerWebSocket.pause()
}
    # io.vertx.core.http.ServerWebSocket resume() 
function resume ={
        return io.vertx.core.http.ServerWebSocket.resume()
}
    # io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.http.ServerWebSocket.endHandler()
}
    # io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data) 
function write =| data |{
        return io.vertx.core.http.ServerWebSocket.write()
}
    # io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSize =| maxSize |{
        return io.vertx.core.http.ServerWebSocket.setWriteQueueMaxSize()
}
    # io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandler =| handler |{
        return io.vertx.core.http.ServerWebSocket.drainHandler()
}
    # io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
function writeFrame =| frame |{
        return io.vertx.core.http.ServerWebSocket.writeFrame()
}
    # io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text) 
function writeFinalTextFrame =| text |{
        return io.vertx.core.http.ServerWebSocket.writeFinalTextFrame()
}
    # io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
function writeFinalBinaryFrame =| data |{
        return io.vertx.core.http.ServerWebSocket.writeFinalBinaryFrame()
}
    # io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
function writeBinaryMessage =| data |{
        return io.vertx.core.http.ServerWebSocket.writeBinaryMessage()
}
    # io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function closeHandler =| handler |{
        return io.vertx.core.http.ServerWebSocket.closeHandler()
}
    # io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
function frameHandler =| handler |{
        return io.vertx.core.http.ServerWebSocket.frameHandler()
}
    # java.lang.String uri() 
function uri ={
        return java.lang.String.uri()
}
    # java.lang.String path() 
function path ={
        return java.lang.String.path()
}
    # java.lang.String query() 
function query ={
        return java.lang.String.query()
}
    # io.vertx.core.MultiMap headers() 
function headers ={
        return io.vertx.core.MultiMap.headers()
}
    # void reject() 
function reject ={
        return void.reject()
}
