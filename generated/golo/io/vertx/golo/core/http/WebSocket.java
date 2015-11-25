package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.WebSocketBase;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.WebSocketFrame;
import io.vertx.core.net.SocketAddress;
// io.vertx.core.http.WebSocket 
public class WebSocket { 

private io.vertx.core.http.WebSocket delegate; 
public WebSocket(Object delegate) { 
    this.delegate = (io.vertx.core.http.WebSocket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return delegate.writeQueueFull(); 
}
// java.lang.String binaryHandlerID() 
public java.lang.String binaryHandlerID() {
        return delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public java.lang.String textHandlerID() {
        return delegate.textHandlerID(); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return delegate.localAddress(); 
}
// io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.http.WebSocket pause() 
public io.vertx.core.http.WebSocket pause() {
        return delegate.pause(); 
}
// io.vertx.core.http.WebSocket resume() 
public io.vertx.core.http.WebSocket resume() {
        return delegate.resume(); 
}
// io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data) {
        return delegate.write(data); 
}
// io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize) {
        return delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.drainHandler(handler); 
}
// io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) {
        return delegate.writeFrame(frame); 
}
// io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text) 
public io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text) {
        return delegate.writeFinalTextFrame(text); 
}
// io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) {
        return delegate.writeFinalBinaryFrame(data); 
}
// io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) {
        return delegate.writeBinaryMessage(data); 
}
// io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.closeHandler(handler); 
}
// io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) {
        return delegate.frameHandler(handler); 
}
}
