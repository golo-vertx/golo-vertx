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
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.http.ServerWebSocket.exceptionHandler()
}
    # io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handlerByHandler =| handler |{
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
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.http.ServerWebSocket.endHandler()
}
    # io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data) 
function writeByData =| data |{
        return io.vertx.core.http.ServerWebSocket.write()
}
    # io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSizeByMaxSize =| maxSize |{
        return io.vertx.core.http.ServerWebSocket.setWriteQueueMaxSize()
}
    # io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandlerByHandler =| handler |{
        return io.vertx.core.http.ServerWebSocket.drainHandler()
}
    # io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
function writeFrameByFrame =| frame |{
        return io.vertx.core.http.ServerWebSocket.writeFrame()
}
    # io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text) 
function writeFinalTextFrameByText =| text |{
        return io.vertx.core.http.ServerWebSocket.writeFinalTextFrame()
}
    # io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
function writeFinalBinaryFrameByData =| data |{
        return io.vertx.core.http.ServerWebSocket.writeFinalBinaryFrame()
}
    # io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
function writeBinaryMessageByData =| data |{
        return io.vertx.core.http.ServerWebSocket.writeBinaryMessage()
}
    # io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function closeHandlerByHandler =| handler |{
        return io.vertx.core.http.ServerWebSocket.closeHandler()
}
    # io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
function frameHandlerByHandler =| handler |{
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
