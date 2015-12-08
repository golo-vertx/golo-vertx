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
public HttpServerRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpServerRequest.class); 
}
// io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerRequest.class); 
}
// io.vertx.core.http.HttpServerRequest pause() 
public HttpServerRequest pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpServerRequest.class); 
}
// io.vertx.core.http.HttpServerRequest resume() 
public HttpServerRequest resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpServerRequest.class); 
}
// io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpServerRequest.class); 
}
// io.vertx.core.http.HttpVersion version() 
public HttpVersion version() {
        return delegate.version(); 
}
// io.vertx.core.http.HttpMethod method() 
public HttpMethod method() {
        return delegate.method(); 
}
// java.lang.String uri() 
public String uri() {
        return delegate.uri(); 
}
// java.lang.String path() 
public String path() {
        return delegate.path(); 
}
// java.lang.String query() 
public String query() {
        return delegate.query(); 
}
// io.vertx.core.http.HttpServerResponse response() 
public HttpServerResponse response() {
        return InternalHelper.safeCreate(this.delegate.response(), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.MultiMap headers() 
public MultiMap headers() {
        return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// java.lang.String getHeader(java.lang.String headerName) 
public String getHeader(java.lang.String headerName) {
        return delegate.getHeader(headerName); 
}
// io.vertx.core.MultiMap params() 
public MultiMap params() {
        return InternalHelper.safeCreate(this.delegate.params(), io.vertx.golo.core.MultiMap.class); 
}
// java.lang.String getParam(java.lang.String paramName) 
public String getParam(java.lang.String paramName) {
        return delegate.getParam(paramName); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public SocketAddress remoteAddress() {
        return InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress localAddress() {
        return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// java.lang.String absoluteURI() 
public String absoluteURI() {
        return delegate.absoluteURI(); 
}
// io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
public HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) {
        return InternalHelper.safeCreate(this.delegate.bodyHandler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
bodyHandler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerRequest.class); 
}
// io.vertx.core.net.NetSocket netSocket() 
public NetSocket netSocket() {
        return InternalHelper.safeCreate(this.delegate.netSocket(), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) 
public HttpServerRequest setExpectMultipart(boolean expect) {
        return InternalHelper.safeCreate(this.delegate.setExpectMultipart(expect), io.vertx.golo.core.http.HttpServerRequest.class); 
}
// boolean isExpectMultipart() 
public boolean isExpectMultipart() {
        return delegate.isExpectMultipart(); 
}
// io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) 
public HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) {
        return InternalHelper.safeCreate(this.delegate.uploadHandler(new Handler<io.vertx.core.http.HttpServerFileUpload>() {
                          public void handle(io.vertx.core.http.HttpServerFileUpload event) {
uploadHandler.handle(new io.vertx.golo.core.http.HttpServerFileUpload(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerRequest.class); 
}
// io.vertx.core.MultiMap formAttributes() 
public MultiMap formAttributes() {
        return InternalHelper.safeCreate(this.delegate.formAttributes(), io.vertx.golo.core.MultiMap.class); 
}
// java.lang.String getFormAttribute(java.lang.String attributeName) 
public String getFormAttribute(java.lang.String attributeName) {
        return delegate.getFormAttribute(attributeName); 
}
// io.vertx.core.http.ServerWebSocket upgrade() 
public ServerWebSocket upgrade() {
        return InternalHelper.safeCreate(this.delegate.upgrade(), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// boolean isEnded() 
public boolean isEnded() {
        return delegate.isEnded(); 
}
}
