package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.http.WebSocket 
public class WebSocket { 

private io.vertx.core.http.WebSocket delegate; 
public WebSocket(Object delegate) { 
    this.delegate = (io.vertx.core.http.WebSocket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
// TypeParams: [] 
public boolean writeQueueFull() {
        //param classes(remove later):  
    return delegate.writeQueueFull(); 
}
// java.lang.String binaryHandlerID() 
// TypeParams: [] 
public String binaryHandlerID() {
        //param classes(remove later):  
    return delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
// TypeParams: [] 
public String textHandlerID() {
        //param classes(remove later):  
    return delegate.textHandlerID(); 
}
// void close() 
// TypeParams: [] 
public void close() {
        //param classes(remove later):  
    delegate.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
// TypeParams: [] 
public SocketAddress remoteAddress() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.net.SocketAddress localAddress() 
// TypeParams: [] 
public SocketAddress localAddress() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public WebSocket exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
// TypeParams: [] 
public WebSocket handler(Handler<Buffer> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket pause() 
// TypeParams: [] 
public WebSocket pause() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket resume() 
// TypeParams: [] 
public WebSocket resume() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public WebSocket endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public WebSocket write(Buffer data) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public WebSocket setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public WebSocket drainHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
// TypeParams: [] 
public WebSocket writeFrame(WebSocketFrame frame) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.writeFrame(frame), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text) 
// TypeParams: [] 
public WebSocket writeFinalTextFrame(String text) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.writeFinalTextFrame(text), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public WebSocket writeFinalBinaryFrame(Buffer data) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.writeFinalBinaryFrame(data), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public WebSocket writeBinaryMessage(Buffer data) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.writeBinaryMessage(data), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public WebSocket closeHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.http.WebSocket.class); 
}
// io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
// TypeParams: [] 
public WebSocket frameHandler(Handler<WebSocketFrame> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
                          public void handle(io.vertx.core.http.WebSocketFrame event) {
handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
                          }
                        }), io.vertx.golo.core.http.WebSocket.class); 
}
}
