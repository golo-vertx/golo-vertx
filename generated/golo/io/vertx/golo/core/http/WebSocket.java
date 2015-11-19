package io.vertx.golo.core.Http;

import io.vertx.core.http.WebSocketBase;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.WebSocketFrame;
import io.vertx.core.net.SocketAddress;
public class WebSocket { 

private io.vertx.core.http.WebSocket originalInstance;// boolean writeQueueFull() 
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
// io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.http.WebSocket pause() 
public io.vertx.core.http.WebSocket pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.WebSocket resume() 
public io.vertx.core.http.WebSocket resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
// io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data) {
        return originalInstance.write(); 
}
// io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(); 
}
// io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(); 
}
// io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) {
        return originalInstance.writeFrame(); 
}
// io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text) 
public io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text) {
        return originalInstance.writeFinalTextFrame(); 
}
// io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) {
        return originalInstance.writeFinalBinaryFrame(); 
}
// io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) {
        return originalInstance.writeBinaryMessage(); 
}
// io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.closeHandler(); 
}
// io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) {
        return originalInstance.frameHandler(); 
}
}
