module io.vertx.golo.core.Net

import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.WriteStream
import io.vertx.core.streams.ReadStream
import io.vertx.core.net.SocketAddress
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.net.NetSocket.exceptionHandler()
}
    # io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handler =| handler |{
        return io.vertx.core.net.NetSocket.handler()
}
    # io.vertx.core.net.NetSocket pause() 
function pause ={
        return io.vertx.core.net.NetSocket.pause()
}
    # io.vertx.core.net.NetSocket resume() 
function resume ={
        return io.vertx.core.net.NetSocket.resume()
}
    # io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.net.NetSocket.endHandler()
}
    # io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) 
function write =| data |{
        return io.vertx.core.net.NetSocket.write()
}
    # io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSize =| maxSize |{
        return io.vertx.core.net.NetSocket.setWriteQueueMaxSize()
}
    # io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandler =| handler |{
        return io.vertx.core.net.NetSocket.drainHandler()
}
    # java.lang.String writeHandlerID() 
function writeHandlerID ={
        return java.lang.String.writeHandlerID()
}
    # io.vertx.core.net.NetSocket write(java.lang.String str) 
function writeByStr =| str |{
        return io.vertx.core.net.NetSocket.write()
}
    # io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) 
function writeByStrAndEnc =| str , enc |{
        return io.vertx.core.net.NetSocket.write()
}
    # io.vertx.core.net.NetSocket sendFile(java.lang.String filename) 
function sendFile =| filename |{
        return io.vertx.core.net.NetSocket.sendFile()
}
    # io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) 
function sendFileByFilenameAndOffset =| filename , offset |{
        return io.vertx.core.net.NetSocket.sendFile()
}
    # io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) 
function sendFileByFilenameAndOffsetAndLength =| filename , offset , length |{
        return io.vertx.core.net.NetSocket.sendFile()
}
    # io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
function sendFileByFilenameAndResultHandler =| filename , resultHandler |{
        return io.vertx.core.net.NetSocket.sendFile()
}
    # io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
function sendFileByFilenameAndOffsetAndResultHandler =| filename , offset , resultHandler |{
        return io.vertx.core.net.NetSocket.sendFile()
}
    # io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
function sendFileByFilenameAndOffsetAndLengthAndResultHandler =| filename , offset , length , resultHandler |{
        return io.vertx.core.net.NetSocket.sendFile()
}
    # io.vertx.core.net.SocketAddress remoteAddress() 
function remoteAddress ={
        return io.vertx.core.net.SocketAddress.remoteAddress()
}
    # io.vertx.core.net.SocketAddress localAddress() 
function localAddress ={
        return io.vertx.core.net.SocketAddress.localAddress()
}
    # void close() 
function close ={
        return void.close()
}
    # io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function closeHandler =| handler |{
        return io.vertx.core.net.NetSocket.closeHandler()
}
    # io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) 
function upgradeToSsl =| handler |{
        return io.vertx.core.net.NetSocket.upgradeToSsl()
}
    # boolean isSsl() 
function isSsl ={
        return boolean.isSsl()
}
