package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.http.WebSocketBase 
public class WebSocketBase { 

private io.vertx.core.http.WebSocketBase delegate; 
public WebSocketBase(Object delegate) { 
    this.delegate = (io.vertx.core.http.WebSocketBase)delegate; 
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
// io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public WebSocketBase exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    THROWABLE   
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
// TypeParams: [] 
public WebSocketBase handler(Handler<Buffer> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase pause() 
// TypeParams: [] 
public WebSocketBase pause() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase resume() 
// TypeParams: [] 
public WebSocketBase resume() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public WebSocketBase endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public WebSocketBase write(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public WebSocketBase setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public WebSocketBase drainHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
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
// io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) 
// TypeParams: [] 
public WebSocketBase writeFrame(WebSocketFrame frame) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.writeFrame(frame), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text) 
// TypeParams: [] 
public WebSocketBase writeFinalTextFrame(String text) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.writeFinalTextFrame(text), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public WebSocketBase writeFinalBinaryFrame(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.writeFinalBinaryFrame(data), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public WebSocketBase writeBinaryMessage(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.writeBinaryMessage(data), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public WebSocketBase closeHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
// TypeParams: [] 
public WebSocketBase frameHandler(Handler<WebSocketFrame> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    return InternalHelper.safeCreate(this.delegate.frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
                          public void handle(io.vertx.core.http.WebSocketFrame event) {
handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
                          }
                        }), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
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
}
