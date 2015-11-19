package io.vertx.golo.core.Http;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.http.WebSocketFrame;
import io.vertx.core.net.SocketAddress;
public class WebSocketBase { 

private io.vertx.core.http.WebSocketBase originalInstance;// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.http.WebSocketBase pause() 
public io.vertx.core.http.WebSocketBase pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.WebSocketBase resume() 
public io.vertx.core.http.WebSocketBase resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
// io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data) {
        return originalInstance.write(); 
}
// io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(); 
}
// io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(); 
}
// java.lang.String binaryHandlerID() 
public java.lang.String binaryHandlerID() {
        return originalInstance.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public java.lang.String textHandlerID() {
        return originalInstance.textHandlerID(); 
}
// io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) {
        return originalInstance.writeFrame(); 
}
// io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text) 
public io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text) {
        return originalInstance.writeFinalTextFrame(); 
}
// io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) {
        return originalInstance.writeFinalBinaryFrame(); 
}
// io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) {
        return originalInstance.writeBinaryMessage(); 
}
// io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.closeHandler(); 
}
// io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) {
        return originalInstance.frameHandler(); 
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
}
