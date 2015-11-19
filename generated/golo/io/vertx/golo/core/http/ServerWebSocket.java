package io.vertx.golo.core.Http;

import io.vertx.core.http.WebSocketBase;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.MultiMap;
import io.vertx.core.http.WebSocketFrame;
import io.vertx.core.net.SocketAddress;
public class ServerWebSocket { 

private io.vertx.core.http.ServerWebSocket originalInstance;// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// java.lang.String binaryHandlerID() 
public java.lang.String binaryHandlerID() {
        return originalInstance.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public java.lang.String textHandlerID() {
        return originalInstance.textHandlerID(); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return originalInstance.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return originalInstance.localAddress(); 
}
// io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.http.ServerWebSocket pause() 
public io.vertx.core.http.ServerWebSocket pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.ServerWebSocket resume() 
public io.vertx.core.http.ServerWebSocket resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
// io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data) {
        return originalInstance.write(); 
}
// io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(); 
}
// io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(); 
}
// io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) {
        return originalInstance.writeFrame(); 
}
// io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text) 
public io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text) {
        return originalInstance.writeFinalTextFrame(); 
}
// io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) {
        return originalInstance.writeFinalBinaryFrame(); 
}
// io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) {
        return originalInstance.writeBinaryMessage(); 
}
// io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.closeHandler(); 
}
// io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) {
        return originalInstance.frameHandler(); 
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
// io.vertx.core.MultiMap headers() 
public io.vertx.core.MultiMap headers() {
        return originalInstance.headers(); 
}
// void reject() 
public void reject() {
        return originalInstance.reject(); 
}
}
