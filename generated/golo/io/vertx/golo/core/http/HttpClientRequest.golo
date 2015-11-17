module io.vertx.golo.core.Http

import io.vertx.core.http.HttpClientResponse
import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.WriteStream
import io.vertx.core.streams.ReadStream
import io.vertx.core.MultiMap
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.http.HttpClientRequest.exceptionHandler()
}
    # io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) 
function writeByData =| data |{
        return io.vertx.core.http.HttpClientRequest.write()
}
    # io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSizeByMaxSize =| maxSize |{
        return io.vertx.core.http.HttpClientRequest.setWriteQueueMaxSize()
}
    # io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandlerByHandler =| handler |{
        return io.vertx.core.http.HttpClientRequest.drainHandler()
}
    # io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) 
function handlerByHandler =| handler |{
        return io.vertx.core.http.HttpClientRequest.handler()
}
    # io.vertx.core.http.HttpClientRequest pause() 
function pause ={
        return io.vertx.core.http.HttpClientRequest.pause()
}
    # io.vertx.core.http.HttpClientRequest resume() 
function resume ={
        return io.vertx.core.http.HttpClientRequest.resume()
}
    # io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.http.HttpClientRequest.endHandler()
}
    # io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) 
function setChunkedByChunked =| chunked |{
        return io.vertx.core.http.HttpClientRequest.setChunked()
}
    # boolean isChunked() 
function isChunked ={
        return boolean.isChunked()
}
    # io.vertx.core.http.HttpMethod method() 
function method ={
        return io.vertx.core.http.HttpMethod.method()
}
    # java.lang.String uri() 
function uri ={
        return java.lang.String.uri()
}
    # io.vertx.core.MultiMap headers() 
function headers ={
        return io.vertx.core.MultiMap.headers()
}
    # io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) 
function putHeaderByNameAndValue =| name , value |{
        return io.vertx.core.http.HttpClientRequest.putHeader()
}
    # io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) 
function writeByChunk =| chunk |{
        return io.vertx.core.http.HttpClientRequest.write()
}
    # io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) 
function writeByChunkAndEnc =| chunk , enc |{
        return io.vertx.core.http.HttpClientRequest.write()
}
    # io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function continueHandlerByHandler =| handler |{
        return io.vertx.core.http.HttpClientRequest.continueHandler()
}
    # io.vertx.core.http.HttpClientRequest sendHead() 
function sendHead ={
        return io.vertx.core.http.HttpClientRequest.sendHead()
}
    # void end(java.lang.String chunk) 
function endByChunk =| chunk |{
        return void.end()
}
    # void end(java.lang.String chunk, java.lang.String enc) 
function endByChunkAndEnc =| chunk , enc |{
        return void.end()
}
    # void end(io.vertx.core.buffer.Buffer chunk) 
function endByChunk =| chunk |{
        return void.end()
}
    # void end() 
function end ={
        return void.end()
}
    # io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs) 
function setTimeoutByTimeoutMs =| timeoutMs |{
        return io.vertx.core.http.HttpClientRequest.setTimeout()
}
