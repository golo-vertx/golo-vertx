module io.vertx.golo.core.Http

import io.vertx.core.http.ServerWebSocket
import io.vertx.core.http.HttpServerFileUpload
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpServerResponse
import io.vertx.core.MultiMap
import io.vertx.core.streams.ReadStream
import io.vertx.core.net.SocketAddress
import io.vertx.core.net.NetSocket
    # io.vertx.core.http.HttpServerRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.http.HttpServerRequest.exceptionHandler()
}
    # io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handlerByHandler =| handler |{
        return io.vertx.core.http.HttpServerRequest.handler()
}
    # io.vertx.core.http.HttpServerRequest pause() 
function pause ={
        return io.vertx.core.http.HttpServerRequest.pause()
}
    # io.vertx.core.http.HttpServerRequest resume() 
function resume ={
        return io.vertx.core.http.HttpServerRequest.resume()
}
    # io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.http.HttpServerRequest.endHandler()
}
    # io.vertx.core.http.HttpVersion version() 
function version ={
        return io.vertx.core.http.HttpVersion.version()
}
    # io.vertx.core.http.HttpMethod method() 
function method ={
        return io.vertx.core.http.HttpMethod.method()
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
    # io.vertx.core.http.HttpServerResponse response() 
function response ={
        return io.vertx.core.http.HttpServerResponse.response()
}
    # io.vertx.core.MultiMap headers() 
function headers ={
        return io.vertx.core.MultiMap.headers()
}
    # java.lang.String getHeader(java.lang.String headerName) 
function getHeaderByHeaderName =| headerName |{
        return java.lang.String.getHeader()
}
    # io.vertx.core.MultiMap params() 
function params ={
        return io.vertx.core.MultiMap.params()
}
    # java.lang.String getParam(java.lang.String paramName) 
function getParamByParamName =| paramName |{
        return java.lang.String.getParam()
}
    # io.vertx.core.net.SocketAddress remoteAddress() 
function remoteAddress ={
        return io.vertx.core.net.SocketAddress.remoteAddress()
}
    # io.vertx.core.net.SocketAddress localAddress() 
function localAddress ={
        return io.vertx.core.net.SocketAddress.localAddress()
}
    # java.lang.String absoluteURI() 
function absoluteURI ={
        return java.lang.String.absoluteURI()
}
    # io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
function bodyHandlerByBodyHandler =| bodyHandler |{
        return io.vertx.core.http.HttpServerRequest.bodyHandler()
}
    # io.vertx.core.net.NetSocket netSocket() 
function netSocket ={
        return io.vertx.core.net.NetSocket.netSocket()
}
    # io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) 
function setExpectMultipartByExpect =| expect |{
        return io.vertx.core.http.HttpServerRequest.setExpectMultipart()
}
    # boolean isExpectMultipart() 
function isExpectMultipart ={
        return boolean.isExpectMultipart()
}
    # io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) 
function uploadHandlerByUploadHandler =| uploadHandler |{
        return io.vertx.core.http.HttpServerRequest.uploadHandler()
}
    # io.vertx.core.MultiMap formAttributes() 
function formAttributes ={
        return io.vertx.core.MultiMap.formAttributes()
}
    # java.lang.String getFormAttribute(java.lang.String attributeName) 
function getFormAttributeByAttributeName =| attributeName |{
        return java.lang.String.getFormAttribute()
}
    # io.vertx.core.http.ServerWebSocket upgrade() 
function upgrade ={
        return io.vertx.core.http.ServerWebSocket.upgrade()
}
    # boolean isEnded() 
function isEnded ={
        return boolean.isEnded()
}
