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
        return delegate.writeQueueFull(); 
}
// java.lang.String binaryHandlerID() 
public String binaryHandlerID() {
        return delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public String textHandlerID() {
        return delegate.textHandlerID(); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public SocketAddress remoteAddress() {
        return InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress localAddress() {
        return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket pause() 
public ServerWebSocket pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket resume() 
public ServerWebSocket resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data) 
public ServerWebSocket write(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize) 
public ServerWebSocket setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) {
        return InternalHelper.safeCreate(this.delegate.writeFrame(frame), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text) 
public ServerWebSocket writeFinalTextFrame(java.lang.String text) {
        return InternalHelper.safeCreate(this.delegate.writeFinalTextFrame(text), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.writeFinalBinaryFrame(data), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.writeBinaryMessage(data), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) {
        return InternalHelper.safeCreate(this.delegate.frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
                          public void handle(io.vertx.core.http.WebSocketFrame event) {
handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
                          }
                        }), io.vertx.golo.core.http.ServerWebSocket.class); 
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
// io.vertx.core.MultiMap headers() 
public MultiMap headers() {
        return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// void reject() 
public void reject() {
        delegate.reject(); 
}
}
