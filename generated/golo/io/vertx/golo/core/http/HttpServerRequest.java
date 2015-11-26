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
public io.vertx.core.http.HttpServerRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.http.HttpServerRequest)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return (io.vertx.core.http.HttpServerRequest)delegate.handler(handler); 
}
// io.vertx.core.http.HttpServerRequest pause() 
public io.vertx.core.http.HttpServerRequest pause() {
        return (io.vertx.core.http.HttpServerRequest)delegate.pause(); 
}
// io.vertx.core.http.HttpServerRequest resume() 
public io.vertx.core.http.HttpServerRequest resume() {
        return (io.vertx.core.http.HttpServerRequest)delegate.resume(); 
}
// io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.http.HttpServerRequest)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.HttpVersion version() 
public io.vertx.core.http.HttpVersion version() {
        return (io.vertx.core.http.HttpVersion)delegate.version(); 
}
// io.vertx.core.http.HttpMethod method() 
public io.vertx.core.http.HttpMethod method() {
        return (io.vertx.core.http.HttpMethod)delegate.method(); 
}
// java.lang.String uri() 
public java.lang.String uri() {
        return (java.lang.String)delegate.uri(); 
}
// java.lang.String path() 
public java.lang.String path() {
        return (java.lang.String)delegate.path(); 
}
// java.lang.String query() 
public java.lang.String query() {
        return (java.lang.String)delegate.query(); 
}
// io.vertx.core.http.HttpServerResponse response() 
public io.vertx.core.http.HttpServerResponse response() {
        return (io.vertx.core.http.HttpServerResponse)delegate.response(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return (io.vertx.core.MultiMap)delegate.headers(); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public java.lang.String getHeader(java.lang.String headerName) {
        return (java.lang.String)delegate.getHeader(headerName); 
}
// io.vertx.core.MultiMap params() 
public io.vertx.core.MultiMap params() {
        return (io.vertx.core.MultiMap)delegate.params(); 
}
// java.lang.String getParam(java.lang.String paramName) 
public java.lang.String getParam(java.lang.String paramName) {
        return (java.lang.String)delegate.getParam(paramName); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.localAddress(); 
}
// java.lang.String absoluteURI() 
public java.lang.String absoluteURI() {
        return (java.lang.String)delegate.absoluteURI(); 
}
// io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) {
        return (io.vertx.core.http.HttpServerRequest)delegate.bodyHandler(bodyHandler); 
}
// io.vertx.core.net.NetSocket netSocket() 
public io.vertx.core.net.NetSocket netSocket() {
        return (io.vertx.core.net.NetSocket)delegate.netSocket(); 
}
// io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) 
public io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) {
        return (io.vertx.core.http.HttpServerRequest)delegate.setExpectMultipart(expect); 
}
// boolean isExpectMultipart() 
public boolean isExpectMultipart() {
        return (boolean)delegate.isExpectMultipart(); 
}
// io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) 
public io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) {
        return (io.vertx.core.http.HttpServerRequest)delegate.uploadHandler(uploadHandler); 
}
// io.vertx.core.MultiMap formAttributes() 
public io.vertx.core.MultiMap formAttributes() {
        return (io.vertx.core.MultiMap)delegate.formAttributes(); 
}
// java.lang.String getFormAttribute(java.lang.String attributeName) 
public java.lang.String getFormAttribute(java.lang.String attributeName) {
        return (java.lang.String)delegate.getFormAttribute(attributeName); 
}
// io.vertx.core.http.ServerWebSocket upgrade() 
public io.vertx.core.http.ServerWebSocket upgrade() {
        return (io.vertx.core.http.ServerWebSocket)delegate.upgrade(); 
}
// boolean isEnded() 
public boolean isEnded() {
        return (boolean)delegate.isEnded(); 
}
}
