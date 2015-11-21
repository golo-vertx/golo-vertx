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
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.http.HttpServerRequest pause() 
public io.vertx.core.http.HttpServerRequest pause() {
        return delegate.pause(); 
}
// io.vertx.core.http.HttpServerRequest resume() 
public io.vertx.core.http.HttpServerRequest resume() {
        return delegate.resume(); 
}
// io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// io.vertx.core.http.HttpVersion version() 
public io.vertx.core.http.HttpVersion version() {
        return delegate.version(); 
}
// io.vertx.core.http.HttpMethod method() 
public io.vertx.core.http.HttpMethod method() {
        return delegate.method(); 
}
// java.lang.String uri() 
public java.lang.String uri() {
        return delegate.uri(); 
}
// java.lang.String path() 
public java.lang.String path() {
        return delegate.path(); 
}
// java.lang.String query() 
public java.lang.String query() {
        return delegate.query(); 
}
// io.vertx.core.http.HttpServerResponse response() 
public io.vertx.core.http.HttpServerResponse response() {
        return delegate.response(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return delegate.headers(); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public java.lang.String getHeader(java.lang.String headerName) {
        return delegate.getHeader(headerName); 
}
// io.vertx.core.MultiMap params() 
public io.vertx.core.MultiMap params() {
        return delegate.params(); 
}
// java.lang.String getParam(java.lang.String paramName) 
public java.lang.String getParam(java.lang.String paramName) {
        return delegate.getParam(paramName); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return delegate.localAddress(); 
}
// java.lang.String absoluteURI() 
public java.lang.String absoluteURI() {
        return delegate.absoluteURI(); 
}
// io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) {
        return delegate.bodyHandler(bodyHandler); 
}
// io.vertx.core.net.NetSocket netSocket() 
public io.vertx.core.net.NetSocket netSocket() {
        return delegate.netSocket(); 
}
// io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) 
public io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) {
        return delegate.setExpectMultipart(expect); 
}
// boolean isExpectMultipart() 
public boolean isExpectMultipart() {
        return delegate.isExpectMultipart(); 
}
// io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) 
public io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) {
        return delegate.uploadHandler(uploadHandler); 
}
// io.vertx.core.MultiMap formAttributes() 
public io.vertx.core.MultiMap formAttributes() {
        return delegate.formAttributes(); 
}
// java.lang.String getFormAttribute(java.lang.String attributeName) 
public java.lang.String getFormAttribute(java.lang.String attributeName) {
        return delegate.getFormAttribute(attributeName); 
}
// io.vertx.core.http.ServerWebSocket upgrade() 
public io.vertx.core.http.ServerWebSocket upgrade() {
        return delegate.upgrade(); 
}
// boolean isEnded() 
public boolean isEnded() {
        return delegate.isEnded(); 
}
}
