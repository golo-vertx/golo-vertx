package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.WebSocketBase;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.MultiMap;
import io.vertx.core.http.WebSocketFrame;
import io.vertx.core.net.SocketAddress;
// io.vertx.core.http.ServerWebSocket 
public class ServerWebSocket { 

private io.vertx.core.http.ServerWebSocket delegate; 
public ServerWebSocket(Object delegate) { 
    this.delegate = (io.vertx.core.http.ServerWebSocket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return (boolean)delegate.writeQueueFull(); 
}
// java.lang.String binaryHandlerID() 
public java.lang.String binaryHandlerID() {
        return (java.lang.String)delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public java.lang.String textHandlerID() {
        return (java.lang.String)delegate.textHandlerID(); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.localAddress(); 
}
// io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.http.ServerWebSocket)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return (io.vertx.core.http.ServerWebSocket)delegate.handler(handler); 
}
// io.vertx.core.http.ServerWebSocket pause() 
public io.vertx.core.http.ServerWebSocket pause() {
        return (io.vertx.core.http.ServerWebSocket)delegate.pause(); 
}
// io.vertx.core.http.ServerWebSocket resume() 
public io.vertx.core.http.ServerWebSocket resume() {
        return (io.vertx.core.http.ServerWebSocket)delegate.resume(); 
}
// io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.http.ServerWebSocket)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.http.ServerWebSocket)delegate.write(data); 
}
// io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.http.ServerWebSocket)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.ServerWebSocket)delegate.drainHandler(handler); 
}
// io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) {
        return (io.vertx.core.http.ServerWebSocket)delegate.writeFrame(frame); 
}
// io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text) 
public io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text) {
        return (io.vertx.core.http.ServerWebSocket)delegate.writeFinalTextFrame(text); 
}
// io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.http.ServerWebSocket)delegate.writeFinalBinaryFrame(data); 
}
// io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.http.ServerWebSocket)delegate.writeBinaryMessage(data); 
}
// io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.ServerWebSocket)delegate.closeHandler(handler); 
}
// io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) {
        return (io.vertx.core.http.ServerWebSocket)delegate.frameHandler(handler); 
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
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return (io.vertx.core.MultiMap)delegate.headers(); 
}
// void reject() 
public void reject() {
        delegate.reject(); 
}
}
