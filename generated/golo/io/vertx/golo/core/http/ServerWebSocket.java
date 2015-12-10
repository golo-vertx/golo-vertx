package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.http.ServerWebSocket 
public class ServerWebSocket { 

private io.vertx.core.http.ServerWebSocket delegate; 
public ServerWebSocket(Object delegate) { 
    this.delegate = (io.vertx.core.http.ServerWebSocket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
// TypeParams: [] 
public boolean writeQueueFull() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.writeQueueFull(); 
}
// java.lang.String binaryHandlerID() 
// TypeParams: [] 
public String binaryHandlerID() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
// TypeParams: [] 
public String textHandlerID() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.textHandlerID(); 
}
// void close() 
// TypeParams: [] 
public void close() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    this.delegate.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
// TypeParams: [] 
public SocketAddress remoteAddress() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.net.SocketAddress localAddress() 
// TypeParams: [] 
public SocketAddress localAddress() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public ServerWebSocket exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    THROWABLE   
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
// TypeParams: [] 
public ServerWebSocket handler(Handler<Buffer> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket pause() 
// TypeParams: [] 
public ServerWebSocket pause() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket resume() 
// TypeParams: [] 
public ServerWebSocket resume() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public ServerWebSocket endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public ServerWebSocket write(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public ServerWebSocket setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public ServerWebSocket drainHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
// TypeParams: [] 
public ServerWebSocket writeFrame(WebSocketFrame frame) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.writeFrame(frame), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text) 
// TypeParams: [] 
public ServerWebSocket writeFinalTextFrame(String text) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.writeFinalTextFrame(text), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public ServerWebSocket writeFinalBinaryFrame(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.writeFinalBinaryFrame(data), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public ServerWebSocket writeBinaryMessage(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.writeBinaryMessage(data), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public ServerWebSocket closeHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
// TypeParams: [] 
public ServerWebSocket frameHandler(Handler<WebSocketFrame> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    return InternalHelper.safeCreate(this.delegate.frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
                          public void handle(io.vertx.core.http.WebSocketFrame event) {
handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
                          }
                        }), io.vertx.golo.core.http.ServerWebSocket.class); 
}
// java.lang.String uri() 
// TypeParams: [] 
public String uri() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.uri(); 
}
// java.lang.String path() 
// TypeParams: [] 
public String path() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.path(); 
}
// java.lang.String query() 
// TypeParams: [] 
public String query() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.query(); 
}
// io.vertx.core.MultiMap headers() 
// TypeParams: [] 
public MultiMap headers() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// void reject() 
// TypeParams: [] 
public void reject() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    this.delegate.reject(); 
}
}
