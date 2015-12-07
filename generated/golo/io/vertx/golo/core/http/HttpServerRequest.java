package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.http.HttpServerFileUpload;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.MultiMap;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.net.NetSocket;
// io.vertx.core.http.HttpServerRequest 
public class HttpServerRequest { 

private io.vertx.core.http.HttpServerRequest delegate; 
public HttpServerRequest(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpServerRequest)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.HttpServerRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpServerRequest {
        return (io.vertx.core.http.HttpServerRequest)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public HttpServerRequest {
        return (io.vertx.core.http.HttpServerRequest)delegate.handler(handler); 
}
// io.vertx.core.http.HttpServerRequest pause() 
public HttpServerRequest {
        return (io.vertx.core.http.HttpServerRequest)delegate.pause(); 
}
// io.vertx.core.http.HttpServerRequest resume() 
public HttpServerRequest {
        return (io.vertx.core.http.HttpServerRequest)delegate.resume(); 
}
// io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpServerRequest {
        return (io.vertx.core.http.HttpServerRequest)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.HttpVersion version() 
public HttpVersion {
        return (io.vertx.core.http.HttpVersion)delegate.version(); 
}
// io.vertx.core.http.HttpMethod method() 
public HttpMethod {
        return (io.vertx.core.http.HttpMethod)delegate.method(); 
}
// java.lang.String uri() 
public String {
        return (java.lang.String)delegate.uri(); 
}
// java.lang.String path() 
public String {
        return (java.lang.String)delegate.path(); 
}
// java.lang.String query() 
public String {
        return (java.lang.String)delegate.query(); 
}
// io.vertx.core.http.HttpServerResponse response() 
public HttpServerResponse {
        return (io.vertx.core.http.HttpServerResponse)delegate.response(); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap {
        return (io.vertx.core.MultiMap)delegate.headers(); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public String {
        return (java.lang.String)delegate.getHeader(headerName); 
}
// io.vertx.core.MultiMap params() 
public MultiMap {
        return (io.vertx.core.MultiMap)delegate.params(); 
}
// java.lang.String getParam(java.lang.String paramName) 
public String {
        return (java.lang.String)delegate.getParam(paramName); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public SocketAddress {
        return (io.vertx.core.net.SocketAddress)delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress {
        return (io.vertx.core.net.SocketAddress)delegate.localAddress(); 
}
// java.lang.String absoluteURI() 
public String {
        return (java.lang.String)delegate.absoluteURI(); 
}
// io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public HttpServerRequest {
        return (io.vertx.core.http.HttpServerRequest)delegate.bodyHandler(bodyHandler); 
}
// io.vertx.core.net.NetSocket netSocket() 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.netSocket(); 
}
// io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) 
public HttpServerRequest {
        return (io.vertx.core.http.HttpServerRequest)delegate.setExpectMultipart(expect); 
}
// boolean isExpectMultipart() 
public boolean {
        return (boolean)delegate.isExpectMultipart(); 
}
// io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) 
public HttpServerRequest {
        return (io.vertx.core.http.HttpServerRequest)delegate.uploadHandler(uploadHandler); 
}
// io.vertx.core.MultiMap formAttributes() 
public MultiMap {
        return (io.vertx.core.MultiMap)delegate.formAttributes(); 
}
// java.lang.String getFormAttribute(java.lang.String attributeName) 
public String {
        return (java.lang.String)delegate.getFormAttribute(attributeName); 
}
// io.vertx.core.http.ServerWebSocket upgrade() 
public ServerWebSocket {
        return (io.vertx.core.http.ServerWebSocket)delegate.upgrade(); 
}
// boolean isEnded() 
public boolean {
        return (boolean)delegate.isEnded(); 
}
}
