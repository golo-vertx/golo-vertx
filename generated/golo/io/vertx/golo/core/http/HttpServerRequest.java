package io.vertx.golo.core.Http;

import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.http.HttpServerFileUpload;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.MultiMap;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.net.NetSocket;
public class HttpServerRequest { 

private io.vertx.core.http.HttpServerRequest originalInstance;// io.vertx.core.http.HttpServerRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpServerRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.http.HttpServerRequest pause() 
public io.vertx.core.http.HttpServerRequest pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.HttpServerRequest resume() 
public io.vertx.core.http.HttpServerRequest resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
// io.vertx.core.http.HttpVersion version() 
public io.vertx.core.http.HttpVersion version() {
        return originalInstance.version(); 
}
// io.vertx.core.http.HttpMethod method() 
public io.vertx.core.http.HttpMethod method() {
        return originalInstance.method(); 
}
// java.lang.String uri() 
public java.lang.String uri() {
        return originalInstance.uri(); 
}
// java.lang.String path() 
public java.lang.String path() {
        return originalInstance.path(); 
}
// java.lang.String query() 
public java.lang.String query() {
        return originalInstance.query(); 
}
// io.vertx.core.http.HttpServerResponse response() 
public io.vertx.core.http.HttpServerResponse response() {
        return originalInstance.response(); 
}
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return originalInstance.headers(); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public java.lang.String getHeader(java.lang.String headerName) {
        return originalInstance.getHeader(); 
}
// io.vertx.core.MultiMap params() 
public io.vertx.core.MultiMap params() {
        return originalInstance.params(); 
}
// java.lang.String getParam(java.lang.String paramName) 
public java.lang.String getParam(java.lang.String paramName) {
        return originalInstance.getParam(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return originalInstance.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return originalInstance.localAddress(); 
}
// java.lang.String absoluteURI() 
public java.lang.String absoluteURI() {
        return originalInstance.absoluteURI(); 
}
// io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) {
        return originalInstance.bodyHandler(); 
}
// io.vertx.core.net.NetSocket netSocket() 
public io.vertx.core.net.NetSocket netSocket() {
        return originalInstance.netSocket(); 
}
// io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) 
public io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) {
        return originalInstance.setExpectMultipart(); 
}
// boolean isExpectMultipart() 
public boolean isExpectMultipart() {
        return originalInstance.isExpectMultipart(); 
}
// io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) 
public io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) {
        return originalInstance.uploadHandler(); 
}
// io.vertx.core.MultiMap formAttributes() 
public io.vertx.core.MultiMap formAttributes() {
        return originalInstance.formAttributes(); 
}
// java.lang.String getFormAttribute(java.lang.String attributeName) 
public java.lang.String getFormAttribute(java.lang.String attributeName) {
        return originalInstance.getFormAttribute(); 
}
// io.vertx.core.http.ServerWebSocket upgrade() 
public io.vertx.core.http.ServerWebSocket upgrade() {
        return originalInstance.upgrade(); 
}
// boolean isEnded() 
public boolean isEnded() {
        return originalInstance.isEnded(); 
}
}
