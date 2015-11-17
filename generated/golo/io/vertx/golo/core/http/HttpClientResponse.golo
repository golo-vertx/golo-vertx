module io.vertx.golo.core.Http

import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.ReadStream
import io.vertx.core.MultiMap
import io.vertx.core.net.NetSocket
    # io.vertx.core.http.HttpClientResponse resume() 
function resume ={
        return io.vertx.core.http.HttpClientResponse.resume()
}
    # io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.http.HttpClientResponse.exceptionHandler()
}
    # io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handler =| handler |{
        return io.vertx.core.http.HttpClientResponse.handler()
}
    # io.vertx.core.http.HttpClientResponse pause() 
function pause ={
        return io.vertx.core.http.HttpClientResponse.pause()
}
    # io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.http.HttpClientResponse.endHandler()
}
    # int statusCode() 
function statusCode ={
        return int.statusCode()
}
    # java.lang.String statusMessage() 
function statusMessage ={
        return java.lang.String.statusMessage()
}
    # io.vertx.core.MultiMap headers() 
function headers ={
        return io.vertx.core.MultiMap.headers()
}
    # java.lang.String getHeader(java.lang.String headerName) 
function getHeader =| headerName |{
        return java.lang.String.getHeader()
}
    # java.lang.String getTrailer(java.lang.String trailerName) 
function getTrailer =| trailerName |{
        return java.lang.String.getTrailer()
}
    # io.vertx.core.MultiMap trailers() 
function trailers ={
        return io.vertx.core.MultiMap.trailers()
}
    # java.util.List<java.lang.String> cookies() 
function cookies ={
        return java.util.List<java.lang.String>.cookies()
}
    # io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
function bodyHandler =| bodyHandler |{
        return io.vertx.core.http.HttpClientResponse.bodyHandler()
}
    # io.vertx.core.net.NetSocket netSocket() 
function netSocket ={
        return io.vertx.core.net.NetSocket.netSocket()
}
