module io.vertx.golo.core.Http

import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.WriteStream
import io.vertx.core.streams.ReadStream
import io.vertx.core.http.WebSocketFrame
import io.vertx.core.net.SocketAddress
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.http.WebSocketBase.exceptionHandler()
}
    # io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handlerByHandler =| handler |{
        return io.vertx.core.http.WebSocketBase.handler()
}
    # io.vertx.core.http.WebSocketBase pause() 
function pause ={
        return io.vertx.core.http.WebSocketBase.pause()
}
    # io.vertx.core.http.WebSocketBase resume() 
function resume ={
        return io.vertx.core.http.WebSocketBase.resume()
}
    # io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.http.WebSocketBase.endHandler()
}
    # io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data) 
function writeByData =| data |{
        return io.vertx.core.http.WebSocketBase.write()
}
    # io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSizeByMaxSize =| maxSize |{
        return io.vertx.core.http.WebSocketBase.setWriteQueueMaxSize()
}
    # io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandlerByHandler =| handler |{
        return io.vertx.core.http.WebSocketBase.drainHandler()
}
    # java.lang.String binaryHandlerID() 
function binaryHandlerID ={
        return java.lang.String.binaryHandlerID()
}
    # java.lang.String textHandlerID() 
function textHandlerID ={
        return java.lang.String.textHandlerID()
}
    # io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) 
function writeFrameByFrame =| frame |{
        return io.vertx.core.http.WebSocketBase.writeFrame()
}
    # io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text) 
function writeFinalTextFrameByText =| text |{
        return io.vertx.core.http.WebSocketBase.writeFinalTextFrame()
}
    # io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
function writeFinalBinaryFrameByData =| data |{
        return io.vertx.core.http.WebSocketBase.writeFinalBinaryFrame()
}
    # io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
function writeBinaryMessageByData =| data |{
        return io.vertx.core.http.WebSocketBase.writeBinaryMessage()
}
    # io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function closeHandlerByHandler =| handler |{
        return io.vertx.core.http.WebSocketBase.closeHandler()
}
    # io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
function frameHandlerByHandler =| handler |{
        return io.vertx.core.http.WebSocketBase.frameHandler()
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
